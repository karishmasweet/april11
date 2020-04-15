package Package;

public class Assignment_2 
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
	  return f;		 //(trying
  }
  
public int mult(int g,int h)
{ 
	int i;
	i=g*h;
	return i;
}

public void div(int j,int k)
{
	int x;
	x=j/k;
	System.out.println(j/k);
}
 public static void main(String[] args) 
 {
	 Assignment_2 obj=new Assignment_2();
	 int a=obj.sum(10,2);
	 int b=obj.sub(a,2);
	 int c=obj.sum(b,2);
	 int d=obj.mult(c,2);
	 obj.div(d,2);
	
}
}
