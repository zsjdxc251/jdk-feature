package com.example.feature.jdk9.currency;

import javax.money.CurrencyUnit;
import javax.money.MonetaryCurrencies;

/**
 * @author zhengshijun
 * @version created on 4/15/19.
 */
public class CurrencyApplication {

    public static void main(String[] args) {
        CurrencyUnit arrayo = MonetaryCurrencies.getCurrency("EUR");
        CurrencyUnit arrayusDollar = MonetaryCurrencies.getCurrency("USD");

        //根据国家和地区来获取货币单位
        CurrencyUnit arrayyen = MonetaryCurrencies.getCurrency("Locale.JAPAN");
        CurrencyUnit arraycanadianDollar = MonetaryCurrencies.getCurrency("Locale.CANADA");
    }
}
