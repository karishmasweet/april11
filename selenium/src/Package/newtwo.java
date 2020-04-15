package Package;

import java.util.*;

public class newtwo 
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
			
	}
	
  public int sub(int d, int e)
  {
	  int f;
	  f=d-e;
	  return f;		 
  }
  
public int mult(int g,int h)
{ 
	int i;
	i=g*h;
	return i;
}

public int div(int j,int k)
{
	int x;
	x=j/k;
	return x;
	//System.out.println(j/k);
	//System.out.println("Expression value will be (((((x1+x2)-x3)+x4)*x5)/x5)="+x);
}
 public static void main(String[] args) 
 
 {
	Scanner obj=new Scanner(System.in);
	System.out.println("Please enter the value of x1");
	int x1=obj.nextInt();
	
	System.out.println("Please enter the value of x2");
	int x2=obj.nextInt();
	
	System.out.println("Please enter the value of x3");
	int x3=obj.nextInt();
	
	System.out.println("Please enter the value of x4");
	int x4=obj.nextInt();
	
	System.out.println("Please enter the value of x5");
	int x5=obj.nextInt();
	
	System.out.println("Please enter the value of x6");
	int x6=obj.nextInt();

	newtwo deep=new newtwo();
    int A=deep.sum(x1,x2);
    int B=deep.sub(A,x3);
    int C=deep.sum(B,x4);
    int D=deep.mult(C,x5);
    int E=deep.div(D, x6);
    System.out.println("Expression value will be (((((x1+x2)-x3)+x4)*x5)/x5)=" +E);
    
}

}
