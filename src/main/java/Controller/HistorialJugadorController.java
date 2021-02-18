package Controller;

import DTO.HistorialJugadorDTO;
import Service.ServicioHistorialJugadorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("historial-jugador")
public class HistorialJugadorController {
    @Autowired
    ServicioHistorialJugadorImpl servicioHistorialJugador;

    @PostMapping("/")
    public void postHistorialJugador(@RequestBody HistorialJugadorDTO historialJugadorDTO) {
        servicioHistorialJugador.agregarHistorial(historialJugadorDTO);
    }

    @PutMapping("/")
    public void putHistorialJugador(@RequestBody HistorialJugadorDTO historialJugadorDTO,
                                    @RequestParam(name = "id") Integer id) {
        servicioHistorialJugador.actualizarHistorial(historialJugadorDTO, id);
    }

    @GetMapping("/")
    public HistorialJugadorDTO getHistorialJugador(@RequestParam(name = "id") Integer id) {
        return servicioHistorialJugador.listarHistorialDeJugadorPorId(id);
    }

    @DeleteMapping("/")
    public void deleteHistorialJugador(@RequestParam(name = "id") Integer id) {
        servicioHistorialJugador.borrarHistorial(id);
    }
}
