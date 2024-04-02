package businesslogic;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Class that represents a Faculty
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

@Entity
@DiscriminatorValue("FACULTY")
public class Faculty extends Counselor {
    
}