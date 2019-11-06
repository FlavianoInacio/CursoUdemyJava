package hercanca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manuFactureDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, double price, Date manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
	}
	
	public Date getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}

	@Override
	public String pricetag() {
		// TODO Auto-generated method stub
		return super.pricetag()+ "Used - "
				+ "(Mnafactured Date: "+sdf.format(manuFactureDate)+") ";
	}

	
	

}
