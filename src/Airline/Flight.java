/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

/**
 *
 * @author Sriraj
 */
public class Flight {
    
    public Flight(String name,String no,int amount,String date)
    {
        fName=name;
        fNo=no;
        this.amount=amount;
        //this.time=time;
        this.date=date;
    }
    public Flight(String name,String no,String vno,int amount,String date)
    {
        fName=name;
        fNo=no;
        visaNo=vno;
        this.amount=amount;
        //this.time=time;
        this.date=date;
    }

    public Flight() {
        fName=" ";
        fNo=" ";
        visaNo=" ";
        this.amount=0;
        //this.time=time;
        this.date=" ";
    }
    public void setFName(String name)
    {
        fName=name;
    }
    public String getFName()
    {
        return fName;
    }
    public void setFNo(String NO)
    {
        fNo=NO;
    }
    public String getFNo()
    {
        return fNo;
    }
    public void setAmount(int Amount)
    {
        amount=Amount;
    }
    public int getAmount()
    {
        return amount;
    }
    public void setDate(String Date)
    {
        date=Date;
    }
    public String getDate()
    {
        return date;
    }
    public void setTime(String Time)
    {
        time=Time;
    }
    public String getTime()
    {
        return time;
    }
    
    
    //variables
    String fName;
    String fNo;
    int amount;
    String time;
    String date;
    String visaNo;
}
