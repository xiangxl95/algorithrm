public class MyRunnable implements Runnable {
    private final Account account;

    public MyRunnable (Account account) {
        this.account = account;
    }

    public void run() {
        account.deposit(1);
    }
}
