package usingIfLadder;

import java.util.Scanner;



public class BookFair { 
	String BName;

	double Price;
	double Discount;
	double AfterDiscount;
	BookFair()
	{
		BName="";
		Price=0000.00;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Name:");
		BName=sc.next();
		System.out.println("Enter the Price: ");
		Price=sc.nextDouble();

	}
	void calculate()
	{
		if(Price<=1000)
		{
			Discount=((Price*2)/100);
			AfterDiscount=Price-Discount;

		}
		else if(Price>1000 && Price<=3000)
		{
			Discount=((Price*10)/100);
			AfterDiscount=Price-Discount;

		}
		else if(Price>3000)
		{
			Discount=((Price*15)/100);
			AfterDiscount=Price-Discount;
		}
	}
	void display()
	{
		System.out.println("BookName:   "+BName);
		System.out.println("Price:  "+Price);
		System.out.println("AfterDiscount:   "+AfterDiscount);
	}

	public static void main(String[] args) {
		BookFair bf=new BookFair();
		bf.input();
		bf.calculate();
		bf.display();
		// TODO Auto-generated method stub

	}
}
