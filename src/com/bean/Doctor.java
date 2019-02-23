package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	private String doctorId;
	private String doctorName;
	private String dateOfBirth;
	private String dateOfJoining;
	private String gender;
	private String qualification;
	private String specialization;
	private String yearsOfExperience;
	private String street;
	private String location;
	private String city;
	private String state;
	private String pincode;
	private String mobileNumber;
	private String emailId;

	public Doctor(String doctorName, String dateOfBirth,
			String dateOfJoining, String gender, String qualification,
			String specialization, String yearsOfExperience, String street,
			String location, String city, String state, String pincode,
			String mobileNumber, String emailId) {
		super();
		this.doctorName = doctorName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.gender = gender;
		this.qualification = qualification;
		this.specialization = specialization;
		this.yearsOfExperience = yearsOfExperience;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getmobileNumber() {
		return mobileNumber;
	}

	public void setmobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "DoctorBean [doctorId=" + doctorId + ", doctorName="
				+ doctorName + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + ", gender=" + gender
				+ ", qualification=" + qualification + ", specialization="
				+ specialization + ", yearsOfExperience=" + yearsOfExperience
				+ ", street=" + street + ", location=" + location + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ "]";
	}

}
