package com.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
@Table(name="CreateLeads")
@AllArgsConstructor
@NoArgsConstructor

public class CreateLead {

	public Long getLead_id() {
		return Lead_id;
	}

	public void setLead_id(Long lead_id) {
		Lead_id = lead_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getPan_status() {
		return Pan_status;
	}

	public void setPan_status(String pan_status) {
		Pan_status = pan_status;
	}

	public String getPan_last_updated_on() {
		return Pan_last_updated_on;
	}

	public void setPan_last_updated_on(String pan_last_updated_on) {
		Pan_last_updated_on = pan_last_updated_on;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getSelfie_image() {
		return Selfie_image;
	}

	public void setSelfie_image(String selfie_image) {
		Selfie_image = selfie_image;
	}

	public String getId_image() {
		return Id_image;
	}

	public void setId_image(String id_image) {
		Id_image = id_image;
	}

	public Boolean getRecord_update_status() {
		return Record_update_status;
	}

	public void setRecord_update_status(Boolean record_update_status) {
		Record_update_status = record_update_status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("Lead_id")
	private Long Lead_id;

	@JsonProperty("Name")
	private String Name;

	@Column(name="pan_no",unique = true)
	@JsonProperty("Pan_no")
	private String panNo;

	@JsonProperty("Pan_status")
	private String Pan_status;

	@JsonProperty("Pan_last_updated_on")
	private String Pan_last_updated_on;

	@JsonProperty("Gender")
	private String Gender;

	@JsonProperty("Email")
	private String Email;

	@JsonProperty("Address")
	private String Address;

	@JsonProperty("Selfie_image")
	@Column(columnDefinition = "TEXT")
	private String Selfie_image;

	@JsonProperty("Id_image")
	@Column(columnDefinition = "TEXT")
	private String Id_image;

	@JsonProperty("Record_update_status")
	private Boolean Record_update_status;

}