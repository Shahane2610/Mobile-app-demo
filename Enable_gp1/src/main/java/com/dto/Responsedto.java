package com.dto;

import lombok.Data;

@Data
public class Responsedto {

	public String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOtp_status() {
		return Otp_status;
	}

	public void setOtp_status(String otp_status) {
		Otp_status = otp_status;
	}

	private String Otp_status;
	 

}
