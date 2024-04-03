package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.Set;

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

    public Online() {
        super();
    }
    public Online(boolean isFinal, float grade, Thesis thesis, Date startDate, Date endDate, Set<Counselor> counselors) {
        super(isFinal,grade,thesis,startDate,endDate,counselors);
    }


}
