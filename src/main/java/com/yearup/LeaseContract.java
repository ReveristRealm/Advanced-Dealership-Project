package com.yearup;

public class LeaseContract extends Contract{
    private double exEndVal;
    private double leaseFee;
    public LeaseContract(String date, String name, String email, Vehicle car){
        super(date, name, email,car);
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}

