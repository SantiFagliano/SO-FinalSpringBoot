package Controller;

import DTO.JugadorDTO;
import Service.ServicioJugadorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jugador")
public class JugadorController {
    @Autowired
    ServicioJugadorImpl servicioJugador;

    @PostMapping("/")
    public void postJugador(@RequestBody JugadorDTO jugadorDTO) {
        servicioJugador.agregarJugador(jugadorDTO);
    }

    @PutMapping("/")
    public void putJugador(@RequestBody JugadorDTO jugadorDTO,
                           @RequestParam(name = "id") Integer id) {
        servicioJugador.actualizarJugador(jugadorDTO, id);
    }

    @GetMapping("/")
    public JugadorDTO getJugador(@RequestParam(name = "id") Integer id) {
        return servicioJugador.listarJugadorPorId(id);
    }

    @DeleteMapping("/")
    public void deleteJugador(@RequestParam(name = "id") Integer id) {
        servicioJugador.borrarJugador(id);
    }

}
