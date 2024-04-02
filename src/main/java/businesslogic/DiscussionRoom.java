package businesslogic;

import java.util.Date;

/**
 * Class that represents a discussion happening in a room
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class DiscussionRoom {
	
	private int discRoomId;
	private int discussionId;
	private int classroomId;
	private Date startTime;
	private Date endTime;
	
	/**
	 * Returns the discussion-room id
	 * @return the id
	 */
	public int getDiscRoomId() {
		return discRoomId;
	}
	
	/**
	 * Returns the discussion's id
	 * @return the id
	 */
	public int getDiscussionId() {
		return discussionId;
	}
	
	/**
	 * Sets the discussion id 
	 * @param discussionId a given id
	 */
	public void setDiscussionId(int discussionId) {
		this.discussionId = discussionId;
	}
	
	/**
	 * Returns the classroom's id
	 * @return the classroom id
	 */
	public int getClassroomId() {
		return classroomId;
	}
	
	/**
	 * Sets the classroom id
	 * @param classroomId a given id
	 */
	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}
	
	/**
	 * Returns the time when the discussion starts
	 * @return the start time
	 */
	public Date getStartTime() {
		return startTime;
	}
	
	/**
	 * Sets the starting date for the discussion
	 * @param startTime a given date
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * Returns the end date for the discussion
	 * @return the end date
	 */
	public Date getEndTime() {
		return endTime;
	}
	
	/**
	 * Sets the ending time for the discussion
	 * @param endTime a given dateS
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
}
