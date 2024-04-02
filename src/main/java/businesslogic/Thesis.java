package businesslogic;

import java.io.File;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
/**
 * A class that represents a Thesis in the ThesisMan application
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
public class Thesis {
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int thesisId;
	@Lob @Basic(fetch = FetchType.LAZY)
	private File document;
	@OneToOne
	@JoinColumn(name = "COUNSELOR_ID", nullable = false)
	private Counselor internalCounselor;
	@OneToOne
	@JoinColumn(name = "THEME_ID", nullable = false)
	private Theme theme;
	@OneToOne
	@JoinColumn(name="STUDENT_ID", nullable = false)
	private Student student;
	
	/**
	 * Returns the thesis's id
	 * @return the id
	 */
	public int getThesisId() {
		return thesisId;
	}
	
	/**
	 * Returns the thesis's document or null if none exists
	 * @return the document if one exists
	 */
	public File getDocument() {
		return this.document != null && this.document.exists() ? this.document : null;
	}
	
	/**
	 * Sets the document to a given file
	 * @param document a given file
	 */
	public void setDocument(File document) {
		this.document = document;
	}
	
	/**
	 * Returns the internal counselor
	 * @return the internal counselor
	 */
	public Counselor getInternalCounselor() {
		return internalCounselor;
	}
	
	/**
	 * Sets the thesis's internal counselor
	 * @param internalcounselorId the internal counselor
	 */
	public void setInternalcounselorId(Counselor counselor) {
		this.internalCounselor = counselor;
	}
	
	/**
	 * Returns the thesis's theme
	 * @return the theme
	 */
	public Theme getTheme() {
		return theme;
	}
	
	/**
	 * Sets the thesis's theme
	 * @param theme the theme
	 */
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	
	/**
	 * Returns the student working on the thesis
	 * @return the student
	 */
	public Student getStudentId() {
		return student;
	}
	
	/**
	 * Sets the student working on the thesis
	 * @param student the student
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
