package org.acalltoauction.services;

import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

public class Scheduler {
    try{
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
    }catch(SchedulerException e){
        e.printStackTrace();
    }
}
