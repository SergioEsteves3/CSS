package businesslogic;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 * Class that represents a Project type Thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
public class Project extends Thesis{
	@OneToOne
	@JoinColumn(name = "EXTERNAL_COUSELOR_ID")
	private Enterprise externalCounselor;

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
