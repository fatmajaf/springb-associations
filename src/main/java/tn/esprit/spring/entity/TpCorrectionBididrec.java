package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP_CORRECTION_BIDIDREC")
public class TpCorrectionBididrec implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TC_IDBidirec")
	private Long tcId;
	@Column(name = "TC_CORRECTION")
	private String tcCorrection;
	@ManyToOne
	private TravauxPratiquesBididrec pratiquesBididrec;
	
	private static final long serialVersionUID = 1L;

	public TpCorrectionBididrec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TpCorrectionBididrec(Long tcId, String tcCorrection) {
		super();
		this.tcId = tcId;
		this.tcCorrection = tcCorrection;
	}

	public Long getTcId() {
		return tcId;
	}

	public void setTcId(Long tcId) {
		this.tcId = tcId;
	}

	public String getTcCorrection() {
		return tcCorrection;
	}

	public void setTcCorrection(String tcCorrection) {
		this.tcCorrection = tcCorrection;
	}

	public TravauxPratiquesBididrec getPratiquesBididrec() {
		return pratiquesBididrec;
	}

	public void setPratiquesBididrec(TravauxPratiquesBididrec pratiquesBididrec) {
		this.pratiquesBididrec = pratiquesBididrec;
	}
	
	

}
