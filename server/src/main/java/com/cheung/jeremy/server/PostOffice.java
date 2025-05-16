package com.cheung.jeremy.server;



class PostOffice extends ExchangeRateProvider {
    private static final String POST_OFFICE_URL = "https://www.postoffice.co.uk/.rest/travel-money/ep/fres/quotes";
    @Override
    ExchangeRate provideExchangeRate(Currency baseCurrency, Currency exchangeCurrency, double amount) {
        ExchangeRate exchangeRate;
        RestClient client = RestClient.create();
        String result = restClient.post().uri(POST_OFFICE_URL).retrieve().body();
        PostOfficePayload payload = new PostOfficePayload(baseCurrency, exchangeCurrency, amount);
        return exchangeRate;
    }

}