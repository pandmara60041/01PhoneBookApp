package in.org.ashok.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.org.ashok.model.ContactInfo;
import in.org.ashok.repository.ContactInfoRepository;
import in.org.ashok.service.IContactInfoService;

@Service
public class ContactInfoServiceImpl implements IContactInfoService {

	private ContactInfoRepository contactInfoRepo;

	public ContactInfoServiceImpl(ContactInfoRepository contactInfoRepo) {
		this.contactInfoRepo = contactInfoRepo;
	}

	@Override
	public boolean saveOrUpdateContactInfo(ContactInfo contactInfo) {
//		ContactInfo savedContactInfo = contactInfoRepo.save(contactInfo);
//		return savedContactInfo.getContactId() != null;
		return contactInfoRepo.save(contactInfo).getContactId() != null;

	}

	@Override
	public Optional<ContactInfo> getOneContactInfoById(Integer ContactId) {
		return contactInfoRepo.findById(ContactId);
	}

	@Override
	public List<ContactInfo> getAllContactInfo() {
		return contactInfoRepo.findAll();
	}

	@Override
	public boolean deleteContactInfoById(Integer contactId) {
		try {
			contactInfoRepo.deleteById(contactId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
