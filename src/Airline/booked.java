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
class booked {
    String fname,fno,amount,time,date,From,To;
    String getFrom;
    public booked(String fname,String fno,String amount,String time,String date,String From,String To)
    {
        this.fname=fname;
        this.fno=fno;
        this.amount=amount;
        this.time=time;
        this.date=date;
        this.From=From;
        this.To=To;
    }
    public void setFName(String name)
    {
        fname=name;
    }
    public String getFName()
    {
        return fname;
    }
    public void setFNo(String NO)
    {
        fno=NO;
    }
    public String getFNo()
    {
        return fno;
    }
    public String getAmount()
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
    public String getFrom()
    {
        return From;
    }
    public String getTo()
    {
        return To;
    }
}
