package businesslogic;

import java.util.Set;

import datatypes.Masters;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

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
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int themeId;
	private String title;
	private String description;
	@ElementCollection
	private Set<Masters> compatibleMasters;
	private float pay;
	@OneToOne
	@JoinColumn(name = "COUNSELOR_ID", nullable = false)
	private Counselor counselor;
	
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
