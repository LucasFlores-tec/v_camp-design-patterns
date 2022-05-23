package br.com.virtualoutletstore.builder.catalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Catalog (BUILDER)
 */

public class Catalog {
	
	private static List<Product> catalog = new ArrayList<>();
	
	public List<Product> getAllProducts() {
		return catalog;
	}
	
	public void addProductToCatalog(String typeOfProduct) {
		Director director = new Director();
		ProductBuilder builder = new ProductBuilder();
		switch(typeOfProduct) {
			case "book": director.bookBuilder(builder); catalog.add(builder.getResults()); break;
			case "tshirt": director.tshirtBuilder(builder); catalog.add(builder.getResults()); break;
			case "ssdcard": director.ssdCardBuilder(builder); catalog.add(builder.getResults()); break;
			case "mouse": director.mouseBuilder(builder); catalog.add(builder.getResults()); break;
			default: System.out.println("Type of product does not exists");
		}
	}
	
}
