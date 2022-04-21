package objectSortingPackage;

public class Student implements Comparable<Student>{
	
	private String name;
	private int id;
	private String address;
	
	@Override
	public int compareTo(Student o) {
		
		return this.getId()-o.getId();
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	
	

}
