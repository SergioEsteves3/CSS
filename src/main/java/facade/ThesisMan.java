package facade;

import businesslogic.ApplicationCatalog;
import businesslogic.ClassroomCatalog;
import businesslogic.CounselorsCatalog;
import businesslogic.DiscussionCatalog;
import businesslogic.StudentsCatalog;
import businesslogic.ThemesCatalog;
import businesslogic.ThesisCatalog;

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
	private final ApplicationCatalog applicationCatalog;
	private final DiscussionCatalog discussionCatalog;
	private final ThesisCatalog thesisCatalog;
	
	public ThesisMan(CounselorsCatalog counselorsCatalog, ClassroomCatalog classroomCatalog, StudentsCatalog studentsCatalog, ThemesCatalog themesCatalog, ThesisCatalog thesisCatalog, ApplicationCatalog applicationCatalog, DiscussionCatalog discussionCatalog) {
		this.couselorsCatalog = counselorsCatalog;
		this.classroomCatalog = classroomCatalog;
		this.studentsCatalog = studentsCatalog;
		this.themesCatalog = themesCatalog;
		this.applicationCatalog = applicationCatalog;
		this.discussionCatalog = discussionCatalog;
		this.thesisCatalog = thesisCatalog;
	}

	/**
	 * Returns the students' success rate
	 * @return the success rate
	 */
	public float getSucessRate() {
		return sucessRate;
	}
	
	/**
	 * Returns the application's catalog
	 * @return the applicationCatalog the catalog
	 */
	public ApplicationCatalog getApplicationCatalog() {
		return applicationCatalog;
	}

	/**
	 * Returns the discussion's catalog
	 * @return the discussionCatalog the catalog
	 */
	public DiscussionCatalog getDiscussionCatalog() {
		return discussionCatalog;
	}

	/**
	 * Returns the catalog of thesis
	 * @return the thesisCatalog the catalog
	 */
	public ThesisCatalog getThesisCatalog() {
		return thesisCatalog;
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
