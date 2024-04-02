package businesslogic;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Class that represents a Students catalog 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

public interface StudentsCatalog extends JpaRepository<Student, Integer>{

}
