package br.com.virtualoutletstore.observer.backoffice;

import br.com.virtualoutletstore.facade.order.Order;

public interface OrderStatusObserver {
	
	void alterStatus(Order order);

}
