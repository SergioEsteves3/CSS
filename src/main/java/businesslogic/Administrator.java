package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


/**
 * Class that represents a Administrator
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

@Entity
@DiscriminatorValue("ADMIN")
public class Administrator  extends Faculty{
    
}
