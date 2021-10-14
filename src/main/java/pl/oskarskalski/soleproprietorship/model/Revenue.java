package pl.oskarskalski.soleproprietorship.model;

import java.util.Date;

public class Revenue {
    private double revenueGrossAmount;
    private double revenueNetAmount;
    private double zusAmount;
    private double taxPercent;
    private double taxAmount;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getRevenueGrossAmount() {
        return revenueGrossAmount;
    }

    public void setRevenueGrossAmount(double revenueGrossAmount) {
        this.revenueGrossAmount = revenueGrossAmount;
    }

    public double getRevenueNetAmount() {
        return revenueNetAmount;
    }

    public void setRevenueNetAmount(double revenueNetAmount) {
        this.revenueNetAmount = revenueNetAmount;
    }

    public double getZusAmount() {
        return zusAmount;
    }

    public void setZusAmount(double zusAmount) {
        this.zusAmount = zusAmount;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }
}
