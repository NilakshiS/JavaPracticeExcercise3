package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WeekDate {
    public String getDates() {
        String dates = "";
        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE dd/MM/yy");
        String first = simpleDateFormat.format(c.getTime());
        c.add(Calendar.DATE,6);
        String last = simpleDateFormat.format(c.getTime());
        return first+" "+last;
    }
}
