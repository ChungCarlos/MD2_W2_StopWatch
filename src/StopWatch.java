import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = new Date().getTime();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public void getElapsedTime() {
        System.out.println((endTime - startTime) + " Elapsed time milliseconds.");
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        stopWatch.stop();
        stopWatch.getElapsedTime();
//      System.out.printf("Elapsed time: %d milliseconds", stopWatch.getElapsedTime());
    }
}
