// program to demostrate static block
public class Four {
	/* this is static block, this executes before main()*/
	static {
		System.out.println(" static block");
	}
	/* this line executes 2nd */
	void displayOutput()
	{
		System.out.println("line one");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj = new Four();
		obj.displayOutput();
		/* this line executes last*/
		System.out.println("line two");
	}
}
	