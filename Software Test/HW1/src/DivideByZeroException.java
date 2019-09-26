import java.lang.Exception;

public class DivideByZeroException extends Exception {
  public DivideByZeroException() {
    super();
  }
	
  public DivideByZeroException (String except) {
    super(except);
  }  
}
