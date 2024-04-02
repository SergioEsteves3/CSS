package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Class that represents an online discussion
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
@DiscriminatorValue("ONLINE")
public class Online extends Discussion{

}
