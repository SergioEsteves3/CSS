package businesslogic;

import java.io.File;
/**
 * A class that represents a Thesis in the ThesisMan application
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class Thesis {
	
	private int thesisId;
	private File document;
	private int internalcounselorId;
	private int themeId;
	private int studentId;
	
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
	 * Returns the internal counselor's id
	 * @return the internal counselor's id
	 */
	public int getInternalcounselorId() {
		return internalcounselorId;
	}
	
	/**
	 * Sets the id of the thesis's internal counselor
	 * @param internalcounselorId the id
	 */
	public void setInternalcounselorId(int internalcounselorId) {
		this.internalcounselorId = internalcounselorId;
	}
	
	/**
	 * Returns the thesis's theme's id
	 * @return the theme's id
	 */
	public int getThemeId() {
		return themeId;
	}
	
	/**
	 * Sets the id for the thesis's theme
	 * @param themeId the theme's id
	 */
	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}
	
	/**
	 * Returns the id of the student working on the thesis
	 * @return the student's id
	 */
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * Sets the id of the student working on the thesis
	 * @param studentId the student's id
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
