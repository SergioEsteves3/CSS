package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
/**
 * Class that represents an Enterprise 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

@Entity
@DiscriminatorValue("ENTERPRISE")
public class Enterprise extends Counselor {

    public Enterprise() {
        super();
    }

    public Enterprise(String name) {
        super(name);
    }
    
}
