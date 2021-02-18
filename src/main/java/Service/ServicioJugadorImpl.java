package Service;

import DTO.JugadorDTO;
import Entity.Jugador;
import Repository.DireccionRepository;
import Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioJugadorImpl implements ServicioJugador {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public Jugador convertirDTOAEntidad(JugadorDTO jugadorDTO) {
        Jugador jugador = new Jugador();
        jugador.setNombre(jugadorDTO.getNombre());
        jugador.setApellido(jugadorDTO.getApellido());
        jugador.setDni(jugadorDTO.getDni());
        jugador.setDireccion(direccionRepository.findById(jugadorDTO.getId_direccion()).get());
        jugador.setTelefono(jugadorDTO.getTelefono());
        jugador.setEmail(jugadorDTO.getEmail());
        jugador.setFecha_nacimiento(jugadorDTO.getFecha_nacimiento());
        jugador.setFecha_retiro(jugadorDTO.getFecha_retiro());
        jugador.setFecha_debut(jugadorDTO.getFecha_debut());
        jugador.setPartidos_jugados(jugadorDTO.getPartidos_jugados());
        jugador.setGoles(jugadorDTO.getGoles());
        jugador.setPeso(jugadorDTO.getPeso());
        jugador.setAltura(jugadorDTO.getAltura());
        jugador.setPosicion(jugadorDTO.getPosicion());
        return jugador;
    }

    @Override
    public JugadorDTO convertirEntidadADTO(Jugador jugador) {
        JugadorDTO jugadorDTO = new JugadorDTO();
        jugadorDTO.setNombre(jugador.getNombre());
        jugadorDTO.setApellido(jugador.getApellido());
        jugadorDTO.setDni(jugador.getDni());
        jugadorDTO.setId_direccion(jugador.getDireccion().getId());
        jugadorDTO.setTelefono(jugador.getTelefono());
        jugadorDTO.setEmail(jugador.getEmail());
        jugadorDTO.setFecha_nacimiento(jugador.getFecha_nacimiento());
        jugadorDTO.setFecha_retiro(jugador.getFecha_retiro());
        jugadorDTO.setFecha_debut(jugador.getFecha_debut());
        jugadorDTO.setPartidos_jugados(jugador.getPartidos_jugados());
        jugadorDTO.setGoles(jugador.getGoles());
        jugadorDTO.setPeso(jugador.getPeso());
        jugadorDTO.setAltura(jugador.getAltura());
        jugadorDTO.setPosicion(jugador.getPosicion());
        return jugadorDTO;
    }

    @Override
    public void agregarJugador(JugadorDTO jugadorDTO) {
        jugadorRepository.save(convertirDTOAEntidad(jugadorDTO));
    }

    @Override
    public void actualizarJugador(JugadorDTO jugadorDTO, Integer id) {
        Jugador jugador = convertirDTOAEntidad(jugadorDTO);
        jugador.setId(id);
        jugadorRepository.save(jugador);
    }

    @Override
    public JugadorDTO listarJugadorPorId(Integer id) {
        Jugador jugador = jugadorRepository.findById(id).get();
        return convertirEntidadADTO(jugador);
    }

    @Override
    public void borrarJugador(Integer id) {
        jugadorRepository.deleteById(id);
    }

}
