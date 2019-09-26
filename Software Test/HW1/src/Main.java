
public class Main {
  
  public static void main(String args[]){
    // public Rational()
	Rational test1 = new Rational();
	System.out.printf("Test1 nu: %d de: %d\n", test1.getNu(), test1.getDe());
    
	try {
  	  // public Rational(int n, int d) 
	  Rational test2 = new Rational(-21, 6);
  	  Rational test3 = new Rational(77, -21);
  	  System.out.printf("Test2 nu: %d de: %d\n", test2.getNu(), test2.getDe());
   	  System.out.printf("Test3 nu: %d de: %d\n", test3.getNu(), test3.getDe());
   	  
   	  // public boolean equals(Rational r)
   	  if(test2.equals(test3)) {
   	    System.out.printf("Test2 is equal to Test3!\n");
   	  } else {
   	    System.out.printf("Test2 is not equal to Test3!\n");
   	  }
   	  
   	  // public Rational add(Rational r)
      Rational test4 = test2.add(test3);
      System.out.printf("Test4 = Test2 + Test3, nu: %d de: %d\n", test4.getNu(), test4.getDe());
     
      // public Rational sub(Rational r)
      Rational test5 = test2.sub(test3);
      System.out.printf("Test5 = Test2 - Test3, nu: %d de: %d\n", test5.getNu(), test5.getDe());
      
      // public Rational mul(Rational r)
      Rational test6 = test2.mul(test3);
      System.out.printf("Test6 = Test2 * Test3, nu: %d de: %d\n", test6.getNu(), test6.getDe());
      
      // public Rational div(Rational r)
      Rational test7 = test2.div(test3);
      System.out.printf("Test7 = Test2 / Test3, nu: %d de: %d\n", test7.getNu(), test7.getDe());
      
      // public Rational neg()
      Rational test8 = test2.neg();
      System.out.printf("Test8 = Test2 * -1, nu: %d de: %d\n", test8.getNu(), test8.getDe());
      
      // public Rational recip()
      Rational test9 = test2.recip();
      System.out.printf("Test9 = 1/Test2, nu: %d de: %d\n", test9.getNu(), test9.getDe());
      
      //  public String toString()
      System.out.printf("String function test, test2 = %s\n", test2.toString());
      
	} catch(IllegalDenominatorException e) {
	  System.out.println(e);
	} catch(DivideByZeroException e) {
  	  System.out.println(e);
	} catch(IllegalNumeratorException e) {
  	  System.out.println(e);	
	}
  }
  
}
