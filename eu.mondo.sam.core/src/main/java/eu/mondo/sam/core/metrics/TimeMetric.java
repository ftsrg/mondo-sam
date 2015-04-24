package eu.mondo.sam.core.metrics;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

/**
 * Defines an implementation for measuring time. The inherited getValue method
 * provides the exact value of the metric. The dimension of time is nanosecond
 * by default.
 * 
 * @author Zsolt Kovari
 *
 */
public class TimerMetric extends BenchmarkMetric {

    /**
     * Responsible for measuring time. The operation of this class is based on
     * the StopWatch functionality.
     */
    private Stopwatch stopwatch;

    /**
     * Indicates the dimension of the measured metric. Default is nanosecond.
     */
    private static TimeUnit timeUnit = TimeUnit.NANOSECONDS;

    /**
     * Initializes the metricName variable after the given parameter.
     * 
     * @param name
     *            Name of the current BenchmarkMetric implementation.
     */
    public TimerMetric(String name) {
	super(name);
    }

    /**
     * Provides the exact value of measurement.
     * 
     * @return the value of measured time as a String.
     */
    @Override
    public String getValue() {
	long elapsedTime = stopwatch.elapsed(timeUnit);
	return Long.toString(elapsedTime);
    }

    /**
     * Adjusts the dimension of the measured time based on the given parameter.
     * 
     * @param timeUnit
     *            represents the dimension, e.g. TimeUnit.MILLISECONDS.
     * @see TimeUnit
     */
    public static void setTimeUnit(TimeUnit timeUnit) {
	TimerMetric.timeUnit = timeUnit;
    }

    /**
     * Starts to measure time. Must be called before invoke getValue.
     */
    public void startMeasure() {
	stopwatch = Stopwatch.createStarted();
    }

    /**
     * Stops the measurement. Optional but recommended to use.
     */
    public void stopMeasure() {
	stopwatch.stop();
    }

}
