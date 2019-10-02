
public class GradeConverter {
	
	public GradeConverter() {
	}
	
	public String convert(int grade) throws IllegalGradeException {
		// TODO Auto-generated method stub
		if(grade > 100 || grade < 0) {
		  throw new IllegalGradeException();
		}
		
		if(grade <= 100 && grade >= 90) {
		  return "A";
		} else if(grade <= 89 && grade >= 80) {
		  return "B";
		} else if(grade <= 79 && grade >= 70) {
		  return "C";
		} else if(grade <= 69 && grade >= 60) {
		  return "D";
		} else {
		  return "F";
		}		
	}

}
