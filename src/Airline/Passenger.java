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
public class Passenger {

    public Passenger()
    {
   
        passengerName="";
        type="";
        age=0;
        genter="";
        passportNo="";
    }
    public Passenger(String t,String name,String g,String no,int a,int x)
    {
       // tNo=tNo++;
        passengerName=name;
        type=t;
        age=a;
        genter=g;
        passportNo=no;
        sNo=x;
    }
    public Passenger(String t,String name,String g,int a,int x)
    {
        //tNo=tNo++;
        passengerName=name;
        type=t;
        age=a;
        genter=g;
        sNo=x;
    }
    public void setName(String n)
    {
        passengerName=n;
    }
    public String getName()
    {
        return passengerName;
    }
    public void setType(String n)
    {
        type=n;
    }
    public String getType()
    {
        return type;
    }
    public void setGenter(String n)
    {
        genter=n;
    }
    public String getGenter()
    {
        return genter;
    }
    public void setPNo(String n)
    {
        passportNo=n;
    }
    public String getPNo()
    {
        return passportNo;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }
    /*public static int getTNo()
    {
        return tNo;
    }*/
    public int getSNo()
    {
        return sNo;
    }
    
    //variables
    private String passengerName;
    private String type;
    private int age;
    private String genter;
    private String passportNo;
     //TicketNO
    private int sNo;  //SheatNO
}
