package com.kams.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateFormatUtils {
	
	public static String nextWorkDate(String date,String mins) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		DateCal cal=new DateCal();
		Date date2;
		Date diff = null;
		double minutes=Double.parseDouble(mins);
		double hours=minutes / 60;
		try {
			date2 = simpleDateFormat.parse(date);
			diff=cal.getPluseHourDate(date2,hours);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return simpleDateFormat.format(diff);
	}
	
	public static String workDateDiff(String startDate,String endDate) {
		Calendar cal_start = transCanlendar(startDate);
		Calendar cal_end = transCanlendar(endDate);
		DateCal cal=new DateCal();
		Long diff=cal.getDayMiLLI(cal_start,cal_end);
		String diff1=diff/(1000*60)+"";
		return diff1;
	}
	
	public static Calendar transCanlendar(String date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date1;
		Calendar calendar = null;
		if (date.equals("")||date==null) {
			return calendar;
		}
		try {
			date1 = simpleDateFormat.parse(date);
			calendar = Calendar.getInstance();
			calendar.setTime(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return calendar;
	}
	public static Calendar transCanlendar1(String date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1;
		Calendar calendar = null;
		if (date.equals("")||date==null) {
			return calendar;
		}
		try {
			date1 = simpleDateFormat.parse(date);
			calendar = Calendar.getInstance();
			calendar.setTime(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return calendar;
	}
	
	public static String fromCalendarToDate(Calendar calendar) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date =calendar.getTime();
		String date1 = simpleDateFormat.format(date);
		return date1;
	}
	public static String fromCalendarToDateMMDD(Calendar calendar) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
		Date date =calendar.getTime();
		String date1 = simpleDateFormat.format(date);
		return date1;
	}
	
	public static String getSTDCNDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = simpleDateFormat.format(new Date());
		return date;
	}
	public static String getDateMH() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String date = simpleDateFormat.format(new Date());
		return date;
	}

	public static String dateDiff(String date1, String date2) {
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm");
		String diff = null;
		Long date11;
		try {
			date11 = df.parse(formatAM(date1)).getTime();
			Long date22 = df.parse(formatAM(date2)).getTime();
			diff = (date22 - date11) / 1000 / 60 + "";
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return diff;
	}

	public static String formatAM(String date) {
		if (date.contains("AM")) {
			date = date.substring(0, date.indexOf("AM")).trim();
		}
		if (date.contains("PM")) {
			date = date.substring(0, date.indexOf("PM")).trim();
			String hour = date.substring(date.indexOf(" "), date.indexOf(" ") + 3);
			switch (hour) {
			case " 01":
				date = date.replace(" 01", " 13");
				break;
			case " 02":
				date = date.replace(" 02", " 14");
				break;
			case " 03":
				date = date.replace(" 03", " 15");
				break;
			case " 04":
				date = date.replace(" 04", " 16");
				break;
			case " 05":
				date = date.replace(" 05", " 17");
				break;
			case " 06":
				date = date.replace(" 06", " 18");
				break;
			case " 07":
				date = date.replace(" 07", " 19");
				break;
			case " 08":
				date = date.replace(" 08", " 20");
				break;
			case " 09":
				date = date.replace(" 09", " 21");
				break;
			case " 10":
				date = date.replace(" 10", " 22");
				break;
			case " 11":
				date = date.replace(" 11", " 23");
				break;
			default:
				break;
			}
		}
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date2;
		try {
			 date2=df.parse(date);
			 date=simpleDateFormat.format(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	

	public static void main(String[] args) {
		//dateDiff("2020-05-09 11:53 AM", "2020-05-09 05:53 PM");
		System.out.println(nextWorkDate("2020-05-22 17:53", "8"));
	}

}
