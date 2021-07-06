
public class Customer {

	private int id;
	private String cname,addr,emailId;
	public Customer(int id, String cname, String addr, String emailId) {
		super();
		this.id = id;
		this.cname = cname;
		this.addr = addr;
		this.emailId = emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", addr=" + addr + ", emailId=" + emailId + "]";
	}
	
}
