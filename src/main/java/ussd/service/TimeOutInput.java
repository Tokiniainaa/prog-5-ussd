package ussd.service;

import java.util.Scanner;
import java.util.concurrent.*;

public class TimeOutInput {

    public static String getUserInputWithTimeout(int timeoutSeconds) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        });

        try {
            return future.get(timeoutSeconds, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("\n⏳ Connection problem or invalid MMI code.");
            future.cancel(true);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            executor.shutdownNow();
        }
    }
}
