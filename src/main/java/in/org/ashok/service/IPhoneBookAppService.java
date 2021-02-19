package in.org.ashok.service;

import java.util.List;
import java.util.Optional;

import in.org.ashok.model.ContactInfo;

public interface IPhoneBookAppService {
	
	//Save Or Update Contact details
	Integer saveOrUpdateContact(ContactInfo pbook);
	
	//Get One Contact By Id
	Optional<ContactInfo> getOnePhBookById(Integer id);
	
	//Get All Contact
	List<ContactInfo> getAllPhBook();
	
	//Delete Contact By Id
	void deletePhBook(Integer id);

}
