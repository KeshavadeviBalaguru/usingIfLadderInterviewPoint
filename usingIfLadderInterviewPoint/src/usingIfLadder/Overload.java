package usingIfLadder;


public class Overload {
	void Series(int x,int n)
	{
		double s=0;
		for(int i=0;i<=n;i++)
		{
			s=s+(Math.pow(x, i));
			System.out.print(s+",");
		}
	}
	void Series() {
		float s=0;
		for(int i=2;i<=10;i++)
		{
			s=s+((float)1/i);
		}
		System.out.println("sum= "+s);
	} void Series(int p)
	{
		double s=0;
		for(int i=0;i<=5;i++)
		{
			s=(i*i*i)-1;
		}
		System.out.println("sum= "+s);
	}
	public static void main(String[] args) {
		 Overload a=new  Overload();
		 a.Series();
		 a.Series(6);
		 a.Series(2, 5);

	}
}
