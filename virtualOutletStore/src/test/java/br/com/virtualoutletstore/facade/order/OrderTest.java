package br.com.virtualoutletstore.facade.order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.com.virtualoutletstore.composite.cart.Cart;

public class OrderTest {
	
	private Cart cart1;
	
	private Cart cart2;
	
	private Order order;
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Before
	public void setOrderScenario() {
		cart1 = new Cart();
		cart2 = new Cart();
		order = new Order(cart1, cart1.getShipping(), "pending");
	}
	
	@Test
	public void setOrderCartTest() {
		// Action
		order.setOrderCart(cart2);
		
		// Verification
		error.checkThat(order.getOrderCart(), is(equalTo(cart2)));
	}
	
	@Test
	public void setOrderShippingTest() {
		// Action
		order.setOrderShipping(cart2);
				
		// Verification
		error.checkThat(order.getOrderShipping(), is(equalTo(cart2.getShipping())));
	}
	
	@Test
	public void setOrderStatusTest() {
		// Action
		order.setOrderStatus("paid");
				
		// Verification
		error.checkThat(order.getOrderStatus(), is(equalTo("paid")));
	}


}
