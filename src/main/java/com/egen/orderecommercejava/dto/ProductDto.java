package com.egen.orderecommercejava.dto;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
@Builder
public class ProductDto {
    @NonNull String productId;
    @NonNull String sku;
    @NonNull String title;
    @NonNull String description;
    @NonNull Double price;
    @NonNull LocalDate createdAt;
}