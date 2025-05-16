package com.cheung.jeremy.server;

public class QuoteRequestsDto {
    private final String productId;
    private final Double amount;
    private final String productTypeId;
    private final Boolean reverse;

    public QuoteRequestsDto(String exchangeCurrency, Double amount) {
        this.productId = exchangeCurrency;
        this.amount = amount;
        this.productTypeId = "N";
        this.reverse = false;
    }
}
