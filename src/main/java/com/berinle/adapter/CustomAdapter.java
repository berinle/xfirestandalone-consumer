package com.berinle.adapter;

import java.util.*;
import javax.xml.bind.*;

public class CustomAdapter {

  public static Date parseDate(String s) {
  	System.out.println("in parseDate: " + s);
    return DatatypeConverter.parseDate(s).getTime();
  }
  public static String printDate(Date dt) {
    Calendar cal = new GregorianCalendar();
    cal.setTime(dt);
    return DatatypeConverter.printDate(cal);
  }
}