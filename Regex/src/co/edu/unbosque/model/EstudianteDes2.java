package co.edu.unbosque.model;

public class EstudianteDes2 {
	private String name;
	private int age;
	private String school;
	private boolean hasCouple;
	
	public EstudianteDes2() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteDes2(String name, int age, String school, boolean hasCouple) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
		this.hasCouple = hasCouple;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public boolean isHasCouple() {
		return hasCouple;
	}

	public void setHasCouple(boolean hasCouple) {
		this.hasCouple = hasCouple;
	}

	@Override
	public String toString() {
		return "EstudianteDes2 [name=" + name + ", age=" + age + ", school=" + school + ", hasCouple=" + hasCouple
				+ "]";
	}
	
	
}
