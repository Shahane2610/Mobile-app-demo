package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.dto.*;
//import com.dto.Responsedto;
//import com.dto.VarifyOtpdto;
import com.service.Myservice_int;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Myrestcontroller {


	@Autowired
	Myservice_int myservice;
	@PostMapping(value="/validateOtp",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsedto VarifyOtp(@RequestBody VarifyOtpdto varifyOtpAttribs ,@RequestHeader Map<String, String> headers) {
		return myservice.VarifyOtp(varifyOtpAttribs, headers);


	}
	
	
	
	}



