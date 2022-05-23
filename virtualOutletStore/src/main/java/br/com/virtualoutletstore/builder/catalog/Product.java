package br.com.virtualoutletstore.builder.catalog;

import br.com.virtualoutletstore.products.Book;
import br.com.virtualoutletstore.products.Mouse;
import br.com.virtualoutletstore.products.SsdCard;
import br.com.virtualoutletstore.products.Tshirt;

public class Product {
	
	private int sku;
	
	private Double price;
	
	private Double weight;
	
	private Book book;
	
	private Tshirt tshirt;
	
	private SsdCard ssdcard;
	
	private Mouse mouse;

	public Product(int sku, Double price, Double weight, Book book, Tshirt tshirt, SsdCard ssdcard, Mouse mouse) {
		this.sku = sku;
		this.price = price;
		this.weight = weight;
		this.book = book;
		this.tshirt = tshirt;
		this.ssdcard = ssdcard;
		this.mouse = mouse;
	}

	public int getSku() {
		return sku;
	}

	public Double getPrice() {
		return price;
	}

	public Double getWeight() {
		return weight;
	}

	public Book getBook() {
		return book;
	}

	public Tshirt getTshirt() {
		return tshirt;
	}

	public SsdCard getSsdcard() {
		return ssdcard;
	}

	public Mouse getMouse() {
		return mouse;
	}
	
}
