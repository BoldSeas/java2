package com.boldseas.unit.test;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;
import java.util.spi.TimeZoneNameProvider;

/**
 * Created by bykj on 2015/9/6.
 */
public class Clock {

    private final TimeProvider timeProvider;

    public Clock(){
        this(new SystemNowTimeProvider());

    }

    public Clock(TimeProvider timeProvider){
        this.timeProvider = timeProvider;
    }

    public String getCurrentTimeString(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(timeProvider.getNow());
    }

}
