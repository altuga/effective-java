package org.jugistanbul.question38;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/** TODO
* How long would you expect this program to run?
*/
public class StopThread {
    //private static volatile boolean stopRequested;
    //private static AtomicBoolean stopRequested = new AtomicBoolean();
    private static boolean stopRequested;

    /*
    public synchronized static boolean isStopRequested() {
        return stopRequested;
    }

    public synchronized static void setStopRequested(boolean stopRequested) {
        StopThread.stopRequested = stopRequested;
    }*/

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            int i = 0;
            while (!stopRequested)
                i++;
            System.out.println("Finito");
        });
        backgroundThread.setDaemon(false);
        backgroundThread.start();


        System.out.println(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

    }
}