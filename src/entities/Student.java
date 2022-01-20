package entities;

import java.util.Objects;

public class Student {
	
	String name;
	Integer registrationNumber;
	
	
	public Student(String name, Integer registrationNumber) {
		this.name = name;
		this.registrationNumber = registrationNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registrationNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(registrationNumber, other.registrationNumber);
	}
	
	
	

}
