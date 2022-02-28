package com.colinapp.winter.config;

import com.colinapp.winter.job.ColinJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    private static String JOB_GROUP_NAME = "COLIN_JOBGROUP_NAME";
    private  static String TRIGGER_GROUP_NAME = "COLIN_TRIGGERGROUP_NAME";

    @Bean
    public JobDetail ColinJobDetail(){
        JobDetail jobDetail = JobBuilder.newJob(ColinJob.class)
                .withIdentity("ColinJob",JOB_GROUP_NAME)
                .storeDurably()
                .build();
        return jobDetail;
    }

    public Trigger ColinJobTrigger(){
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        Trigger trigger = TriggerBuilder.newTrigger()
                .forJob(ColinJobDetail())
                .withIdentity("ColinJobTrigger",TRIGGER_GROUP_NAME)
                .withSchedule(cronScheduleBuilder)
                .build();
        return  trigger;

    }
}
