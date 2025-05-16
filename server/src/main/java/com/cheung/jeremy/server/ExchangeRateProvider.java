package com.cheung.jeremy.server;

abstract class ExchangeRateProvider {
    abstract ExchangeRate provideExchangeRate(Currency baseCurrency, Currency exchangeCurrency, double amount);
}