package Controller;

import DTO.EquipoDTO;
import Service.ServicioEquipoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipo")
public class EquipoController {
    @Autowired
    ServicioEquipoImpl servicioEquipo;

    @PostMapping("/")
    public void postEquipo(@RequestBody EquipoDTO equipoDTO) {
        servicioEquipo.agregarEquipo(equipoDTO);
    }

    @PutMapping("/")
    public void putEquipo(@RequestBody EquipoDTO equipoDTO,
                          @RequestParam(name = "id") Integer id) {
        servicioEquipo.actualizarEquipo(equipoDTO, id);
    }

    @GetMapping("/")
    public EquipoDTO getEquipo(@RequestParam(name = "id") Integer id) {
        return servicioEquipo.listarEquipoPorId(id);
    }

    @DeleteMapping("/")
    public void deleteEquipo(@RequestParam(name = "id") Integer id) {
        servicioEquipo.borrarEquipo(id);
    }
}
