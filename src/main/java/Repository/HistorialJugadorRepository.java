package Repository;

import Entity.HistorialJugador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialJugadorRepository extends CrudRepository<HistorialJugador, Integer> {
}
