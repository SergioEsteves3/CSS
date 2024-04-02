package businesslogic;
import datatypes.Masters;´

/**
 * Class that represents a Student 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

 public class Student {
    private int studentId;
    private String name;
    private double average;
    private Masters masters;

    /**
     * Gets the ID of the student.
     * @return The ID of the student.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the ID of the student.
     * @param studentId The ID of the student to set.
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets the name of the student.
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * @param name The name of the student to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the average score of the student.
     * @return The average score of the student.
     */
    public double getAverage() {
        return average;
    }

    /**
     * Sets the average score of the student.
     * @param average The average score of the student to set.
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * Gets the master's degree information of the student.
     * @return The master's degree information of the student.
     */
    public Masters getMasters() {
        return masters;
    }

    /**
     * Sets the master's degree information of the student.
     * @param masters The master's degree information of the student to set.
     */
    public void setMasters(Masters masters) {
        this.masters = masters;
    }
}
