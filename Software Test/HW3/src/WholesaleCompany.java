
public class WholesaleCompany {

	private String name;

	public WholesaleCompany(String companyName) {
		// TODO Auto-generated constructor stub
		name = companyName;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int price(int numberBought, int unitPrice) throws IllegalArgumentException {
		// TODO Auto-generated method stub		
		if(numberBought <= 0 || unitPrice <= 0) {
			throw new IllegalArgumentException();
		}
		int Total = numberBought * unitPrice;
		
		if((1 <= numberBought && numberBought <= 50) && (1 <= unitPrice && unitPrice <= 1000))
			Total = (int)Math.round((double)Total * 0.95);
		if((1 <= numberBought && numberBought <= 50) && (1001 <= unitPrice))
			Total = (int)Math.round((double)Total * 0.9);
		if((51 <= numberBought) && (1 <= unitPrice && unitPrice <= 1000))
			Total = (int)Math.round((double)Total * 0.9);
		if((51 <= numberBought) && (1001 <= unitPrice))
			Total = (int)Math.round((double)Total * 0.8);
		
		return Total;
	}    

}
