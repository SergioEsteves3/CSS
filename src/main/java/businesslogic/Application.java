package businesslogic;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

/**
 * Class that represents an application for a thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
public class Application {
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int applicationId;
	@OneToOne
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	private boolean isOpen;
	private double average;
	@OneToMany
	@JoinColumn(name = "THEME_ID")
	private List<Theme> themes;
	
	public Application() {
	}
	
	public Application(Student student, boolean isOpen, double average, List<Theme> themes) {
		this.student = student;
		this.isOpen = isOpen;
		this.average = average;
		this.themes = themes;
	}
	
	/**
	 * Returns the application's id
	 * @return the application's id
	 */
	public int getApplicationId() {
		return applicationId;
	}
	
	/**
	 * Sets the applucation's id
	 * @param applicationId the id
	 */
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * Returns the student who made the application
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	
	/**
	 * Sets the applying student
	 * @param studentId the student
	 */
	public void setStudentId(Student student) {
		this.student = student;
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
	 * @param isOpen whether the application is open or not
	 */
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	/**
	 * Returns the average grade registered in the application
	 * @return the average grade
	 */
	public double getAverage() {
		return average;
	}
	
	/**
	 * Sets the average grade in the application
	 * @param average a give average
	 */
	public void setAverage(double average) {
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
