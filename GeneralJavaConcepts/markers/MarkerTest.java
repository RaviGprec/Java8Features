package markers;

public class MarkerTest {
	public static void delete(Object obj) {
		if(obj instanceof Deletable) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("You don't have the access to delete");
		}
	}
	public static void main(String[] args) {
		Entity e=new Entity();
		delete(e);
		delete(new MarkerTest());
	}

}
