package Package2;

public class child extends parent

{
	public child()
	{
 this(1,2,3);
		System.out.println("Child default constructor");
	}
	
	public child(int a)
	{
		this();//print the default

		System.out.println("Child 1 parameterized constructor");
	}
	public child(int a,int b)
	{
		this(1,2,3,4);// print "Child 2 parameterized constructor" after then print the Child 4 parameterized constructor
	
		System.out.println("Child 2 parameterized constructor");
	}
	public child(int a, int b, int c)
	{ 
	
   super(1,2);
		System.out.println("Child 3 parameterized constructor");
	}
	public child(int a,int b,int c,int d)
	{
   this(1); // print the child 1 parameterized constructor
		System.out.println("Child 4 parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		child kanika=new child(1,2);// go to child 2 parameterized 
	
	

//Parent 3 parameterized constructor
//Parent default constructor
//Parent 1 parameterized constructor
//Parent 2 parameterized constructor
//Child 3 parameterized constructor
//Child default constructor
//Child 1 parameterized constructor
//Child 4 parameterized constructor
//Child 2 parameterized constructor

		//here is sequence from bottom first print child 2
		
		
	}

}
