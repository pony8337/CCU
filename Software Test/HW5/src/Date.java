
public class Date {

	private int year;
	private int month;
	private int day;
    private	boolean leapYear = false;
	
	public Date(int year, int month, int day) throws IllegalDateException{
		// TODO Auto-generated constructor stub
		if(year < 1 || year > 3999)
			throw new IllegalDateException();		
		if(month < 1 || month > 12) 
			  throw new IllegalDateException();		
		if(day < 1 || day > 31)
			throw new IllegalDateException();
		switch(month) {
		case 2:
			 if(year%400 == 0) {
 			   leapYear = true;
			 }else if(year%4 == 0 && year%100 != 0) {
			   leapYear = true;
			 }
			 if((leapYear && day > 29) || (!leapYear && day >= 29)){
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
			if(day>31)
			  throw new IllegalDateException();
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>30)
		      throw new IllegalDateException();
			break;				
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		// TODO Auto-generated method stub
		return this.year;
	}

	public int getMonth() {
		// TODO Auto-generated method stub
		return this.month;
	}

	public int getDay() {
		// TODO Auto-generated method stub
		return this.day;
	}

	public Date next() {
		// TODO Auto-generated method stub
		int nextYear = 1;
		int nextMonth = 1;
		int nextDay = 1;
        try {
        	switch(month) 
        	{
        	case 12:
        		if(day == 31) {
        			nextYear = year+1;
        			nextMonth = 1;
        			nextDay = 1;
        		} else if (day < 31){
        			nextYear = year;
        			nextMonth = month;
        			nextDay = day+1;
        		}
        		break;
        	case 1:
        	case 3:
        	case 5:
        	case 7:
        	case 8:
        	case 10:
        		if(day == 31) {
        			nextYear = year;
        			nextMonth = month+1;
        			nextDay = 1;
        		} else if(day < 31) {
        			nextYear = year;
        			nextMonth = month;
        			nextDay = day+1;
        		}
        		break;
        	case 4:
        	case 6:
        	case 9:
        	case 11:
        		if(day == 30) {
        			nextYear = year;
        			nextMonth = month+1;
        			nextDay = 1;
        		}else if(day < 30) {
        			nextYear = year;
        			nextMonth = month;
        			nextDay = day+1;
        		}
        		break;
        	case 2:
        		if(year%400 == 0 || (year % 4 == 0 && year%100!=0)) {
        			if(day == 29) {
        				nextYear = year;
        				nextMonth = month+1;
        				nextDay = 1;
        			}else if(day < 29) {
        				nextYear = year;
        				nextMonth = month;
        				nextDay = day+1;
        			}
        		} else {
        			if(day == 28) {
        				nextYear = year;
        				nextMonth = month+1;
        				nextDay = 1;
        			} else if(day < 28){
        				nextYear = year;
        				nextMonth = month;
        				nextDay = day+1;
        			}
        		}
        	}
        		
    		Date dateNext = new Date(nextYear, nextMonth, nextDay);
    		return dateNext;
        }catch(IllegalDateException e) {
        	System.out.printf("Exception!!!", e);        	
			return null;
        }
	}
	
	public String toString() {
		return year + "/" + month + "/" + day;
	}

}
