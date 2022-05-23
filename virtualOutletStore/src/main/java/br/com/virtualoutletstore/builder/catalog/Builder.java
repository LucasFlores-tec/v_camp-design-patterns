package br.com.virtualoutletstore.builder.catalog;

import br.com.virtualoutletstore.products.Book;
import br.com.virtualoutletstore.products.Mouse;
import br.com.virtualoutletstore.products.SsdCard;
import br.com.virtualoutletstore.products.Tshirt;

public interface Builder {
	
	void setSku(int sku);
	
	void setPrice(Double price);
	
	void setWeight(Double weight);
	
	void setBook(Book book);
	
	void setTshirt(Tshirt tshirt);
	
	void setSsdcard(SsdCard ssdcard);
	
	void setMouse(Mouse mouse);

}
