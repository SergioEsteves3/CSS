package businesslogic;

/**
 * Class that represents a Counselor catalog 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

public class CounsellorsCatalog {
     /**
     * Returns a counsellor with i id
     * @param i counselor id
     * @return counsellor with i id
     */

     public Counsellor getCounsellor(int i){
        return null;
    }

    /**
    * Adds a Faculty to catalog
    * @param name name of the Faculty
    * @return the id of the added Faculty
    */

    public int addFaculty(String name){
        return -1;
    }

   /**
    * Adds a Enterprise to catalog
    * @param name name of the Enterprise
    * @return the id of the added Enterprise
    */

    public int addEnterprise(String name){
        return -1;
    }

    /**
    * Adds a Administrator to catalog
    * @param name name of the Administrator
    * @return the id of the added Administrator
    */
    
    public int addAdministrator(String name){
        return -1;
    }
    /**
     * Checks if given id is a Faculty
     * @param id given id
     * @return true if faculty false if not
     */
    public boolean isFaculty(int id){
        return false;
    }

    /**
     * Checks if given id is a Enterprise
     * @param id given id
     * @return true if Enterprise false if not
     */
    public boolean isEnterprise(int id){
        return false;
    }

    /**
     * Checks if given id is a Administrator
     * @param id given id
     * @return true if Administrator false if not
     */
    public boolean isAdministrator(int id){
        return false;
    }
}
