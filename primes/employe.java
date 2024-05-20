package primes;

public class employe {
     private String ename,email;
     private int Id;
     
	@Override
	public String toString() {
		return "employe [ename=" + ename + ", email=" + email + ", Id=" + Id + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
     
}
