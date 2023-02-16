package com.Repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.CreateLead;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateLeadRepository extends JpaRepository<CreateLead,String> {

	CreateLead findByPanNoEquals(String panNo);

}
