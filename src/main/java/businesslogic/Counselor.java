package businesslogic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class that represents a Counselor 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

@Entity
public class Counselor {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int counselorid;

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
        return this.counselorid;
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
    
}
