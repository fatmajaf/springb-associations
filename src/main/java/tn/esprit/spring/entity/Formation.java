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
@Table(name="T_FORMATION")
public class Formation implements Serializable {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(name="FORMATION_THEME")
	private String theme;
	
	@OneToOne
	private FormationDetail formationDetail;
	
	private static final long serialVersionUID = 1L;

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(Long id, String theme, FormationDetail formationDetail) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationDetail = formationDetail;
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

	public FormationDetail getFormationDetail() {
		return formationDetail;
	}

	public void setFormationDetail(FormationDetail formationDetail) {
		this.formationDetail = formationDetail;
	}
	
	

}
