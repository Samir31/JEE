package metier.entites;
import java.io.Serializable;

public class Projet implements Serializable {
	private String code;
	private String designation;
	public Projet() {
		super();
	}
	public Projet(String code, String designation) {
		super();
		this.code = code;
		this.designation = designation;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
