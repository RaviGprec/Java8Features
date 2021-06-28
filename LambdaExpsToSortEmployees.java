import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpsToSortEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e1 = new Employee("Ravi","101","PS",1000000.0);
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Ravi","101","PS",1000000.0));
		elist.add(new Employee("Sahil","104","Cloud",1400000.0));
		elist.add(new Employee("Himanshu","102","Engineering",1200000.0));
		elist.add(new Employee("Salma","105","Support",900000.0));
		elist.add(new Employee("Suman","103","Sales",2000000.0));
		System.out.println("Before Sorting");
		for(Employee e: elist){
			System.out.println(e);
		}
		System.out.println("After Sorting");
		//Sort the employee list on basis of salary
		Collections.sort(elist,(e1,e2)->{
			return e1.salary.compareTo(e2.salary);
		});
		for(Employee e:elist) {
			System.out.println(e);
		}
	}

}
