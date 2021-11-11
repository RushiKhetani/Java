class Test
{
	static int x = 10;	
}
class Ex22 extends Test
{
    int x = 40;

    void method()
	{
		System.out.println("Value of Instance variable :" + super.x);
		System.out.println("Value of Local variable :"+ x);
	}

	public static void main(String args[])
	{
		Ex22 obj1 = new Ex22();
		obj1.method();
	}
}
