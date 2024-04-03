package businesslogic;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;
import java.util.Set;

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

    @OneToOne
    @JoinColumn(name = "CLASSROOM_ID")
    private Classroom discussionRoom;

    public InPerson() {
        super();
    }
    public InPerson(boolean isFinal, float grade, Thesis thesis, Date startDate, Date endDate, Set<Counselor> counselors, Classroom classroom) {
        super(isFinal,grade,thesis,startDate,endDate,counselors);
        this.discussionRoom = classroom;
    }

    /**
     * Returns the classroom where the discussion will happen
     * @return the classroom
     */
    public Classroom getDiscussionRoom() {
        return discussionRoom;
    }

    /**
     * Sets the classroom where the discussion will happen
     * @param discussionRoom the room
     */
    public void setDiscussionRoom(Classroom discussionRoom) {
        this.discussionRoom = discussionRoom;
    }
}
