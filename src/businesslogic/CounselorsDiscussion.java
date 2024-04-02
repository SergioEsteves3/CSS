package businesslogic;
/**
 * Class that represents a Counselor Discussion 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */
public class CounselorsDiscussion {
    private int counselorsDiscId;
    private boolean isInternalCounselor;
    private int counselorId;
    private int discussionId;

    /**
     * Gets the ID of the counselors discussion.
     * @return The ID of the counselors discussion.
     */
    public int getCounselorsDiscId() {
        return counselorsDiscId;
    }

    /**
     * Sets the ID of the counselors discussion.
     * @param counselorsDiscId The ID of the counselors discussion to set.
     */
    public void setCounselorsDiscId(int counselorsDiscId) {
        this.counselorsDiscId = counselorsDiscId;
    }

    /**
     * Checks if the counselor is internal.
     * @return True if the counselor is internal, false otherwise.
     */
    public boolean isInternalCounselor() {
        return isInternalCounselor;
    }

    /**
     * Sets whether the counselor is internal.
     * @param internalCounselor True if the counselor is internal, false otherwise.
     */
    public void setInternalCounselor(boolean internalCounselor) {
        isInternalCounselor = internalCounselor;
    }

    /**
     * Gets the ID of the counselor.
     * @return The ID of the counselor.
     */
    public int getCounselorId() {
        return counselorId;
    }

    /**
     * Sets the ID of the counselor.
     * @param counselorId The ID of the counselor to set.
     */
    public void setCounselorId(int counselorId) {
        this.counselorId = counselorId;
    }

    /**
     * Gets the ID of the discussion.
     * @return The ID of the discussion.
     */
    public int getDiscussionId() {
        return discussionId;
    }

    /**
     * Sets the ID of the discussion.
     * @param discussionId The ID of the discussion to set.
     */
    public void setDiscussionId(int discussionId) {
        this.discussionId = discussionId;
    }
}

