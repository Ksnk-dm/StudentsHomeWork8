package students;

import java.io.Serializable;

public class Stud implements Serializable {
	private String name;
	private String surname;
	private int age;
	private int id;

	public Stud(String name, String surname, int age, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = id;
	}

	public Stud() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", surname=" + surname + ", age=" + age + ", id=" + id + "]";
	}

}
