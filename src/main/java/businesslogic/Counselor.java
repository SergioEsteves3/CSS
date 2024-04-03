package businesslogic;

import jakarta.persistence.*;

/**
 * Class that represents a Counselor 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name = "TYPE")
public abstract class Counselor {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="COUNSELOR_ID")
    private int counselorId;

    public Counselor() {
    	
    }
    
    public Counselor(String name) {
    	this.name = name;
    }
    
    /**
     * Gets the name 
     * @return name 
     */
    public String getName(){
        return this.name;
    }
    /**
     * Gets the counselor id
     * @return counselor id
     */
    public int getCounselorId(){
        return this.counselorId;
    }
    

	/**
     * Sets the name of the counselor.
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the ID of the counselor.
     * @param counselorId The ID to set.
     */
	public void setCounselorId(int counselorId) {
		this.counselorId = counselorId;
	}
    
}
