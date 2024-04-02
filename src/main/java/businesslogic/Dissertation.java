package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * A class that represents a Dissertation type Thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
@DiscriminatorValue("DISSERTATION")
public class Dissertation extends Thesis{

}
