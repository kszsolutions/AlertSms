package main;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import za.co.alertsms.tasks.AlertTask;

public class Main {

	public static void main(String[] args) throws SchedulerException {
		
		//Job
		JobDetail job = JobBuilder.newJob(AlertTask.class).withIdentity("GetAlertsJob", "Group1").build();
		//Trigger
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("AlertsJob", "Group1").withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever()).build();
		//Schedule it
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job,trigger);
	
	}

}
