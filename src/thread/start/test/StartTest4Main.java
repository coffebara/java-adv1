package thread.start.test;

import static util.MyLogger.log;

// 개인 풀이
public class StartTest4Main {
    public static void main(String[] args) {

        customThread("A", 1000).start();
        customThread("B", 500).start();
    }

    public static Thread customThread(String txt, int millis) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log(txt);
                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        return thread;
    }
}
