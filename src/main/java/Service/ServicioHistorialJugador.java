package Service;

import DTO.HistorialJugadorDTO;
import Entity.HistorialJugador;

public interface ServicioHistorialJugador {
    public HistorialJugador convertirDTOAEntidad(HistorialJugadorDTO historialJugadorDTO);

    public HistorialJugadorDTO convertirEntidadADTO(HistorialJugador historialJugador);

    public void agregarHistorial(HistorialJugadorDTO historialJugadorDTO);

    public void actualizarHistorial(HistorialJugadorDTO historialJugadorDTO, Integer id);

    public HistorialJugadorDTO listarHistorialDeJugadorPorId(Integer id);

    public void borrarHistorial(Integer id);
}
