package com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VarifyOtpdto {

	public void setOtp(String otp) {
		Otp = otp;
	}

	public void setHashString(String hashString) {
		HashString = hashString;
	}

	public String getOtp() {
		return Otp;
	}
	public String getHashString() {
		return HashString;
	}
	@JsonProperty("Otp")
	private String Otp;
	@JsonProperty("HashString")
    private String HashString;

}
