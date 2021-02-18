package Repository;

import Entity.Dt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DtRepository extends CrudRepository<Dt, Integer> {
}