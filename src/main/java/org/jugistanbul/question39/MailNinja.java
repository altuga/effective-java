package org.jugistanbul.question39;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
TODO:
 - Run the app
 - Problem : Speed up the application, sendMail() method is too slow
 - call sendMail method in an async way with Thread
*/
public class MailNinja {

    private static ExecutorService executorService = Executors.newFixedThreadPool(6);
    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            // call sendMail method in an async way with Thread
            int finalI = i ;
            Runnable runnable = () -> sendMail(finalI);
            executorService.submit(runnable);
        }
        executorService.shutdown();

    }

    public static void sendMail(int counter) {
        try {
            Thread.sleep(200);
            System.out.println(" Mail send ... " + counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
