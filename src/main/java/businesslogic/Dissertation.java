package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.File;

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
    public Dissertation() {
        super();
    }

    public Dissertation(File document, Counselor internalCounselor, Theme theme, Student student) {
        super(document,internalCounselor,theme,student);
    }
}
