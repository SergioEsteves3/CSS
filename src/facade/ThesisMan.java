package facade;

import businesslogic.ClassroomCatalog;
import businesslogic.CounsellorsCatalog;
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
	private CounsellorsCatalog couselorsCatalog;
	private ClassroomCatalog classroomCatalog;
	private StudentsCatalog studentsCatalog;
	private ThemesCatalog themesCatalog;
	
	public ThesisMan() {
		this.couselorsCatalog = new CounsellorsCatalog();
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


}
