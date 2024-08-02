package yeagor;

/**
 * The Timer class provides methods to measure the time taken for
 * a segment of code to execute in nanoseconds.
 *
 * <p>This class uses {@code System.nanoTime()} to measure time
 * and provides static methods to start and stop the timer,
 * as well as reset its fields.</p>
 */
public class Timer {

    /**
     * The start time in nanoseconds.
     */
    private static long startTime = 0;

    /**
     * The end time in nanoseconds.
     */
    private static long endTime = 0;

    /**
     * Starts the timer by recording the current time in nanoseconds.
     *
     * @return the start time in nanoseconds.
     */
    public static long timerStart() {
        startTime = System.nanoTime();
        return startTime;
    }

    /**
     * Stops the timer by recording the current time in nanoseconds
     * and returns the duration in nanoseconds.
     *
     * <p>This method also resets the start and end times to zero
     * after calculating the duration.</p>
     *
     * @return the duration in nanoseconds between the start and end times.
     */
    public static long timerEnd() {
        endTime = System.nanoTime();
        long duration = endTime - startTime;
        reset(); // clears all the fields;
        return duration;
    }

    /**
     * Resets the start and end times to zero.
     */
    private static void reset() {
        startTime = 0;
        endTime = 0;
    }
}
