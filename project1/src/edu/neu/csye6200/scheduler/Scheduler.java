package edu.neu.csye6200.scheduler;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import edu.neu.csye6200.Student;


public final class Scheduler{

	private final ScheduledExecutorService scheduler;
	private final long initialDelay;
	private final long delayBetweenRuns;
	private final long shutdownAfter;

	private static final int NUM_THREADS = 1;
	private static final boolean DONT_INTERRUPT_IF_RUNNING = false;


//	/** Run the example. */
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Scheduler started.");
//		//TODO calculate future date 
//		//Date futureDate = ;// 
//		//long startTime = futureDate.getTime() - System.currentTimeMillis();
//		ScheduleSomething task = new ScheduleSomething(3, 1, 20);
//		task.activateSchduler();
//
//	
//		System.out.println("Scheduler ended.");
//	}

	Scheduler(long initialDelay, long delayBetweenBeeps, long stopAfter) {
		this.initialDelay = initialDelay;
		this.delayBetweenRuns = delayBetweenBeeps;
		this.shutdownAfter = stopAfter;
		this.scheduler = Executors.newScheduledThreadPool(NUM_THREADS);
	}

	void activateSchduler() {
		Runnable startTask = new ScheduleTask();
		ScheduledFuture<?> soundAlarmFuture = scheduler.scheduleWithFixedDelay(startTask, initialDelay,
				delayBetweenRuns, TimeUnit.DAYS);
		Runnable stopTask = new StopScheduledTask(soundAlarmFuture);
		scheduler.schedule(stopTask, shutdownAfter, TimeUnit.DAYS);
	}

	private static final class ScheduleTask implements Runnable {
		private int count;

		@Override
		public void run() {
			//TODO get list of students whose registration needs to be renewed 
			
			List<Student> students = new ArrayList<>();
			//TODO send them email
			++count;
			System.out.println("Counting " + count);
		}

	}

	private final class StopScheduledTask implements Runnable {
		private ScheduledFuture<?> schedFuture;

		StopScheduledTask(ScheduledFuture<?> schedFuture) {
			this.schedFuture = schedFuture;
		}

		@Override
		public void run() {
			System.out.println("Stopping.");
			schedFuture.cancel(DONT_INTERRUPT_IF_RUNNING);
			//for cleanup
			scheduler.shutdown();
		}

	}
}