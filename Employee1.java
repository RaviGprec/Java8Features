public class Employee1{
	String ename;
	String eid;
	String bunit;
	Double salary;
	public Employee1(String ename, String eid, String bunit, Double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.bunit = bunit;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getBunit() {
		return bunit;
	}
	
	public void setBunit(String bunit) {
		this.bunit = bunit;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", bunit=" + bunit + ", salary=" + salary + "]";
	}
	
}

