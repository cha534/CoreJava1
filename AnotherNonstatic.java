package Com.gm.variable;

public class AnotherNonstatic {
	public void method()
	{
		NonStaticVariables obj = new NonStaticVariables();
		System.out.println(obj.a);
		System.out.println(obj.i);
	}

	public static void main(String[] args) {

		NonStaticVariables obj= new NonStaticVariables();
		System.out.println(obj.a);
		System.out.println(obj.i);
		obj.method();
	}
	}

