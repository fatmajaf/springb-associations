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
@Table(name="T_FORMATION_BIDI")
public class FormationBidirec implements Serializable {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(name="FORMATION_THEME")
	private String theme;
	
	@OneToOne
	private FormationDetailbidirec formationDetailbidirec;
	
	private static final long serialVersionUID = 1L;

	public FormationBidirec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormationBidirec(Long id, String theme, FormationDetailbidirec formationDetail) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationDetailbidirec = formationDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}


	
	

}
