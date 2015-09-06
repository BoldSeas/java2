package com.boldseas.unit.test;

import java.util.Date;

/**
 * Created by bykj on 2015/9/6.
 */
public class SystemNowTimeProvider implements TimeProvider {
    public Date getNow(){
        return new Date();
    }
}
