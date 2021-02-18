package Service;

import DTO.HistorialJugadorDTO;
import Entity.HistorialJugador;
import Repository.EquipoRepository;
import Repository.HistorialJugadorRepository;
import Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioHistorialJugadorImpl implements ServicioHistorialJugador {
    @Autowired
    private HistorialJugadorRepository historialJugadorRepository;
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public HistorialJugador convertirDTOAEntidad(HistorialJugadorDTO historialJugadorDTO) {
        HistorialJugador historialJugador = new HistorialJugador();
        historialJugador.setJugador(jugadorRepository.findById(historialJugadorDTO.getId_jugador()).get());
        historialJugador.setPosicion(historialJugadorDTO.getPosicion());
        historialJugador.setEquipo(equipoRepository.findById(historialJugadorDTO.getId_equipo()).get());
        historialJugador.setFecha_inicio(historialJugadorDTO.getFecha_inicio());
        historialJugador.setFecha_fin(historialJugadorDTO.getFecha_fin());
        return historialJugador;
    }

    @Override
    public HistorialJugadorDTO convertirEntidadADTO(HistorialJugador historialJugador) {
        HistorialJugadorDTO historialJugadorDTO = new HistorialJugadorDTO();
        historialJugadorDTO.setId_jugador(historialJugador.getJugador().getId());
        historialJugadorDTO.setPosicion(historialJugador.getPosicion());
        historialJugadorDTO.setId_equipo(historialJugador.getEquipo().getId());
        historialJugadorDTO.setFecha_inicio(historialJugador.getFecha_inicio());
        historialJugadorDTO.setFecha_fin(historialJugador.getFecha_fin());
        return historialJugadorDTO;
    }

    @Override
    public void agregarHistorial(HistorialJugadorDTO historialJugadorDTO) {
        historialJugadorRepository.save(convertirDTOAEntidad(historialJugadorDTO));
    }

    @Override
    public void actualizarHistorial(HistorialJugadorDTO historialJugadorDTO, Integer id) {
        HistorialJugador historialJugador = convertirDTOAEntidad(historialJugadorDTO);
        historialJugador.setId(id);
        historialJugadorRepository.save(historialJugador);
    }

    @Override
    public HistorialJugadorDTO listarHistorialDeJugadorPorId(Integer id) {
        HistorialJugador historialJugador = historialJugadorRepository.findById(id).get();
        return convertirEntidadADTO(historialJugador);
    }

    @Override
    public void borrarHistorial(Integer id) {
        historialJugadorRepository.deleteById(id);
    }


}
