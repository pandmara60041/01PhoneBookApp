package in.org.ashok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.org.ashok.model.ContactInfo;

public interface PhoneBookRepository extends JpaRepository<ContactInfo, Integer> {

}
