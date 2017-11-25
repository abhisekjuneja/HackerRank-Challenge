/**
 * Solution To : "Java Date & Time"
 * Problem Statement: https://goo.gl/R3gzmh
 */

import java.util.Scanner;
import java.util.Calendar;

public class DateAndTime {
 public static String getDay(String day, String month, String year) {
  // Documentation for the Calendar Class: https://goo.gl/d4rs69 
  Calendar calendar = Calendar.getInstance();
  // The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0
  // Hence, 1 is Subtacted from the Month Value to Avoid an 'Off By One' Error 
  calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
  String dayName = "";
  switch (calendar.get(Calendar.DAY_OF_WEEK)) {
   case 1:
    dayName = "SUNDAY";
    break;
   case 2:
    dayName = "MONDAY";
    break;
   case 3:
    dayName = "TUESDAY";
    break;
   case 4:
    dayName = "WEDNESDAY";
    break;
   case 5:
    dayName = "THURSDAY";
    break;
   case 6:
    dayName = "FRIDAY";
    break;
   case 7:
    dayName = "SATURDAY";
    break;
  }
  return dayName;
 }
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String month = in .next();
  String day = in .next();
  String year = in .next();

  System.out.println(getDay(day, month, year));
 }
}