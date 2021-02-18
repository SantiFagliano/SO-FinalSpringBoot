package Service;

import DTO.EquipoDTO;
import Entity.Equipo;
import Repository.DireccionRepository;
import Repository.DtRepository;
import Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEquipoImpl implements ServicioEquipo {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private DireccionRepository direccionRepository;
    @Autowired
    private DtRepository dtRepository;

    @Override
    public Equipo convertirDTOEnEntidad(EquipoDTO equipoDTO) {
        Equipo equipo = new Equipo();
        equipo.setCuit(equipoDTO.getCuit());
        equipo.setNombre(equipoDTO.getNombre());
        equipo.setFecha_fundacion(equipoDTO.getFecha_fundacion());
        equipo.setNombre_presidente(equipoDTO.getNombre_presidente());
        equipo.setApellido_presidente(equipoDTO.getApellido_presidente());
        equipo.setDireccion(direccionRepository.findById(equipoDTO.getId_direccion()).get());
        equipo.setTelefono(equipoDTO.getTelefono());
        equipo.setEmail(equipoDTO.getEmail());
        equipo.setCategoria_actual(equipoDTO.getCategoria_actual());
        equipo.setDt(dtRepository.findById(equipoDTO.getId_dt()).get());
        equipo.setFecha_inicio_primera_division(equipoDTO.getFecha_inicio_primera_division());
        equipo.setFecha_fin_primera_division(equipoDTO.getFecha_fin_primera_division());
        return equipo;
    }

    @Override
    public EquipoDTO convertirEntidadADTO(Equipo equipo) {
        EquipoDTO equipoDTO = new EquipoDTO();
        equipoDTO.setCuit(equipo.getCuit());
        equipoDTO.setNombre(equipo.getNombre());
        equipoDTO.setFecha_fundacion(equipo.getFecha_fundacion());
        equipoDTO.setNombre_presidente(equipo.getNombre_presidente());
        equipoDTO.setApellido_presidente(equipo.getApellido_presidente());
        equipoDTO.setId_direccion(equipo.getDireccion().getId());
        equipoDTO.setTelefono(equipo.getTelefono());
        equipoDTO.setEmail(equipo.getEmail());
        equipoDTO.setCategoria_actual(equipo.getCategoria_actual());
        equipoDTO.setId_dt(equipo.getDt().getId());
        equipoDTO.setFecha_inicio_primera_division(equipo.getFecha_inicio_primera_division());
        equipoDTO.setFecha_fin_primera_division(equipo.getFecha_fin_primera_division());
        return equipoDTO;
    }

    @Override
    public void agregarEquipo(EquipoDTO equipoDTO) {
        equipoRepository.save(convertirDTOEnEntidad(equipoDTO));
    }

    @Override
    public void actualizarEquipo(EquipoDTO equipoDTO, Integer id) {
        Equipo equipo = this.convertirDTOEnEntidad(equipoDTO);
        equipo.setId(id);
        equipoRepository.save(equipo);
    }

    @Override
    public EquipoDTO listarEquipoPorId(Integer id) {
        Equipo equipo = equipoRepository.findById(id).get();
        return convertirEntidadADTO(equipo);
    }

    @Override
    public void borrarEquipo(Integer id) {
        equipoRepository.deleteById(id);
    }


}
