import java.lang.Exception;

public class IllegalNumeratorException extends Exception {
  public IllegalNumeratorException() {
    super();
  }

  public IllegalNumeratorException (String except) {
	super(except);
  }  
}
