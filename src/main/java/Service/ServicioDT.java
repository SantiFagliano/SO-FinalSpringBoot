package Service;

import DTO.DtDTO;
import Entity.Dt;

public interface ServicioDT {
    public Dt convertirDTOAEntidad(DtDTO dtDTO);

    public DtDTO convertirEntidadADTO(Dt dt);

    public void agregarDt(DtDTO dtDTO);

    public void actualizarDt(DtDTO dtDTO, Integer id);

    public DtDTO listarDtPorId(Integer id);

    public void borrarDt(Integer id);
}
