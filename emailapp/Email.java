package emailapp;

import java.util.Scanner;

public class Email {
private String firstname;
private String lastname;
private String password;
private String department;
private String email;
private int defaultpasswordlength=10;
private int mailboxcapacity=500;
private String alternatemail;
private String domain="srishakthi.ac.in";
 
  public Email(String firstname,String lastname) {
	 this.firstname=firstname;
	 this.lastname=lastname;
	 
	 this.department=setDepartment();
	 
	 this.password = randomPassword(defaultpasswordlength);
	 System.out.println("Your Password is: "+this.password);
	 
	 email= firstname.toLowerCase() + lastname.toLowerCase() + "@" + department +"."+ domain;
	 
  }
  private String setDepartment() {
	  System.out.print("Department codes \n1.Programming\n2.Testing\n3.FullStack\n0.None\nEnter Department");
	  Scanner in=new Scanner(System.in);
	  int depChoice=in.nextInt();
	  if(depChoice==1) { return "Programming"; }
	  else if(depChoice== 2) { return "Testing"; }
	  else if(depChoice== 3) { return "FullStack"; }
	  else { return ""; }	  
  }
  private String randomPassword(int length) {
	  String passwordSet = "ABCDEFFGHIJKLMNOPQRSTUVWXYZ1234567890@#$&";
	  char[] password=new char[length];
	  for(int i=0;i<length;i++) {
		 int rand = (int)(Math.random()* passwordSet.length());
		 password[i] = passwordSet.charAt(rand);
	  }
	  return new String(password);
  }
  public void setMailboxcapacity(int capacity) {
	  this.mailboxcapacity=capacity;
  }
  public void setalternateEmail(String altmail) {
	  this.alternatemail=altmail;
  }
  public void changePassword(String password) {
	  this.password=password;
  }
  public int getMailboxcapacity() { return mailboxcapacity; }
  public String getalternateEmail() { return alternatemail; }
  public String getpassword() {return password; }
  public String showInfo() {
	  return "Display Name: " +firstname +" "+lastname+
	  		"\nMail Id: "+ email + 
	  		"\nMailbox Capacity : " +mailboxcapacity+ "mb";
	  
  }


}
