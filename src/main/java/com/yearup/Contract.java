package com.yearup;

public abstract class Contract {
    private String date;
    private String name;
    private String email;
    private Vehicle sold;


    public Contract(String date, String name, String email, Vehicle car){
        this.date = date;
        this.name = name;
        this.email = email;
        this.sold = car;
    }

    public Vehicle getSold() {
        return sold;
    }

    public void setSold(Vehicle sold) {
        this.sold = sold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();
}
