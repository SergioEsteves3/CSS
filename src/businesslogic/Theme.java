package businesslogic;

import java.util.List;

import datatypes.Masters;

/**
 * Class that represents themes for a thesis
 * 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class Theme {
	private int themeId;
	private String title;
	private String description;
	private List<Masters> compatibleMasters;
	private float pay;
	private int counselorId;
	
	/**
	 * Returns the theme's id
	 * @return the theme's id
	 */
	public int getThemeId() {
		return themeId;
	}

	/**
	 * Returns the theme's title
	 * @return the theme's title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the theme's title to a given title
	 * @param title a given title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns the Themes description
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the theme's description to a given String 
	 * @param description a given String
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns a list of Masters compatible with this theme
	 * @return a list of Masters
	 */
	public List<Masters> getCompatibleMasters() {
		return compatibleMasters;
	}

	/**
	 * Sets the compatible masters to a given list
	 * @param compatibleMasters a given list of masters
	 */
	public void setCompatibleMasters(List<Masters> compatibleMasters) {
		this.compatibleMasters = compatibleMasters;
	}

	/**
	 * Returns the pay for the theme
	 * @return the pay for the theme
	 */
	public float getPay() {
		return pay;
	}

	/**
	 * Sets the pay for the theme to a given amount
	 * @param pay a given amount
	 */
	public void setPay(float pay) {
		this.pay = pay;
	}

	/**
	 * Returns the id for the counselor that submitted this theme
	 * @return
	 */
	public int getcounselorId() {
		return counselorId;
	}

	/**
	 * Sets the id for the counselor that submitted this theme
	 * @param councellorId a given id
	 */
	public void setcounselorId(int councellorId) {
		this.counselorId = councellorId;
	}
}
