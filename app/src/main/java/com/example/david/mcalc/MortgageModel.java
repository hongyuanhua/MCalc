package com.example.david.mcalc;

public class MortgageModel
{
    private double P;
    private double A;
    private double I;

    public MortgageModel(String p, String a, String i)
    {
        this.P = Double.parseDouble(p);
        this.A = Double.parseDouble(a);
        this.I = Double.parseDouble(i);
    }

    public String computePayment()
    {
        double r = this.I/100/12;
        double n = this.A*12;
        double factor1 = Math.pow(1+r,-n);
        double index = (r*this.P)/(1-factor1);
        String result =String.format("$%.0f",index);
        return result;
    }

    public String computeBalance()
    {
        double r = this.I/100/12;
        double n = this.A*12;
        double factor1 = Math.pow(1+r,-n);
        double index = (r*this.P)/(1-factor1);
        double x = 5*12;
        double result = this.P-(index/r-P)*(Math.pow(1+r,x)-1);
        String balance = String.format("$%,.0f",result);
        return balance;
    }
}
