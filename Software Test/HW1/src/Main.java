
public class Main {
  
  public static void main(String args[]){
	  Rational test1 = new Rational();
	  System.out.printf("%d %d\n", test1.getNu(), test1.getDe());
	  try {
	    Rational test2 = new Rational(15, 21);
	    Rational test3 = new Rational(10, 7);
	    Rational test4 = test2.recip();
		System.out.printf("%d %d\n", test2.getNu(), test2.getDe());
		System.out.printf("%s\n", test4.toString());
		if(test2.equals(test3)) {
		  System.out.printf("true\n");	
		}else {
		  System.out.printf("false\n");	
		}		
	  }catch(IllegalDenominatorException e) {
		  System.out.println(e);
	  }
  }
  
}
