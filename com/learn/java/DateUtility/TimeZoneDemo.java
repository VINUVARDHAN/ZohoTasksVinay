//$Id$
package com.learn.java.DateUtility;

import java.util.Date;
import java.util.TimeZone;

public class TimeZoneDemo extends TimeZone{
public static void main(String[] args) {
    TimeZone t = new TimeZoneDemo();
    System.out.println(t.getAvailableIDs());
    
}

@Override
public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
    // TODO Auto-generated method stub
    return 0;
}

@Override
public void setRawOffset(int offsetMillis) {
    // TODO Auto-generated method stub
    
}

@Override
public int getRawOffset() {
    // TODO Auto-generated method stub
    return 0;
}

@Override
public boolean useDaylightTime() {
    // TODO Auto-generated method stub
    return false;
}

@Override
public boolean inDaylightTime(Date date) {
    // TODO Auto-generated method stub
    return false;
}
}
