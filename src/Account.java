import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    /*//原子类保证并发
    private final AtomicInteger balance = new AtomicInteger(0);


    // 原子类操作
    public void deposit (int money) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        this.balance.addAndGet(money);
    }

    public AtomicInteger getBalance () {
        return this.balance;
    }


    public static void main(String[] args) throws Exception {
        Account account = new Account();
        Thread[] threads = new Thread[100];
        for (int i = 0;i < 100;++i) {
            Thread t = new Thread() {
                public void run () {
                    account.deposit(1);
                }
            };
            threads[i] = t;
            t.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("balance: " + account.getBalance());
    }*/

    private volatile int balance;
    private final Lock lock = new ReentrantLock();


    // 加锁
    public void deposit (int money) {
        // 必须放在try外面，否则导致finally无法释放锁
        lock.lock();
        try {
            this.balance += money;
        } finally {
            lock.unlock();
        }
    }

    public int getBalance () {
        return this.balance;
    }

    // Runnable方式
    /*public static void main(String[] args) throws Exception {
        Account account = new Account();
        Thread[] threads = new Thread[100];
        for (int i = 0;i < 100;++i) {
            Thread t = new Thread(new MyRunnable(account));
            threads[i] = t;
            t.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("balance: " + account.getBalance());
    }*/

    //Callable方式
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        Thread[] threads = new Thread[100];
        FutureTask<String>[] tasks = new FutureTask[100];
        for (int i = 0;i < 100;++i) {
            tasks[i] = new FutureTask<String>(new MyCallable(account));
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        // 可选(打印结果)
        for (int i =0;i < 100;++i) {
            // 阻塞到获取结果完成
            String result = tasks[i].get();
            System.out.println("线程-" + i + "结果: " + result);
        }
        System.out.println("balance: " + account.getBalance());
    }
}
