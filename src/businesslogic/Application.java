package businesslogic;

import java.util.List;

/**
 * Class that represents an application for a thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class Application {
	private int applicationId;
	private int studentId;
	private boolean isOpen;
	private float average;
	private List<Theme> themes;
	
	/**
	 * Returns the application's id
	 * @return the application's id
	 */
	public int getApplicationId() {
		return applicationId;
	}

	/**
	 * Returns the id of the studemt who made the application
	 * @return the student's id
	 */
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * Sets the applying studnt's id
	 * @param studentId the id
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	/**
	 * Checks whether the application is open
	 * @return true if the application is open and fals eotherwise
	 */
	public boolean isOpen() {
		return isOpen;
	}
	
	/**
	 * Marks the application as open or closed
	 * @param isOpen whether the application is opn or not
	 */
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	/**
	 * Returns the average grade registered in the application
	 * @return the average grade
	 */
	public float getAverage() {
		return average;
	}
	
	/**
	 * Sets the average grade in the application
	 * @param average a give average
	 */
	public void setAverage(float average) {
		this.average = average;
	}
	
	/**
	 * Returns the list of themes in the application
	 * @return a list of themes
	 */
	public List<Theme> getThemes() {
		return themes;
	}
	
	/**
	 * Sets the applications chosen themes to a given list
	 * @param themes a given list of themes
	 */
	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
	
	
}
