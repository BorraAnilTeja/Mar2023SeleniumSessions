package SeleniumSessions;

public class CSSSelectorGoIbiboCalendar {

	public static void main(String[] args) {

		//div.DayPicker-Day.DayPicker-Day--start.DayPicker-Day--selected.DayPicker-Day--today       ------>current date
		//div.DayPicker-Day:not(.DayPicker-Day--outside)    ------->total days including disabled without blanks
		//div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside)  ------->disabled dates in month
		
		//div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled)  ---->enabled dates in both months
	}

}
