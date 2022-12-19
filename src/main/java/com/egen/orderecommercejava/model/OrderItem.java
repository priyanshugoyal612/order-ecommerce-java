package com.egen.orderecommercejava.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ecommerce_order_item")
public class OrderItem {
	
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}


    public OrderItem(OrderItemPk orderItemPk, Product product, Order order, String quantity) {
		super();
		this.orderItemPk = orderItemPk;
		this.product = product;
		this.order = order;
		this.quantity = quantity;
	}

	@EmbeddedId
    private OrderItemPk orderItemPk;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Order order;

    @Column(name = "quantity", nullable = false)
    private String quantity;

	
	public OrderItemPk getOrderItemPk() {
		return orderItemPk;
	}

	public void setOrderItemPk(OrderItemPk orderItemPk) {
		this.orderItemPk = orderItemPk;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}