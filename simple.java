class simple {
	public static void main(String args[])
	{
		System.out.println("Hello java 1");
		System.out.println("Hello java 2");
		System.out.println("Hello java 3, f1");
		System.out.println("Hello java 4, f2, conflcit");
		System.out.println("Hello java 3, f1, test conflict");
	}

	public static void f1() 
	{
		System.out.println("Hello java f1, test-conflict");
	}

	public static void f2() 
	{
		System.out.println("Hello java f2");
	}

	public static void f3() 
	{
		System.out.println("Hello java f1");
		System.out.println("Hello java f2");
	}

	public static void f4() 
	{
	}
}
