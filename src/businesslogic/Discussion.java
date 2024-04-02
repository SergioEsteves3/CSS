package businesslogic;

public class Discussion {
	
	private int discussionId;
	private boolean isFinal;
	private float grade;
	private float finalGrade;
	private int thesisId;
	
	/**
	 * Returns the discussion's id
	 * @return the discussion id
	 */
	public int getDiscussionId() {
		return discussionId;
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
	 */
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	/**
	 * Returns the final grade for the discussion 
	 * @return the final grade for the discussion
	 */
	public float getFinalGrade() {
		return finalGrade;
	}
	
	/**
	 * Sets the final grade for the discussion
	 * @param finalGrade the final grade
	 * @requires isFinal()
	 */
	public void setFinalGrade(float finalGrade) {
		this.finalGrade = finalGrade;
	}
	
	/**
	 * Returns the id for the thesis being discussd
	 * @return the thesis's id
	 */
	public int getThesisId() {
		return thesisId;
	}
	
	/**
	 * Sets the id for the discussion's thesis
	 * @param thesisId the id for the thesis
	 */
	public void setThesisId(int thesisId) {
		this.thesisId = thesisId;
	}
	
	
}
 