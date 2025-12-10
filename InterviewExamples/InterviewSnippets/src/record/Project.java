package record;

/*
class Student2 {
	
	private final int id;
	private final String name;
	
	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}
*/

public class Project {

	public static void main(String[] args) {
		
		Student2 student1 = new Student2(1, "Bhanu");
		Student2 student2 = new Student2(1, "Bhanu");
		
		System.out.println(student1.equals(student2));
		System.out.println(student1);
	}
}
