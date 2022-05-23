package br.com.virtualoutletstore.observer.backoffice;

import br.com.virtualoutletstore.iterator.orderlist.OrderList;

public class Backoffice implements OrderListObserver {
	
	@Override
	public void renderOrderList(OrderList orderList) {
		int numberOfOrdersInTheOrderList = orderList.getListOfOrders().size();
		System.out.println("\nORDER ADDED:\n");
		System.out.println("Order: " + OrderList.getInstanceOfOrderList().getListOfOrders().get(numberOfOrdersInTheOrderList-1));
		System.out.println("Status: " + OrderList.getInstanceOfOrderList().getListOfOrders().get(numberOfOrdersInTheOrderList-1).getOrderStatus());
		System.out.println("Cart: " + OrderList.getInstanceOfOrderList().getListOfOrders().get(numberOfOrdersInTheOrderList-1).getOrderCart());
		System.out.println(OrderList.getInstanceOfOrderList().getListOfOrders().get(numberOfOrdersInTheOrderList-1).getOrderShipping());
		System.out.println("\n=================\n");
	}

}