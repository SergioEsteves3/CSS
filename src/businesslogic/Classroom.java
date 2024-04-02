package businesslogic;

/**
 * Class that represnts a classroom used for discussing a thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */
public class Classroom {
	
	private int classroomId;
	private int roomNumber;
	
	/**
	 * Returns this classroom's id
	 * @return the classroom's id
	 */
	public int getClassroomId() {
		return classroomId;
	}
	
	/**
	 * Returns the classroom's number
	 * @return the room number
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	
	/**
	 * Sets this classroom's number
	 * @param roomNumber  given number
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
}
