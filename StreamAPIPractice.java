import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIPractice {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		//How many male and female employees are there in the organization?
		//For queries where you need to group the input elements, use the Collectors.groupingBy() method. In this query, we use Collectors.groupingBy() method which takes two arguments. We pass Employee::getGender as first argument which groups the input elements based on gender and Collectors.counting() as second argument which counts the number of entries in each group.
		Map<String, Long> noOfMaleFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("How many male and female employees are there in the organization?"+noOfMaleFemaleEmployees);
		//Print the name of all departments in the organization?
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(e -> System.out.println(e));
		// What is the average age of male and female employees?
		Map<String, Double> avgAgeOFMaleFemales = employeeList.
				stream().
				collect(
							Collectors.groupingBy(
								Employee::getGender,
								Collectors.averagingInt(Employee::getAge)
							)
						);
		System.out.println("What is the average age of male and female employees?");
		System.out.println("-----------------------------------------------------");
		System.out.println(avgAgeOFMaleFemales);
		// Get the details of highest paid employee in the organization?
		Optional<Employee> highestPaidEmployee = employeeList.
				stream().
				collect(
						Collectors.maxBy(
								Comparator.comparingDouble(
										Employee::getSalary
										)
								)
						);
		System.out.println("-----------------------------------------------------");
		System.out.println("Highest Paid Employee");
		System.out.println("-----------------------------------------------------");
		System.out.println(highestPaidEmployee);
		//Get the names of all employees who have joined after 2015?
		System.out.println("employees who have joined after 2015");
		System.out.println("-----------------------------------------------------");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(e -> System.out.println(e));
//		List<Employee> empsJoinedAfter2015 = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).collect(Collectors.toList());
//		System.out.println(empsJoinedAfter2015);
		// Count the number of employees in each department?
		Map<String,Long> empsGroupByDept = employeeList.
				stream().collect(
							Collectors.groupingBy(Employee::getDepartment, Collectors.counting())
						);
		System.out.println("-----------------------------------------------------");
		System.out.println("Count the number of employees in each department");
		System.out.println("-----------------------------------------------------");
		empsGroupByDept.forEach((k,v) -> System.out.println(k+":"+v));
		//What is the average salary of each department?
		Map<String, Double> avgSalDeptWise = employeeList.
				stream().
				collect(
						Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))
				);
		System.out.println("-----------------------------------------------------");
		System.out.println("average salary of each department");
		System.out.println("-----------------------------------------------------");
		avgSalDeptWise.forEach((k,v) -> System.out.println(k+":"+v));
		
		//Get the details of youngest male employee in the product development department?
		System.out.println("-----------------------------------------------------");
		System.out.println("youngest male employee in the product development department");
		System.out.println("-----------------------------------------------------");
		Optional<Employee> youngEmpInProdDevTeam = employeeList.stream().
				filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development").
				min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngEmpInProdDevTeam.get());
		// List down the names of all employees in each department?
		Map<String, List<Employee>> empNamesByDeptName = employeeList.stream().
				collect(
						Collectors.groupingBy(Employee::getDepartment)
				);
		System.out.println("-----------------------------------------------------");
		System.out.println("List down the names of all employees in each department");
		System.out.println("-----------------------------------------------------");
		empNamesByDeptName.forEach((k,v) ->{
			System.out.println("DepartName:"+k);
			System.out.println("--------------------");
			v.forEach(e -> System.out.println(e.getName()));
		});
	}

}
