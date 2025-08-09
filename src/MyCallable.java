import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private final Account account;

    public MyCallable(Account account) {
        this.account = account;
    }

    public String call() {
        account.deposit(1);
        return "success deposit balance :" + account.getBalance();
    }
}
