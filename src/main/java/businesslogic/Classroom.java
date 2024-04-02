package businesslogic;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class that represnts a classroom used for discussing a thesis
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 *
 */

@Entity
public class Classroom {
	
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int classroomId;
	private int roomNumber;
	
	public Classroom() {
		
	}
	
	public Classroom(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	/**
	 * Returns this classroom's id
	 * @return the classroom's id
	 */
	public int getClassroomId() {
		return classroomId;
	}
	
	/**
	 * Sets the classroom id
	 * @param id the id
	 */
	public void setClassroomId(int id) {
		this.classroomId = id;
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
