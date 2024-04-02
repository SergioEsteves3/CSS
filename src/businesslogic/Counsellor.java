package businesslogic;

import businesslogic.StudentsCatalog;

/**
 * Class that represents a Counselor 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */
public class Counsellor {
    private String name;
    private int counselorid;
    private StudentsCatalog students;

    /**
     * Gets the name 
     * @return name 
     */
    public String getName(){
        return this.name;
    }
    /**
     * Gets the counselor id
     * @return counselor id
     */
    public int getCounselorId(){
        return this.counselorid;
    }

    /**
     * Sets the name of the counselor.
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the ID of the counselor.
     * @param counselorId The ID to set.
     */
    public void setCounselorId(int counselorId) {
        this.counselorid = counselorId;
    }
    public StudentsCatalog getStudentsCatalog(){
        return this.students;

    }
    public void setStudentsCatalog(StudentsCatalog s){
        this.students = s;
    }
}
