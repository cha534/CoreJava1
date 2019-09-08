package Com.gm.variable;

public class NonStaticVariables {
	int i = 10;
	int a =20;//nonstatic variables
	
	public void method()
	{
		System.out.println(i);
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		NonStaticVariables obj = new NonStaticVariables();
		System.out.println(obj.a);//object is mandatory
		System.out.println(obj.i);
		
		

	}

}
