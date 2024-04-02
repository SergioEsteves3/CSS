package businesslogic;

import java.util.List;

import datatypes.Masters;
/**
 * Catalog for submitted themes
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class ThemesCatalog {
	
	/**
	 * Obtainsa theme with a given id
	 * @param themeId a given id
	 * @return the matching theme, or null if none was found
	 */
	public Theme getTheme(int themeId) {
		//TO-DO
		return null;
	}
	
	/**
	 * Adds a theme to the catalog
	 * @param title a given title
	 * @param description a given description
	 * @param masters a given list of compatible masters
	 * @param pay a given pay
	 * @return the creatd theme's id
	 */
	public int addTheme (String title, String description, List<Masters> masters, float pay) {
		//TO-DO
		return -1;
	}
}
