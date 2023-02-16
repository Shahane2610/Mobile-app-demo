package com.service;

//import java.lang.reflect.Field;
//import java.util.List;
import java.util.Map;
//import java.util.Optional;

import com.dto.Responsedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;

import com.Repository.CreateLeadRepository;


import com.model.CreateLead;

@Service
public class HibernateServiceImpl implements  HibernateService {
	@Autowired
	CreateLeadRepository createLeadRepository;

	@Override
	public Responsedto CreateLead(CreateLead createLead ,Map<String, String> headers) {

		Responsedto responseDto=new Responsedto();
		try {
			createLeadRepository.save(createLead);
			responseDto.setStatus("Lead created successfully");
		}
		catch(Exception ex)
		{

			responseDto.setStatus("Some error occured while lead creation");
		}
		return responseDto;
		
	}
	
	
	

	@Override
	public Responsedto UpdateLead(CreateLead updateLead ,Map<String, String> headers)  {
		
		Responsedto responseDto=new Responsedto();
		try {
			String panNo = updateLead.getPanNo();
			CreateLead createLead = createLeadRepository.findByPanNoEquals(panNo);
			createLead.setGender(updateLead.getGender());
			createLead.setEmail(updateLead.getEmail());
			createLead.setAddress(updateLead.getAddress());

			createLeadRepository.save(createLead);
			responseDto.setStatus("Lead update successfully");
		}
		catch(Exception ex)
		{

			responseDto.setStatus("Some error occured while lead updation");
		}
		return responseDto;	
		
	}

	@Override
	public Responsedto UploadDocument(CreateLead uploadDocument, Map<String, String> headers) {
		Responsedto responseDto=new Responsedto();
		try {
			String panNo = uploadDocument.getPanNo();
			CreateLead createLead = createLeadRepository.findByPanNoEquals(panNo);
			createLead.setId_image(uploadDocument.getId_image());
			createLead.setSelfie_image(uploadDocument.getSelfie_image());
			createLeadRepository.save(createLead);
			responseDto.setStatus("document uploaded successfully");
		}
		catch(Exception ex)
		{

			responseDto.setStatus("Some error occured while document uploading");
		}
		return responseDto;
	}




}
