package com.google.gwt.i18n.client.impl;

import com.google.gwt.i18n.client.impl.CurrencyData;
import com.google.gwt.i18n.client.impl.CurrencyList;

public class CurrencyList_ extends com.google.gwt.i18n.client.impl.CurrencyList {
  @Override
  protected native void loadCurrencyMap() /*-{
    this.@com.google.gwt.i18n.client.impl.CurrencyList::dataMap = {
      // BRL
      ":BRL": [ "BRL", "R$", 2, "R$"],
      // EUR
      ":EUR": [ "EUR", "€", 2, "€"],
      // GBP
      ":GBP": [ "GBP", "UK£", 2, "GB£"],
      // INR
      ":INR": [ "INR", "Rs.", 2, "Rs"],
      // JPY
      ":JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // USD
      ":USD": [ "USD", "US$", 2, "US$"],
    };
  }-*/;
  
  @Override
  public native void loadNamesMap() /*-{
    this.@com.google.gwt.i18n.client.impl.CurrencyList::namesMap = {
    };
  }-*/;
  
  @Override
  public native CurrencyData getDefault() /*-{
    return [ "USD", "US$", 2, "US$"];
  }-*/;
}
