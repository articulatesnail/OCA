package core_api;

import java.time.*;
import java.time.format.*;

public class date_time {
	public static void main(String... yaya) {
		// localDateOf();
		// parse();
		// period();
		// formatter();
		confirm();
	}

	static void localDateOf() {
		LocalDate date = LocalDate.of(2100, 2, 50); // complies, but DTE
		System.out.println("date: " + date.minusMonths(2).plusYears(2).minusDays(-1));
	}

	static void parse() {
		// parse needs to be a string
		LocalDateTime ldt = LocalDateTime.parse("2013-12-31T23:40");
		System.out.println("date time parsed: " + ldt);
		System.out.println("date time parsed plus hour: " + ldt.plusHours(3));
		// period only up to YMD.
		System.out.println("date time: " + LocalDateTime.of(1, 1, 1, 1, 1, 1).minus(Period.of(6569, 9, 9)));
	}

	static void period() {
		System.out.println(LocalDateTime.of(1, 1, 1, 1, 1, 1).plus(Period.parse("P2Y2M2D")));
		System.out.println("of months: " + LocalDate.of(10, 10, 10).minus(Period.ofMonths(1)));
		// a chained period only takes the last element. good, but improper.
		System.out.println("of months.years: " + LocalDate.of(10, 10, 10).minus(Period.ofMonths(1).ofYears(2)));
	}

	static void formatter() {
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter medF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter customF = DateTimeFormatter.ofPattern("MMM, YY, dd, MMMM, mm, MMMM");
		DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy MM dd");

		LocalDate date = LocalDate.parse("2000 03 01", dateF);
		System.out.println("date: " + date);

		LocalTime time = LocalTime.of(1, 1, 1);
		LocalDateTime date_time = LocalDateTime.of(2000, 12, 20, 23, 59, 59);
		LocalDateTime date_time2 = LocalDateTime.of(date, time);

		// format CAN OMIT INFO!
		System.out.println(LocalDateTime.parse("0023-03-03T03:30").format(DateTimeFormatter.ISO_DATE));
		System.out.println("leave out time of dt in formatter: " + date_time.format(DateTimeFormatter.ISO_DATE));
		System.out.println("leave out date of dt in formatter: " + date_time.format(DateTimeFormatter.ISO_TIME));
		System.out.println("short: " + date_time.format(shortF));
		System.out.println("med: " + date_time.format(medF));
		System.out.println("custom: " + date_time.format(customF));

		// but cannot add
		// System.out.println("add date: " +
		// time.format(DateTimeFormatter.ISO_DATE_TIME));

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate date3 = LocalDate.parse("01 02 2015", f);
		System.out.println("date3: " + date3);

	}

	static void confirm() {
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("d.format(f): " + d.format(f)); // 5/10/13, 11:22 AM 
		System.out.println("f.format(d): " + f.format(d)); // 5/10/13, 11:22 AM 
	}
}
