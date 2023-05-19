package com.yearup;

public class LeaseContract extends Contract{
    private double exEndVal;
    private double leaseFee;
    public LeaseContract(String date, String name, String email, Vehicle car){
        super(date, name, email,car);
        this.leaseFee = car.getPrice() * .07;
        this.exEndVal = car.getPrice() * .5;
    }

    public double getExEndVal() {
        return exEndVal;
    }

    public void setExEndVal(double exEndVal) {
        this.exEndVal = exEndVal;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice() {
        return (getSold().getPrice() - exEndVal) + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        return ((getExEndVal() / 36) + (getExEndVal() * 0.04));
    }
}

