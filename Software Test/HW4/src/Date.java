
public class Date {

	private int year;
	private int month;
	private int day;

	public Date(int y, int m, int d) throws IllegalDateException{
		// TODO Auto-generated constructor stub
		boolean leapYear = false;
		if(y < 1) 
	      throw new IllegalDateException();		
		if(m < 1 || m > 12) 
		  throw new IllegalDateException();		
		if(d < 1 || d > 31) 
		  throw new IllegalDateException();
		
		switch(m) {
		case 2:
			 if(y%400 == 0) {
 			   leapYear = true;
			 }else if(y%4 == 0 && y%100 != 0) {
			   leapYear = true;
			 }
			 if((leapYear && d > 29) || (!leapYear && d >= 29)){
			   throw new IllegalDateException();
			 }	
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(d>31)
			  throw new IllegalDateException();
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(d>30)
		      throw new IllegalDateException();
			break;				
		}
		year = y;
		month = m;
		day = d;
	}

	public int getYear() {
		// TODO Auto-generated method stub
		return year;
	}

	public int getMonth() {
		// TODO Auto-generated method stub
		return month;
	}

	public int getDay() {
		// TODO Auto-generated method stub
		return day;
	}
	
	public String toString() {
		return year+"/"+month+"/"+day;
	}

}
