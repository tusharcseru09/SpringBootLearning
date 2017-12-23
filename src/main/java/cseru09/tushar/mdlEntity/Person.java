package cseru09.tushar.mdlEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	
	@Id
	@Column(name="PERSON_ID")
	private Long pId;
	
	@Column(name="PERSON_NAME")
	private String pName;
	
	@Column(name="PERSON_ADDRESS")
	private String pAddress;
	
	@Column(name="PERSON_HOBY")
	private String pHoby;
	
	
	public Person() {}
	
	
	//ID
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	
	//NAME
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	//ADDRESS
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	
	//HOBY
	public String getpHoby() {
		return pHoby;
	}
	public void setpHoby(String pHoby) {
		this.pHoby = pHoby;
	}
	

}
