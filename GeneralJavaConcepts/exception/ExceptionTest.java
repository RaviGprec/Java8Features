package exception;

public class ExceptionTest {
	
	public static void processOrder(int  id) throws OrderNotFound {
		if(id <= 0) {
			throw new OrderNotFound("Invalid Order Id or OrderNotFound with id="+id);
		}
		else {
			System.out.println("Order processed successfully. Waiting for next order");
		}
	}
	public static int m1() {
		try {
			throw new Exception();
			
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}

	}

	public static void main(String[] args) throws OrderNotFound {
		processOrder(1);
		System.out.println(m1());
		
		
	}

}
