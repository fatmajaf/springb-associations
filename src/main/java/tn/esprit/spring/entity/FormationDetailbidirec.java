package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "T_FORMATION_DETAIL_BIDI")
public class FormationDetailbidirec implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FD_IDbidi")
	private Long fdId;
	@Column(name="FD_TABLE_MATIERE")
	private String fdTableMatiere;
	@Column(name="FD_SUPPORT_PDF")
	private String fdSupportPDF;
	@OneToOne(mappedBy = "formationDetailbidirec")
	private FormationBidirec formationbidirec;
	private static final long serialVersionUID = 1L;

	public FormationDetailbidirec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormationDetailbidirec(Long fdId, String fdTableMatiere, String fdSupportPDF) {
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
