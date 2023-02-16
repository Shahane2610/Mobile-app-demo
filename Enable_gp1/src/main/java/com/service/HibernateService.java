package com.service;

import java.util.Map;

//import com.Repository.UpdateLeadRepository;
import com.dto.Responsedto;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;


import com.model.CreateLead;


@Service
public interface HibernateService {
	
	
	public Responsedto CreateLead(CreateLead createLead , Map<String, String> headers) ;
	
	public Responsedto UpdateLead(CreateLead updateLead , Map<String, String> headers) ;

	public Responsedto UploadDocument(CreateLead uploadDocument ,Map<String, String> headers) ;
	
}
