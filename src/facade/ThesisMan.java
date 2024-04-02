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
	private CounselorsCatalog couselorsCatalog;
	private ClassroomCatalog classroomCatalog;
	private StudentsCatalog studentsCatalog;
	private ThemesCatalog themesCatalog;
	
	public ThesisMan() {
		this.couselorsCatalog = new CounselorsCatalog();
		this.classroomCatalog = new ClassroomCatalog();
		this.studentsCatalog = new StudentsCatalog();
		this.themesCatalog = new ThemesCatalog();
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
