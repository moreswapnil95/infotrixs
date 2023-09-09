package request;

import entity.User;

public class UserRequest {

private int id;
	
	private String firstname;
	
	private String lastname;
	
	private String username;
	
	private String password;
	
	private long phone;

	public UserRequest(int id, String firstname, String lastname, String username, String password, long phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}

	public UserRequest(User user) {
		// TODO Auto-generated constructor stub
		firstname=user.getFirstname();
		lastname=user.getLastname();
		username=user.getUsername();
		phone=user.getPhone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
