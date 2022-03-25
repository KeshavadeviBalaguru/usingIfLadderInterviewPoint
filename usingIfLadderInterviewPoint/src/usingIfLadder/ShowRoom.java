package usingIfLadder;

import java.util.Scanner;



public class ShowRoom {
	String Name;
	long MobileNumber;
	double Cost;
	double Discount;
	double Amount;
	
	public void ShowRoom()
	{
	  Name="";
	  MobileNumber=0000000l;
	  Cost=00000.00;
	}
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		Name=s.next();
		System.out.println("Enter Mobile Number: ");
		MobileNumber=s.nextLong();
		System.out.println("Enter the Cost: ");
		Cost=s.nextDouble();
		
		
	}
	public void calculate()
	{
		if(Cost<10000)
		{
			Discount=((Cost*5)/100);
			Amount=Cost-Discount;
		}
		else if(Cost>10000 && Cost<=20000)
		{
			Discount=((Cost*10)/100);
			Amount=Cost-Discount;
		}
		else if(Cost>20000 && Cost<=35000)
		{
			Discount=((Cost*15)/100);
			Amount=Cost-Discount;
		}
		else if(Cost>35000)
		{
			Discount=((Cost*20)/100);
			Amount=Cost-Discount;
			
		}
		}
		public void display()
		{
			System.out.println("Name of the Customer:   "+Name);
			System.out.println("Customer MobileNumber:  "+MobileNumber);
			System.out.println("Amount:  "+Amount);
		}
	

	public static void main(String[] args) {
		ShowRoom sr=new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();
		
		

	}
}
