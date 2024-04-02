package facade;

import businesslogic.ClassroomCatalog;
import businesslogic.CounselorsCatalog;
import businesslogic.StudentsCatalog;
import businesslogic.ThemesCatalog;

/**
 * Main class for the ThesisMan application
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class ThesisMan {

	private float sucessRate;
	private final CounselorsCatalog couselorsCatalog;
	private final ClassroomCatalog classroomCatalog;
	private final StudentsCatalog studentsCatalog;
	private final ThemesCatalog themesCatalog;
	
	public ThesisMan(CounselorsCatalog counselorsCatalog, ClassroomCatalog classroomCatalog, StudentsCatalog studentsCatalog, ThemesCatalog themesCatalog) {
		this.couselorsCatalog = counselorsCatalog;
		this.classroomCatalog = classroomCatalog;
		this.studentsCatalog = studentsCatalog;
		this.themesCatalog = themesCatalog;
	}

	/**
	 * Returns the students' success rate
	 * @return the success rate
	 */
	public float getSucessRate() {
		return sucessRate;
	}
	
	/**
	 * Returns the Counselors' Catalog
	 * @return the couselorsCatalog
	 */
	public CounselorsCatalog getCouselorsCatalog() {
		return couselorsCatalog;
	}

	/**
	 * Returns the Classrooms' Catalog
	 * @return the classroomCatalog
	 */
	public ClassroomCatalog getClassroomCatalog() {
		return classroomCatalog;
	}


	/**
	 * Returns the Students' Catalog
	 * @return the studentsCatalog
	 */
	public StudentsCatalog getStudentsCatalog() {
		return studentsCatalog;
	}


	/**
	 * Returns the Themes' Catalog
	 * @return the themesCatalog
	 */
	public ThemesCatalog getThemesCatalog() {
		return themesCatalog;
	}
}
