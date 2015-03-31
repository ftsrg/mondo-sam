package eu.mondo.sam.core.metrics;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class TimerMetric extends BenchmarkMetric {

    private long elapsedTime;

    private Stopwatch stopwatch;

    public TimerMetric(String name) {
	super(name);
    }

    @Override
    public String getValue() {
	elapsedTime = stopwatch.elapsed(TimeUnit.NANOSECONDS);
	return Long.toString(elapsedTime);
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
