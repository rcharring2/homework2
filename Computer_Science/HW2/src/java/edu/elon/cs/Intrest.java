package edu.elon.cs;


import java.io.Serializable;

/*
 * Copyright 10/20/2015 Ryan Harrington and Zack Layne
 */

/**
 *
 * @author jdharring and zlayne
 */
public class Intrest implements Serializable{
    private String invAmt;
    private double rate;
    private int years;
    private String result;

    
    
    public Intrest(){
        invAmt = "";
        rate = 0;
        years = 0;
        result = "";
    }
    
    public Intrest(String invAmt, double rate, int years, String result){
        this.invAmt = invAmt;
        this.rate = rate;
        this.years = years;
        this.result = result;
    }
    
    public String getInvAmt(){
        return invAmt;
    }
    public void setInvAmt(String investment){
        invAmt = investment;
    }
    public double getRate(){
        return rate;
    }
    public void setRate(double r){
        rate = r;
    }
    public int getYears(){
        return years;
    }
    public void setYears(int year){
        years = year;
    }
    public String getResult(){
        return result;
    }
    public void setResult(String r){
        result = r;
    }
}
