package demo;

import java.sql.Time;
import java.util.List;

public class Sale {
	private Time date;
	private boolean isComplete;
	private List<SalesLineItem> getLineItems();
	
	public void becomeComplete() {
	}
	public void makeLineItem(desc,qty){
		SalesLineItem sl =new SalesLineItem(desc,qty);
		LineItems.add(sl);
	}
	
}
