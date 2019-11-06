package hercanca;

public class ImportedProduct extends Product {
	
	private double customFee;

	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}

	@Override
	public String pricetag() {
		// TODO Auto-generated method stub
		return super.pricetag() + "(Custom fee: $ "+String.format("%.2f",totalPrice())+")";
	}
	public 	double totalPrice() {
		double total =0;
		total = customFee + getPrice();
		return total;
	}
	
	

}
