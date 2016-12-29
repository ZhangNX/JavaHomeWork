package demo;

public class Register {

	public void endSale() {
	}
	public void enterItem(int id,double qty) {
		ProductCatalog pc=new ProductCatalog();
		pc.getDescriptions(id);
	
		Sale sale =new Sale();
		sale.makeLineItem(desc,qty);
		
	}
	public void makeNewSale(){
	}
	public void makePayment(){
	}
}
