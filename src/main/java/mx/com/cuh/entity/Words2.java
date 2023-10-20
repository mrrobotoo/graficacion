package mx.com.cuh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "FRASES")
public class Words2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "idw_sequence")
	@SequenceGenerator(name = "idw_sequence",  allocationSize=1)
	@Column(name = "IDWORD")
	private Long idw;
	
	@Column(name = "PALABRA")
	private String word;

	public Long getIdw() {
		return idw;
	}

	public void setIdw(Long idw) {
		this.idw = idw;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
}
