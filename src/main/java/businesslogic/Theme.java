package businesslogic;

import java.util.Set;

import datatypes.Masters;
import jakarta.persistence.*;

/**
 * Class that represents themes for a thesis
 * 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
public class Theme {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "THEME_ID")
	private int themeId;
	private String title;
	private String description;
	@ElementCollection
	private Set<Masters> compatibleMasters;
	private double pay;
	@OneToOne
	@JoinColumn(name = "COUNSELOR_ID", nullable = false)
	private Counselor counselor;
	
	public Theme() {
		
	}
	
	public Theme(String title, String description, Set<Masters> compatibleMasters, double pay, Counselor counselor) {
		this.title = title;
		this.description = description;
		this.compatibleMasters = compatibleMasters;
		this.pay = pay;
		this.counselor = counselor;
	}
	
	/**
	 * Returns the theme's id
	 * @return the theme's id
	 */
	public int getThemeId() {
		return themeId;
	}
	
	/**
	 * Sets the theme's id
	 * @param themeId an id
	 */
	public void setThemeId(int themeId) {
		this.themeId = themeId;
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
	 * Returns a set of Masters compatible with this theme
	 * @return a set of Masters
	 */
	public Set<Masters> getCompatibleMasters() {
		return compatibleMasters;
	}

	/**
	 * Sets the compatible masters to a given set
	 * @param compatibleMasters a given set of masters
	 */
	public void setCompatibleMasters(Set<Masters> compatibleMasters) {
		this.compatibleMasters = compatibleMasters;
	}

	/**
	 * Returns the pay for the theme
	 * @return the pay for the theme
	 */
	public double getPay() {
		return pay;
	}

	/**
	 * Sets the pay for the theme to a given amount
	 * @param pay a given amount
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}

	/**
	 * Returns the counselor that submitted this theme
	 * @return the counselor
	 */
	public Counselor getCounselor() {
		return counselor;
	}

	/**
	 * Sets the id for the counselor that submitted this theme
	 * @param counselor the counselor
	 */
	public void setcounselorId(Counselor counselor) {
		this.counselor = counselor;
	}
}
