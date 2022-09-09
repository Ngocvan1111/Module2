package ss4_class_and_object.excercise;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start: " + stopWatch.start());
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        System.out.println("Stop: " + stopWatch.stop());
        System.out.print("Total time: " + stopWatch.getElapsedTime());


    }


}
