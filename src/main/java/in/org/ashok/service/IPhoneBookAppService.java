package in.org.ashok.service;

import java.util.List;
import java.util.Optional;

import in.org.ashok.model.PhoneBook;

public interface IPhoneBookAppService {
	
	//save phone details
	Integer saveOrUpdatePhBook(PhoneBook pbook);
	
	//get One By Id
	Optional<PhoneBook> getOnePhBookById(Integer id);
	
	//get All 
	List<PhoneBook> getAllPhBook();
	
	//Delete By Id
	void deletePhBook(Integer id);

}
