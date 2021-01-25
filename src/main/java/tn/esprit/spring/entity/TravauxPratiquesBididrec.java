package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_TPBidirec")
public class TravauxPratiquesBididrec implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TP_IDbidi")
	Long tpId;
	@Column(name = "TP_SUJET")
	String tpSujet;
	@Column(name = "TP_DUREE")
	Long tpDuree;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pratiquesBididrec")
	private Set<TpCorrectionBididrec> TpCorrections;
	
	private static final long serialVersionUID = 1L;

	public TravauxPratiquesBididrec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TravauxPratiquesBididrec(Long tpId, String tpSujet, Long tpDuree, Set<TpCorrectionBididrec> tpCorrections) {
		super();
		this.tpId = tpId;
		this.tpSujet = tpSujet;
		this.tpDuree = tpDuree;
		TpCorrections = tpCorrections;
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getTpSujet() {
		return tpSujet;
	}

	public void setTpSujet(String tpSujet) {
		this.tpSujet = tpSujet;
	}

	public Long getTpDuree() {
		return tpDuree;
	}

	public void setTpDuree(Long tpDuree) {
		this.tpDuree = tpDuree;
	}

	public Set<TpCorrectionBididrec> getTpCorrections() {
		return TpCorrections;
	}

	public void setTpCorrections(Set<TpCorrectionBididrec> tpCorrections) {
		TpCorrections = tpCorrections;
	}

	

}
