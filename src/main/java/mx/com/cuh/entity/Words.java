package mx.com.cuh.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "WORDS")
public class Words {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long IDWORD;
	private String WORDS;
	
	public Long getIDWORD() {
		return IDWORD;
	}
	public void setIDWORD(Long iDWORD) {
		IDWORD = iDWORD;
	}
	public String getWORDS() {
		return WORDS;
	}
	public void setWORDS(String wORDS) {
		WORDS = wORDS;
	}



}
