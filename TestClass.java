
class TestClass implements InterfaceTest{
	public static void main(String[] args) {
		InterfaceTest obj = new TestClass();
		obj.getModel();
		obj.getPrice();
		obj.TurnOffAlerm();
	}
	public void getModel() {
		System.out.println("Model is BMW");
	}
	public void getPrice() {
		System.out.println("Price is $5000 only");
		
	}
}