package metier.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Note implements Serializable {
	private Long id;
	private Date dateNote;
	private Double total;
	private List<Frais> listFrais;
	private Collaborateur coll;
	public Note() {
		super();
	}
	public Note(Date dateNote, Double total, List<Frais> listFrais, Collaborateur coll) {
		super();
		this.coll=coll;
		this.dateNote = dateNote;
		this.total = total;
		this.listFrais = listFrais;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateNote() {
		return dateNote;
	}
	public void setDateNote(Date dateNote) {
		this.dateNote = dateNote;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public List<Frais> getListFrais() {
		return listFrais;
	}
	public void setListFrais(List<Frais> listFrais) {
		this.listFrais = listFrais;
	}
	








}
