package businesslogic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussionCatalog extends JpaRepository<Discussion, Integer>{
}
