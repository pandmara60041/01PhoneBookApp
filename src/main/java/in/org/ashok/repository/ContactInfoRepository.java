package in.org.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.org.ashok.model.ContactInfo;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Integer> {
	
	
	

}
