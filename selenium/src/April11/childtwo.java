package April11;

public class childtwo extends parent{
	
public void sum(int a,int b)
	
	{
	int x;
	x=a*b;
		System.out.println("I am child method of sum method but implenation is multiplication " +x);
	}
	
public static void main(String[] args) 
{System.out.println("Child method exist and parent method is  exit,result will be child method will ovride the parent method under Dynamic polymorphism");
System.out.println("****************************************************************");
	childtwo obj=new childtwo();
	obj.sum(6, 6);
}	

}
