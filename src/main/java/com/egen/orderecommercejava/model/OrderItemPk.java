package com.egen.orderecommercejava.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
public class OrderItemPk implements Serializable {
	
	public OrderItemPk() {
		super();
	}

    public OrderItemPk(String productId, String orderId) {
		super();
		this.productId = productId;
		this.orderId = orderId;
	}

	@Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "order_id", nullable = false)
    private String orderId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}