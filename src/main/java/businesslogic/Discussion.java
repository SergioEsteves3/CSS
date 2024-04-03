package businesslogic;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * Class that represents a discussion for a thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name = "TYPE")
public abstract class Discussion {
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int discussionId;
	
	private boolean isFinal;
	private float grade;
		
	@OneToOne
	@JoinColumn(name = "THESIS_ID", nullable = false)
	private Thesis thesis;
	

	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@OneToMany
	//@JoinColumn(name = "COUNSELOR_ID")
	private Set<Counselor> counselors;



	public Discussion() {
		
	}
	
	public Discussion(boolean isFinal, float grade, Thesis thesis, Date startDate, Date endDate, Set<Counselor> counselors) {
		this.isFinal = isFinal;
		this.grade = grade;
		this.thesis = thesis;
		this.startDate = startDate;
		this.endDate = endDate;
		this.counselors = counselors;
	}
	
	/**
	 * Returns the discussion's id
	 * @return the discussion id
	 */
	public int getDiscussionId() {
		return discussionId;
	}

	/**
	 * Sets the discussion's id
	 * @param discussionId the id
	 */
	public void setDiscussionId(int discussionId) {
		this.discussionId = discussionId;
	}
	
	/**
	 * Returns whether this is the final discussion for the thesis or not
	 * @return true if it is the final discussion and false otherwise
	 */
	public boolean isFinal() {
		return isFinal;
	}
	
	/**
	 * Sets the discussion as final or not
	 * @param isFinal whether the discussion is final or not
	 */
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	/**
	 * Returns the temporary grade of the discussion 
	 * @return the temporary grade of the discussion
	 */
	public float getGrade() {
		return grade;
	}
	
	/**
	 * Sets the temporary grade for the discussion
	 * @param grade the grade
	 * @requires !isFinal()
	 */
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	
	/**
	 * Returns the thesis being discussd
	 * @return the thesis
	 */
	public Thesis getThesis() {
		return thesis;
	}
	
	/**
	 * Sets the id for the discussion's thesis
	 * @param thesis the thesis
	 */
	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}


	/**
	 * Returns the date when the discussion is scheduled to start
	 * @return the startDate the starting date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the starting date for the discussion
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Returns the ending date for the discussion
	 * @return the endDate the ending date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date for the discussion
	 * @param endDate the end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Returns the counselors who will judge the discussion
	 * @return the counselors the counselors
	 */
	public Set<Counselor> getCounselors() {
		return counselors;
	}

	/**
	 * Sets the counselors who will judge the discussion
	 * @param counselors the counselors
	 */
	public void setCounselors(Set<Counselor> counselors) {
		this.counselors = counselors;
	}
	
}
 