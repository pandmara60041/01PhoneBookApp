package in.org.ashok.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.org.ashok.model.ContactInfo;
import in.org.ashok.service.IContactInfoService;

@RestController
public class ContactInfoRestContrller {
	
	@Autowired
	private IContactInfoService service;
	
	/*
	public ContactInfoRestContrller() {
		this.service = service;
	}*/
	
	@PostMapping
	public ResponseEntity<String> saveContactInfo(@RequestBody ContactInfo contactInfo){
		boolean saveContactInfo = service.saveOrUpdateContactInfo(contactInfo);
		if (saveContactInfo) {
			return new ResponseEntity<>("Contact saved", HttpStatus.CREATED);
		}
		return new ResponseEntity<>("failed to save", HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@GetMapping
	public ResponseEntity<List<ContactInfo>> getAllContactInfo(){
		List<ContactInfo> contactInfo = service.getAllContactInfo();
		return new ResponseEntity<>(contactInfo, HttpStatus.OK);
	}
	
	@GetMapping("/{contactId}")
	public ResponseEntity<Optional<ContactInfo>> getOneContactInfoById(@PathVariable Integer contactId){
		Optional<ContactInfo> contactInfo = service.getOneContactInfoById(contactId);
		return new ResponseEntity<>(contactInfo, HttpStatus.OK);
	
	}
	
	@DeleteMapping("/{contactId}")
	public ResponseEntity<String> deleteContactInfoById(@PathVariable Integer contactId){
		boolean isDeleted = service.deleteContactInfoById(contactId);
		if(isDeleted) {
			return new ResponseEntity<>("deleted", HttpStatus.CREATED);
		}
		return new ResponseEntity<>("failed", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
