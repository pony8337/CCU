/*
 * class: Date 
 */
public class Date {
	private int year;
	private int month;
	private int day;
/*
 * The constructor.
 */
	public Date(int y, int m, int d) throws illegalDateException{
		if(y < 1 || m < 1 || m > 12 || d < 1) throw new illegalDateException();
		if(m==2) {
			if((((y % 4)==0) && ((y % 100)!=0)) ||((y % 400)==0)) {
				if(d>29) throw new illegalDateException();
			} else {
				if(d>28) throw new illegalDateException();
			}
		} else if(m==4 || m==6 || m==9 || m==11) {
			if(d>30) throw new illegalDateException();
		} else {
			if(d>31) throw new illegalDateException();
		}
		
		year = y;
		month = m;
		day = d;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
/*
 * The absoluteNumberOfDays method calculates the number of days
 * from January 1, 1 A. D. to the current date.
 */
	public int absoluteNumberOfDays() {
		int thisYear, priorYears;
		
		thisYear = (month - 1) * 31 + day;
		 if (month > 2) {
			 thisYear = thisYear - ((4*month+23) / 10);
		 if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0))
			 thisYear = thisYear + 1;
		 }
		 priorYears = 365*(year-1)+(year-1)/4-(year-1)/100+(year-1)/400;
		 return thisYear + priorYears;
	}
	
	public boolean equal(Date date) {
		return year==date.getYear() && month==date.getMonth() && day==date.getDay();
	}
	
	public String toString() {
		return year + "/" + month + "/" + day;
	}
}
