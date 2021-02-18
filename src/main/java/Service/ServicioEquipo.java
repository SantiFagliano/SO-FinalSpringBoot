package Service;

import DTO.EquipoDTO;
import Entity.Equipo;

public interface ServicioEquipo {
    public Equipo convertirDTOEnEntidad(EquipoDTO equipoDTO);

    public EquipoDTO convertirEntidadADTO(Equipo equipo);

    public void agregarEquipo(EquipoDTO equipoDTO) ;

    public void actualizarEquipo(EquipoDTO equipoDTO, Integer id) ;

    public EquipoDTO listarEquipoPorId(Integer id) ;

    public void borrarEquipo(Integer id) ;

}
