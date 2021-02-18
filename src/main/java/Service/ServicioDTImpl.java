package Service;

import DTO.DtDTO;
import Entity.Dt;
import Repository.DireccionRepository;
import Repository.DtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioDTImpl implements ServicioDT {

    @Autowired
    private DtRepository dtRepository;
    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public Dt convertirDTOAEntidad(DtDTO dtDTO) {
        Dt dt = new Dt();
        dt.setNombre(dtDTO.getNombre());
        dt.setApellido(dtDTO.getApellido());
        dt.setDni(dtDTO.getDni());
        dt.setDireccion(direccionRepository.findById(dtDTO.getId_direccion()).get());
        dt.setTelefono(dtDTO.getTelefono());
        dt.setEmail(dtDTO.getEmail());
        dt.setClub_dirigido(dtDTO.getClub_dirigido());
        dt.setFecha_inicio_club(dtDTO.getFecha_inicio_club());
        dt.setFecha_fin_club(dtDTO.getFecha_fin_club());
        return dt;
    }

    @Override
    public DtDTO convertirEntidadADTO(Dt dt) {
        DtDTO dtDTO = new DtDTO();
        dtDTO.setNombre(dt.getNombre());
        dtDTO.setApellido(dt.getApellido());
        dtDTO.setDni(dt.getDni());
        dtDTO.setId_direccion(dt.getDireccion().getId());
        dtDTO.setTelefono(dt.getTelefono());
        dtDTO.setEmail(dt.getEmail());
        dtDTO.setClub_dirigido(dt.getClub_dirigido());
        dtDTO.setFecha_inicio_club(dt.getFecha_inicio_club());
        dtDTO.setFecha_fin_club(dt.getFecha_fin_club());
        return dtDTO;
    }

    @Override
    public void agregarDt(DtDTO dtDTO) {
        dtRepository.save(convertirDTOAEntidad(dtDTO));
    }

    @Override
    public void actualizarDt(DtDTO dtDTO, Integer id) {
        Dt dt = convertirDTOAEntidad(dtDTO);
        dt.setId(id);
        dtRepository.save(dt);
    }

    @Override
    public DtDTO listarDtPorId(Integer id) {
        Dt dt = dtRepository.findById(id).get();
        return convertirEntidadADTO(dt);
    }

    @Override
    public void borrarDt(Integer id) {
        dtRepository.deleteById(id);
    }

}
