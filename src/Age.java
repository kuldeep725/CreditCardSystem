
public class Age {
	
	private int day;
	private int month;
	private int year;
	private int[] checkMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31}; // 0 is just used so that 1st month have index 1

	void setDay (int day) {
		this.day = day;
	}
	void setMonth (int month) {
		this.month = month;
	}
	void setYear (int year) {
		this.year = year;
	}
	
	void setMonthValues() {
		if (year % 100 == 0 || (year%100 != 0 && year%4 == 0)) {
			checkMonth[2] = 29;
		}
	}
	
	int checkAge () {
		
		setMonthValues();
		if (year < 2017) {
			if (month >=1 && month <= 12) {
				if (day <= checkMonth[month]) {
					return 0;
				}
				else {
					return -1;
				}
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
	}

}
