package com.egen.orderecommercejava.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {
	
	Double subTotal;
	Double totalAmt;
	Double tax;
	Double shippingCharges;
	String title;
	String shippingMode;
	Double amount;
	String paymentMode;

	AddressDto billingAddress;
	AddressDto shippingAddress;

	List<OrderItemDto> orderItems;


	String customerId;
	
}
