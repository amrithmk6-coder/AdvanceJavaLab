package performancetest;

public class PerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        long start1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("AIET");
        }
        long end1 = System.nanoTime();
        long timeBuffer = end1 - start1;

        long start2 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append("AIET");
        }
        long end2 = System.nanoTime();
        long timeBuilder = end2 - start2;

        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        if (timeBuilder < timeBuffer) {
            System.out.println("StringBuilder is faster and better for single-threaded operations.");
        } else {
            System.out.println("StringBuffer is better in multithreaded environments due to thread safety.");
        }
    }
}