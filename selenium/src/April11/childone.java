package April11;

public class childone extends parent
{
	
public void sum(int a,int b)
	
	{
	int x;
	x=a*b;
		System.out.println("I am child method " +x);
	}

public static void main(String[] args) 
{
	System.out.println("Child method exist but parent method is not exit,result will be child method come Dynamic polymorphism");
	System.out.println("****************************************************************");
	childone obj=new childone();
	obj.sum(6,6);
}

}
