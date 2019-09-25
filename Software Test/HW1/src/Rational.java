
 public class Rational {
  
  private int nu;  // numerator
  private int de;  // denominator   
  
  public Rational() {
      nu = 0;
      de = 1;
  }
  
  public Rational(int n, int d) throws IllegalDenominatorException {
	  int gcd;
	  if(d == 0) {
    	throw new IllegalDenominatorException("Illegal denominator exception!");
      }  
      nu = n;
      de = d;      
      // gcd
      while(d != 0) { 
        gcd = n % d; 
        n = d; 
        d = gcd; 
      } 
      gcd = n;
      // simplify
      nu /= gcd;
      de /= gcd;      
  }
  
  public int getNu() {
	  return nu;
  }
  public int getDe() {
	  return de;
  }
    
  public boolean equals(Rational r) {
      if((r.getNu() == nu) && (r.getDe() == de)) {
    	  return true;
      }      
	  return false;
  }
  
  public Rational add(Rational r) {
    Rational num = new Rational();
	if(de == r.getDe()) {
	  num.nu = nu + r.getNu();
	  num.de = de;
	} else {
	  num.nu = nu * r.getDe() + r.getNu() * de;
	  num.de = de * r.getDe();
	}	
	return num;
  }
  
  public Rational sub(Rational r) { 
    Rational num = new Rational();
	if(de == r.getDe()) {
	  num.nu = nu - r.getNu();
	  num.de = de;
	} else {
	  num.nu = nu * r.getDe() - r.getNu() * de;
	  num.de = de * r.getDe();
	}	
	return num;
  }
  
  public Rational mul(Rational r) {
    Rational num = new Rational();
    num.nu = nu * r.nu;
    num.de = de * r.de;
    return num;
  }
  
  public Rational div(Rational r) {
    Rational num = new Rational();
    num.nu = nu * r.de;
    num.de = de * r.nu;
    return num;
  }
  
  public Rational neg() {
    Rational num = new Rational();
    num.nu = nu * (-1);
	return num;
  }
  
  public Rational recip() {
    Rational num = new Rational();
	num.nu = de;
	num.de = nu;
	return num;	 
  }
 
  public String toString() {
    return Integer.toString(nu) + '/' + Integer.toString(de);
  }
 
}
