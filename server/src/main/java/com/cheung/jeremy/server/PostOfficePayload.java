package com.cheung.jeremy.server;

import java.util.ArrayList;

public class PostOfficePayload {
    private final String baseCurrency;
    private final ArrayList<QuoteRequestsDto> quoteRequests;

    public PostOfficePayload(String baseCurrency, String exchangeCurrency, Double amount) {
        this.baseCurrency = baseCurrency;
        this.quoteRequests = new ArrayList<>();
        this.quoteRequests.add(new QuoteRequestsDto(exchangeCurrency, amount));
    }
}
