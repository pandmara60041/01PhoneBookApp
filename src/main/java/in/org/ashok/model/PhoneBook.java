package in.org.ashok.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="PHONEBOOK_TAB")
public class PhoneBook {
	@Id
	@Column(name="S.NO")
	private Integer pbId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHNO")
	private Long phoneNo; 
}
