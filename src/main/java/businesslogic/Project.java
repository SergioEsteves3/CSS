package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.File;

/**
 * Class that represents a Project type Thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
@DiscriminatorValue("PROJECT")
public class Project extends Thesis{
	@OneToOne
	@JoinColumn(name = "EXTERNAL_COUSELOR_ID")
	private Enterprise externalCounselor;

	public Project() {
		super();
	}

	public Project(File document, Counselor internalCounselor, Theme theme, Student student, Enterprise externalCounselor) {
		super(document,internalCounselor,theme,student);
		this.externalCounselor = externalCounselor;
	}

	/**
	 * Returns the external councillor accompanying this project
	 * @return the counselor
	 */
	public Enterprise getExternalCouncillorId() {
		return externalCounselor;
	}

	/**
	 * Sets the external counselor accompanying this project
	 * @param externalCounselor the counselor
	 */
	public void setExternalCouncillorId(Enterprise externalCounselor) {
		this.externalCounselor = externalCounselor;
	}	
}
