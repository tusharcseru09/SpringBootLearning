package cseru09.tushar.mdlDAO;

import cseru09.tushar.mdlEntity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long>{

}
