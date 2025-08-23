import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTicketSystem {
    // 初始化票数为 3
    private static final AtomicInteger tickets = new AtomicInteger(3);

    public static void main(String[] args) {
        // 创建 5 个线程模拟 5 个用户抢票
        for (int i = 1; i <= 5; i++) {
            new Thread(() -> {
                while (true) {
                    int current = tickets.get(); // 获取当前票数
                    if (current <= 0) {
                        System.out.println(Thread.currentThread().getName() + " 抢票失败，票已售罄");
                        break;
                    }
                    // CAS 操作：比较并交换（当前值是否为 current？是则减 1）
                    if (tickets.compareAndSet(current, current - 1)) {
                        System.out.println(Thread.currentThread().getName() + " 抢票成功！剩余票数: " + (current - 1));
                        break;
                    }
                    // CAS 失败则重试（其他线程已修改票数）
                    System.out.println(Thread.currentThread().getName() + " 抢票冲突，重试中...");
                }
            }, "用户-" + i).start();
        }
    }
}