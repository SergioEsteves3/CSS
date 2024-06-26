package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Class that represents an in person discussion
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
@DiscriminatorValue("IN_PERSON")
public class InPerson extends Discussion{

}
