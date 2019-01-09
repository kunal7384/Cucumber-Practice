package stepDefination;

public class UserData {
   public String Name;
   public String LastName;
   public String userNAme;
   public String Email;
   public String Passwordd;
   public String Cpassword;
   
	
	
	
public void  getUserData(String fname , String lname , String uname,String email,String pass , String cpass)
{
	System.out.println("444444");
	this.Name = fname;
	this.LastName = lname;
	this.userNAme = uname;
	this.Email = email;
	this.Passwordd = pass;
	this.Cpassword = cpass;


}

public String getfirstName()
{
	return Name;
	

}
public String getlastName()
{
	return LastName;
	

}
public String getuserName()
{
	return userNAme;
	

}
public String get_email()
{
	return Email;
	

}
public String get_password()
{
	return Passwordd;
	

}
public String get_cpassword()
{
	return Cpassword;
	

}

}
