package businesslogic;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;

/**
 * Class that represents a Counselor catalog 
 * @author Henrique Vale 58168
 * @author Leonardo Monteiro 58250
 * @author Sergio Esteves 58245
 */

@Entity
public interface CounselorsCatalog extends JpaRepository<Counselor, Integer>{
    
}
