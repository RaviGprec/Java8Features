interface NewInterface{
	void abstractMethod();//
	default void defaultMethod() {
		System.out.println("This is from defaultMethod");
	}
	static void staticMethod() {
		System.out.println("This is from staticMethod");
	}
}
public class Java8Interfaces implements NewInterface{

	public static void main(String[] args) {
		NewInterface obj=new Java8Interfaces();
		obj.defaultMethod();
		//obj.staticMethod();//This will give ERROR as staticMethod() belongs to NewInterfaces only
		NewInterface.staticMethod();
		obj.abstractMethod();
		staticMethod();//This will call Java8Interfaces's method not it's parent. So this will re-direct ti line21 instead if line6
	}
	//This is also possible but this is not overriding of NewInterfaces interface but this is just like normal method
	static void staticMethod() {
		System.out.println("This is from Implementation class");
	}
	@Override
	public void abstractMethod() {
		System.out.println("This is from abstractMethod() (From implementation class)");
		
	}

}
