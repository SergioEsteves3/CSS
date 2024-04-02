package businesslogic;

/**
 * Class that represents a Project type Thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class Project extends Thesis{
	private int externalCouncillorId;

	/**
	 * Returns the id of the external councillor accompanying this project
	 * @return the councillor's id
	 */
	public int getExternalCouncillorId() {
		return externalCouncillorId;
	}

	/**
	 * Sets the id of the external councillor accompanying this project
	 * @param externalCouncillorId the councillor's id
	 */
	public void setExternalCouncillorId(int externalCouncillorId) {
		this.externalCouncillorId = externalCouncillorId;
	}	
}
