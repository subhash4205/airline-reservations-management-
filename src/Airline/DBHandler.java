package Airline;
import java.sql.*;
import java.io.*;
import java.lang.*;

public class DBHandler
{
	Connection con;
	Statement st;
	public DBHandler()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines?serverTimezone=UTC","root","admin");
			System.out.println("Conn Success");
			st=con.createStatement();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
        public Cretential reChecker(String name,String mail)
	{
		Cretential c=null;
		try
		{
			String query="select * from Cretential where username='"+name+"' AND mail='"+mail+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs!=null)
				if(rs.next())
					c=new Cretential(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}
		catch(Exception ex)
		{ 
			System.out.println(ex); 
		}
		return c;
	}
	public Cretential LoginChecker(String name,String pw)
	{
		Cretential c=null;
		try
		{
			String query="select * from cretential where username='"+name+"' AND password='"+pw+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs!=null)
				if(rs.next())
					c=new Cretential(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}
		catch(Exception ex)
		{ 
			System.out.println(ex); 
		}
		return c;
	}
	public Cretential insertCretential(Cretential c)
	{
		int x,n;
		x=0;n=0;
		Cretential S=null;
		try
		{
			String query="insert into Cretential values('"+c.getF() +"','"+ c.getS()+"','"+c.getUser()+"','"+ c.getMail()+"','"+c.getPwd()+"')";
			x=st.executeUpdate(query);
			if(x>0)
			{
				String q="select * from Cretential where username='"+c.getUser()+"' OR mail='"+c.getMail()+"'";
				ResultSet rs=st.executeQuery(q);
				if(rs!=null)
                                    if(rs.next())
						S=new Cretential(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));

				/*if(rs1==null)				{

					/*if(rs.next())
						S=new Cretential(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
					if(S.getMail()==c.getMail())
				}
				else
				{
					if(x==-1)
					{
						x=-3;System.out.println("present username ane mail");
					}
					else{
							x=-2;System.out.println("present mail");}
						String query2="delete from Cretential where firstname='"+c.getF() +"' AND secondname='"+ c.getS()+"' AND username='"+c.getUser()+"' AND mail='"+c.getMail()+"'";
						n=st.executeUpdate(query2);
				}*/
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return S;   
	}
        public int deleteCretential(Cretential C)
        {
            return 0;
        }
        public int insertPassenger(Passenger p,Flight f)
        {
            int x;
            x=0;
            
            try
            {
		String query="insert into passenger values('"+p.getType() +"','"+ p.getName()+"','"+p.getGenter()+"','"+ p.getPNo()+"','"+p.getAge()+"','"+f.getAmount()+"','"+p.getSNo()+"','"+f.getFNo()+"')";
		x=st.executeUpdate(query);
            }
            catch(Exception ex)
            {
		System.out.println(ex);
            }
            return x;
        }
        @SuppressWarnings("empty-statement")
        public booked[] checkFlights(String from,String to)
        {
                String fname,fno,amount,time,date,From,To;
                int i=0;
                booked  b[]= null;
		try
		{
			String query="select * from Flight where from1='"+from+"' AND to1='"+to+"'";
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
                        {
                           fname=rs.getString(1);
                           fno=rs.getString(2);
                           amount=rs.getString(3);
                           time=rs.getString(4);
                           date=rs.getString(5);
                           From=rs.getString(6);
                           To=rs.getString(7);
                           b[++i]=new booked(fname,fno,amount,time,date,From,To);
                        }
		}
		catch(Exception ex)
		{ 
			System.out.println(ex); 
                }
                return b;
        }
        public booked[] checkFlight()
        {
                String fname,fno,amount,time,date,From,To;
                int i=0;
                booked  b[]= null;
		try
		{
			//String query="select * from Flight";
			//ResultSet rs=st.executeQuery(query);
			/*while(rs.next())
                        {
                           fname=rs.getString(1);
                           fno=rs.getString(2);
                           amount=rs.getString(3);
                           time=rs.getString(4);
                           date=rs.getString(5);
                           From=rs.getString(6);
                           To=rs.getString(7);
                           b[++i]=new booked(fname,fno,amount,time,date,From,To);
                        }*/
		}
		catch(Exception ex)
		{ 
			System.out.println(ex); 
                }
                return b;   
        }
}