package com.cheung.jeremy.server;

public record ExchangeRate (Currency baseCurrency, Currency exchangeCurrency, double rate) {
}