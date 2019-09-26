import java.lang.Math;
public class Rational {
  //
  //  Greatest Common Divisor
  //
  private int gcd(int m, int n) {
    int tmp;
    m = Math.abs(m);
    n = Math.abs(n);
    while(n != 0) {
      tmp = m % n;
      m = n;
      n = tmp;
    }
    return m;
  }
  
  private int nu;  // numerator
  private int de;  // denominator   
  
  public Rational() {
    nu = 0;
    de = 1;
  }
  
  public Rational(int n, int d) throws IllegalDenominatorException {
	// throw the exception
	if(d == 0) {
      throw new IllegalDenominatorException("Illegal denominator exception!");
    }
    int gcdNum;
    int sign = 1;
    // handle number's sign
    if(n < 0) {
      sign *= (-1);
    }
    if(d < 0) {
      sign *= (-1);
    }
    // simplify
    n = Math.abs(n);
    d = Math.abs(d);
    gcdNum = gcd(n, d);
    nu = (n * sign) / gcdNum;
    de = d / gcdNum;     
  }
  
  public int getNu() {
	return nu;
  }
  public int getDe() {
	return de;
  }
    
  public boolean equals(Rational r) {
    if((r.nu == nu) && (r.de == de)) {
      return true;
    }      
	return false;
  }
  
  public Rational add(Rational r) {
    int gcdNum;
	Rational num = new Rational();
	if(de == r.de) {
	  num.nu = nu + r.nu;
	  num.de = de;
	} else {
	  num.nu = nu * r.de + r.nu * de;
	  num.de = de * r.de;
	}
	// simplify
	gcdNum = gcd(num.nu, num.de);
	num.nu /= gcdNum;
	num.de /= gcdNum;
	return num;
  }
  
  public Rational sub(Rational r) {
    int gcdNum;
    Rational num = new Rational();
	if(de == r.de) {
	  num.nu = nu - r.nu;
	  num.de = de;
	} else {
	  num.nu = nu * r.de - r.nu * de;
	  num.de = de * r.de;
	}
	// simplify
	gcdNum = gcd(num.nu, num.de);
	num.nu /= gcdNum;
	num.de /= gcdNum;
	return num;
  }
  
  public Rational mul(Rational r) {
    int gcdNum;
    Rational num = new Rational();
    num.nu = nu * r.nu;
    num.de = de * r.de;
	// simplify
	gcdNum = gcd(num.nu, num.de);
	num.nu /= gcdNum;
	num.de /= gcdNum;
    return num;
  }
  
  public Rational div(Rational r) throws DivideByZeroException {
	// throw the exception
	if(r.nu == 0) {
	  throw new DivideByZeroException("Divide By Zero Exception!");
	}
	int gcdNum;
	int sign = 1;
    Rational num = new Rational();
    if(r.nu < 0) {
      sign *= -1;
    }
    num.nu = nu * r.de * sign;
    num.de = de * Math.abs(r.nu);
	// simplify
	gcdNum = gcd(num.nu, num.de);
	num.nu /= gcdNum;
	num.de /= gcdNum;
    return num;
  }
  
  public Rational neg() {
    Rational num = new Rational();
    num.nu = nu * (-1);
    num.de = de;
	return num;
  }
  
  public Rational recip() throws IllegalNumeratorException {
	// throw the exception
	if(nu == 0) {
      throw new IllegalNumeratorException("Illegal Numerator Exception!!");
    }
	int sign = 1;
	Rational num = new Rational();
	if(nu < 0) {
	  sign = -1;
	}	
	num.nu = de * sign;
	num.de = nu * sign;
	return num;	 
  }
 
  public String toString() {
    return Integer.toString(nu) + '/' + Integer.toString(de);
  }
 
}
