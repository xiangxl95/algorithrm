import java.util.*;
import java.util.concurrent.*;

public class ThreadTest {
    private static ExecutorService THREAD_POOL = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        List<Future<Integer>> futureList = new ArrayList<>();
        for(int i = 0;i < 10; ++i) {
            futureList.add(submitCal(() -> cal()));
        }
        for(Future<Integer> task : futureList) {
            try {
                Integer result = task.get();
                System.out.println(result);
            }  catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static Future<Integer> submitCal(Callable<Integer> callable) {
        return THREAD_POOL.submit(() -> {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static Integer cal() {
        return 1 + 1;
    }

    public class RunnableTest implements Runnable {

        @java.lang.Override
        public void run() {

        }
    }

    public class CallableTest implements Callable {

        @java.lang.Override
        public Object call() throws Exception {
            return null;
        }
    }

}
