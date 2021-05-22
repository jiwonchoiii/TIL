package reference;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public boolean isValid = true;

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		this.day = day;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day < 0 || day > 31) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (day < 0 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;

		case 2:
			if (day < 0 || day > 28) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		default:
			isValid = false;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if (month > 12 || month < 1) {
			isValid = false;
		} else {
			this.month = month;
		}

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {

		if (year < 1000) {
			isValid = false;
		} else {
			this.year = year;
		}
	}

	public String isValid() {
		if (isValid) {
			return "유효한 날짜입니다";
		} else {
			return "유효하지 않은 날짜입니다";

		}
	
	}
}