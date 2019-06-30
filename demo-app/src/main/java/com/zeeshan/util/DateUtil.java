package com.zeeshan.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

public class DateUtil {

	public static Period calculateDate(String dob) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date date = sdf.parse(dob);

		Instant instant = Instant.ofEpochMilli(date.getTime());
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		LocalDate localDate = localDateTime.toLocalDate();

		LocalDate now = LocalDate.now();
		Period period = Period.between(localDate, now);
		return period;
	}

	/*
	 * public static void main(String[] args) throws ParseException {
	 * System.out.println(calculateDate("29-06-2019")); }
	 */
}
