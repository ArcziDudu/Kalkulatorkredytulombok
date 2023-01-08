package pl.zajavka.mortgage.services;

import pl.zajavka.mortgage.model.Rate;

import java.math.BigDecimal;

public interface Function {

    BigDecimal calculate(Rate rate);
}
