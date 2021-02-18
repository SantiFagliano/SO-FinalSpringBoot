package Service;

import DTO.DireccionDTO;
import Entity.Direccion;

public interface ServicioDireccion {
    public Direccion convertirDTOAEntidad(DireccionDTO direccionDTO);

    public DireccionDTO convertirEntidadADTO(Direccion direccion);

    public void agregarDireccion(DireccionDTO direccionDTO);

    public void actualizarDireccion(DireccionDTO direccionDTO, Integer id);

    public DireccionDTO listarDireccionPorId(Integer id);

    public void borrarDireccion(Integer id_direccion);
}
