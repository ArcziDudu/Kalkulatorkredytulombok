package pl.zajavka.mortgage.model;

import java.math.BigDecimal;

public class RateAmounts {

    private final BigDecimal rateAmount;

    private final BigDecimal interestAmount;

    private final BigDecimal capitalAmount;

    private final Overpayment overpayment;

    public RateAmounts(final BigDecimal rateAmount, final BigDecimal interestAmount, final BigDecimal capitalAmount, final Overpayment overpayment) {
        this.rateAmount = rateAmount;
        this.interestAmount = interestAmount;
        this.capitalAmount = capitalAmount;
        this.overpayment = overpayment;
    }

    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    public BigDecimal getInterestAmount() {
        return interestAmount;
    }

    public BigDecimal getCapitalAmount() {
        return capitalAmount;
    }

    public Overpayment getOverpayment() {
        return overpayment;
    }
}
