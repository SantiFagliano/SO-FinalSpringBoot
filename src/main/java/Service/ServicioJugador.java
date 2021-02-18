package Service;

import DTO.JugadorDTO;
import Entity.Jugador;

public interface ServicioJugador {
    public Jugador convertirDTOAEntidad(JugadorDTO jugadorDTO);

    public JugadorDTO convertirEntidadADTO(Jugador jugador);

    public void agregarJugador(JugadorDTO jugadorDTO) ;

    public void actualizarJugador(JugadorDTO jugadorDTO,Integer id);

    public JugadorDTO listarJugadorPorId(Integer dni) ;

    public void borrarJugador(Integer id) ;
}
