package com.egen.orderecommercejava.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.egen.orderecommercejava.enums.PaymentMode;
import com.egen.orderecommercejava.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ecommerce_payment")
public class Payment {

	@Id
	@Column(name = "payment_id", nullable = false, unique = true)
	private String paymentId;

	@Column(name = "amount", nullable = false)
	private Double amount;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(String paymentId, Double amount, PaymentMode paymentMode, String confirmationNumber,
			PaymentStatus paymentStatus, LocalDate createdAt, Order order) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.confirmationNumber = confirmationNumber;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
		this.order = order;
	}

	@Column(name = "payment_mode", nullable = false)
	private PaymentMode paymentMode;

	@Column(name = "confirmation_number", nullable = false)
	private String confirmationNumber;

	@Column(name = "payment_status", nullable = false)
	private PaymentStatus paymentStatus;

	@Column(name = "createdAt", nullable = false)
	private LocalDate createdAt;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "payment")
	private Order order;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}