package com.egen.orderecommercejava.mapper;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.egen.orderecommercejava.dto.AddressDto;
import com.egen.orderecommercejava.dto.OrderItemDto;
import com.egen.orderecommercejava.enums.PaymentMode;
import com.egen.orderecommercejava.enums.PaymentStatus;
import com.egen.orderecommercejava.model.Address;
import com.egen.orderecommercejava.model.OrderItem;
import com.egen.orderecommercejava.model.OrderItemPk;
import com.egen.orderecommercejava.model.Payment;
import com.egen.orderecommercejava.repository.AddressRepository;
import com.egen.orderecommercejava.repository.OrderItemRepository;
import com.egen.orderecommercejava.repository.PaymentRepository;

@Component
public class OrderDetailsMapper {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment buildAndLoadPayment(Double amount, PaymentMode paymentMode) {
        Payment payment = new Payment(
                UUID.randomUUID().toString(),
                amount,
                paymentMode,
                UUID.randomUUID().toString(),
                PaymentStatus.PROCESSING,
                LocalDate.now(),
                null
        );

        paymentRepository.save(payment);
        return payment;
    }

    public Address buildAndLoadAddress(AddressDto addressDto) {
        Address addressEntity = toAddressEntity(addressDto);
        return addressRepository.save(addressEntity);
    }

    public List<OrderItem> buildOrderItems(List<OrderItemDto> orderItemsDtoList, String orderId) {
        List<OrderItem> orderItemList = orderItemsDtoList.stream()
                .map(orderItemDto ->
                        new OrderItem(new OrderItemPk(orderItemDto.getProductId(), orderId), null, null, orderItemDto.getQuantity()))
                .collect(Collectors.toList());
        orderItemRepository.saveAll(orderItemList);
        return orderItemList;
    }


    private Address toAddressEntity(AddressDto addressDto) {

        return null;/* Address(
        		"gh",
                addressDto.getAddress1(),
                addressDto.getAddress2(),
                addressDto.getCity(),
                addressDto.getState(),
                addressDto.getZip(),
                addressDto.getEmail(),
                addressDto.getPhone(),
                LocalDate.now(),
                null);*/
    }

}