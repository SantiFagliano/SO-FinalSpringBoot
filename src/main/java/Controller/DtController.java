package Controller;

import DTO.DtDTO;
import Service.ServicioDTImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dt")
public class DtController {
    @Autowired
    ServicioDTImpl servicioDT;

    @PostMapping("/")
    public void postDT(@RequestBody DtDTO dtDTO) {
        servicioDT.agregarDt(dtDTO);
    }

    @PutMapping("/")
    public void putDT(
            @RequestBody DtDTO dtDTO,
            @RequestParam(name = "id") Integer id) {
        servicioDT.actualizarDt(dtDTO, id);
    }

    @GetMapping("/")
    public DtDTO getDT(@RequestParam(name = "id") Integer id) {
        return servicioDT.listarDtPorId(id);
    }

    @DeleteMapping("/")
    public void deleteDT(@RequestParam(name = "id") Integer id) {
        servicioDT.borrarDt(id);
    }
}
