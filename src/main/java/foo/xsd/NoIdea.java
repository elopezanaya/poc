package foo.xsd;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;



@XmlRootElement
@XmlType(propOrder={"idNumber", "name"})
@XmlAccessorType(XmlAccessType.FIELD)
public class NoIdea {

	@XmlElement(name="id_Number")
	@JsonProperty("id_Number")
	private String idNumber;

	private String name;
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "NoIdea [idNumber=" + idNumber + ", name=" + name + "]";
	}
	

}
