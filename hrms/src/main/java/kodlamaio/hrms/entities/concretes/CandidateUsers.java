package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="candidate_users")
public class CandidateUsers extends Users{
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surName;
	
	@Column(name="identity_number")
	private String iNumber;
	
	@Column(name="birth_year")
	private String birthYear;

	public CandidateUsers() {
		
	}
	public CandidateUsers(int id, String name, String surName, String iNumber, String birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.iNumber = iNumber;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getiNumber() {
		return iNumber;
	}
	public void setiNumber(String iNumber) {
		this.iNumber = iNumber;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	
	

}
