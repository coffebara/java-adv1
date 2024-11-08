package thread.start.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        //main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId()=" + mainThread.threadId());
        // ThreadName 은 중복될 수 있음
        log("mainThread.threadName()=" + mainThread.getName());
        // 우선 순위 기본 5, 높을 수록 더 많이 실행
        log("mainThread.threadPriority()=" + mainThread.getPriority());
        log("mainThread.threadThreadGroup()=" + mainThread.getThreadGroup());
        // 실행될 수 있는 상태
        log("mainThread.threadState()=" + mainThread.getState());


        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId()=" + myThread.threadId());
        // ThreadName 은 중복될 수 있음
        log("myThread.threadName()=" + myThread.getName());
        // 우선 순위 기본 5, 높을 수록 더 많이 실행
        log("myThread.threadPriority()=" + myThread.getPriority());
        log("myThread.threadThreadGroup()=" + myThread.getThreadGroup());
        // 실행될 수 있는 상태
        log("myThread.threadState()=" + myThread.getState());

    }
}
