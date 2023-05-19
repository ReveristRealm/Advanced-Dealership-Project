package com.yearup;

public class SalesContract extends Contract {
    private double salesTaxAmount;
    private int recordingFee;
    private int processingFee;
    private boolean finance;

    public SalesContract(String date, String name, String email, Vehicle car) {
        super(date, name, email,car);
        this.salesTaxAmount = 0.05;
        this.recordingFee = 100;
        this.finance = false;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public int getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotalPrice() {
        if (isFinance()) {
            if (getSold().getPrice() > 10000) {
                return (((getMonthlyPayment() * 48)  + 595) + (((getMonthlyPayment() * 48)  + 595) * .05));
            } else {
                return (((getMonthlyPayment() * 24)  + 395) + (((getMonthlyPayment() * 48)  + 395) * .05));
            }
        }
        if(getSold().getPrice() > 10000) {
            return ((getSold().getPrice() * 0.05) + 595);
        }
        return ((getSold().getPrice() * 0.05) + 395);
    }

    @Override
    public double getMonthlyPayment() {
        if (isFinance()) {
            if (getSold().getPrice() >= 10000) {
                return (getSold().getPrice() * 0.0425);
            } else{
                return (getSold().getPrice() * 0.0525);
            }
        }
        return 0;
    }
}
