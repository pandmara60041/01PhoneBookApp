package in.org.ashok.service;

import java.util.List;
import java.util.Optional;

import in.org.ashok.model.ContactInfo;

public interface IContactInfoService {
	
	//Save Or Update Contact details
	boolean saveOrUpdateContactInfo(ContactInfo contactInfo);
	
	//Get One Contact By Id
	Optional<ContactInfo> getOneContactInfoById(Integer ContactId);
	
	//Get All Contact
	List<ContactInfo> getAllContactInfo();
	
	//Delete Contact By Id
	boolean deleteContactInfoById(Integer ContactId);

}
