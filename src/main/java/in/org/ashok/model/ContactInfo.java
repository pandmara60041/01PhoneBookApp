package in.org.ashok.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CONTACT_INFO_TAB")
public class ContactInfo {
	@Id
	@Column(name="S.NO_COL")
	private Integer pbId;
	
	@Column(name="NAME_COL")
	private String name;
	
	@Column(name="EMAIL_COL")
	private String email;
	
	@Column(name="PHNO_COL")
	private Long phoneNo; 
}
