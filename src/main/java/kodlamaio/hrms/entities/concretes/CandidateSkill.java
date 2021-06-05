package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "candidate_skills")
public class CandidateSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skill_name")
	@NotNull
	@NotBlank
	private String skillName;
	
	@Column(name = "skill_description")
	private String skillDescription;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

}
