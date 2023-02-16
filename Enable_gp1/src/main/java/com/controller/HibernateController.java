package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Responsedto;
//import com.dto.VarifyOtpdto;
import com.service.HibernateService;

import lombok.extern.slf4j.Slf4j;

import com.model.*;

@RestController
@Slf4j
public class HibernateController {

	@Autowired
	HibernateService hibernateService;

	@PostMapping(path="/CreateLead",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsedto  CreateLead(@RequestBody CreateLead createLead ,@RequestHeader Map<String, String> headers) {
		return hibernateService.CreateLead(createLead,headers);
	}

	@PostMapping(path="/UpdateLead",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsedto  UpdateLead(@RequestBody CreateLead updateLead ,@RequestHeader Map<String, String> headers)  {
		return hibernateService.UpdateLead(updateLead,headers);
	}

	@PostMapping(path="/UploadDocument",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsedto  UploadDocument(@RequestBody CreateLead uploadDocument ,@RequestHeader Map<String, String> headers) {
		 return hibernateService.UploadDocument(uploadDocument,headers);

	}


}
