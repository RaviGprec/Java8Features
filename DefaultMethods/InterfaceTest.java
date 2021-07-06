
public interface InterfaceTest {
	void getModel();
	void getPrice();
	default void TurnOnAlerm() {
		System.out.println("Alerm is turned ON");
	}
	default void TurnOffAlerm() {
		System.out.println("Alerm is turned OFF");
	}

}

