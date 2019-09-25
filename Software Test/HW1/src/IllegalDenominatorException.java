import java.lang.Exception;

public class IllegalDenominatorException extends Exception {
	public IllegalDenominatorException() {
		super();
	}
	
	public IllegalDenominatorException (String except) {
		super(except);
	}

}
