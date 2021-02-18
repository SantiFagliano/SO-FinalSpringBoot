package Controller;

import DTO.DireccionDTO;
import Service.ServicioDireccionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dt")
public class DireccionController {
    @Autowired
    ServicioDireccionImpl servicioDireccion;

    @PostMapping("/")
    public void postDireccion(@RequestBody DireccionDTO direccionDTO) {
        servicioDireccion.agregarDireccion(direccionDTO);
    }

    @PutMapping("/")
    public void putDireccion(
            @RequestBody DireccionDTO direccionDTO,
            @RequestParam(name = "id") Integer id) {
        servicioDireccion.actualizarDireccion(direccionDTO, id);
    }

    @GetMapping("/")
    public DireccionDTO getDireccion(@RequestParam(name = "id") Integer id) {
        return servicioDireccion.listarDireccionPorId(id);
    }

    @DeleteMapping("/")
    public void deleteDireccion(@RequestParam(name = "id") Integer id) {
        servicioDireccion.borrarDireccion(id);
    }
}