package com.boldseas.unit.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bykj on 2015/9/6.
 */
public class DateFormate {

    public String formate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        String ret =sdf.format(date);
        ret = ret.substring(0,ret.length()-1);
        System.out.print(ret);
        return ret;
    }
}
