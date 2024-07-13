package Airline;

public class Cretential
{
	private String firstname;
	private String secondname;
	private String username;
	private String password;
	private String mail;
	public String getUser()
	{
		return username;
	}
	public String getF()
	{
		return firstname;
	}
	public String getS()
	{
		return secondname;
	}
	public String getPwd()
	{
		return password;
	}
	public String getMail()
	{
		return mail;
	}
	public Cretential()
	{
		firstname = "";
		secondname = "";
		username = "";
		password = "";
		mail="";
	}
	public Cretential(String f,String s,String n,String m,String p)
	{
		firstname = f;
		secondname = s;
		username = n;
		mail= m;
                password=p;
	}
	public Cretential(String n,String p)
	{
		username = n;
		password = p;
	}
}