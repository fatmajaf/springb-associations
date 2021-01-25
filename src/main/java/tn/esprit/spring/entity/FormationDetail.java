package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "T_FORMATION_DETAIL")
public class FormationDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FD_ID")
	private Long fdId;
	@Column(name="FD_TABLE_MATIERE")
	private String fdTableMatiere;
	@Column(name="FD_SUPPORT_PDF")
	private String fdSupportPDF;
	
	private static final long serialVersionUID = 1L;

	public FormationDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormationDetail(Long fdId, String fdTableMatiere, String fdSupportPDF) {
		super();
		this.fdId = fdId;
		this.fdTableMatiere = fdTableMatiere;
		this.fdSupportPDF = fdSupportPDF;
	}

	public Long getFdId() {
		return fdId;
	}

	public void setFdId(Long fdId) {
		this.fdId = fdId;
	}

	public String getFdTableMatiere() {
		return fdTableMatiere;
	}

	public void setFdTableMatiere(String fdTableMatiere) {
		this.fdTableMatiere = fdTableMatiere;
	}

	public String getFdSupportPDF() {
		return fdSupportPDF;
	}

	public void setFdSupportPDF(String fdSupportPDF) {
		this.fdSupportPDF = fdSupportPDF;
	}
	
	
}
