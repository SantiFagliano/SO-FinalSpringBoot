package Service;

import DTO.DireccionDTO;
import Entity.Direccion;
import Repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioDireccionImpl implements ServicioDireccion {
    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public Direccion convertirDTOAEntidad(DireccionDTO direccionDTO) {
        Direccion direccion = new Direccion();
        direccion.setCalle(direccionDTO.getCalle());
        direccion.setLocalidad(direccionDTO.getLocalidad());
        direccion.setProvincia(direccionDTO.getProvincia());
        direccion.setNumero(direccionDTO.getNumero());
        return direccion;
    }

    @Override
    public DireccionDTO convertirEntidadADTO(Direccion direccion) {
        DireccionDTO direccionDTO = new DireccionDTO();
        direccionDTO.setCalle(direccion.getCalle());
        direccionDTO.setLocalidad(direccion.getLocalidad());
        direccionDTO.setProvincia(direccion.getProvincia());
        direccionDTO.setNumero(direccion.getNumero());
        return direccionDTO;
    }

    @Override
    public void agregarDireccion(DireccionDTO direccionDTO) {
        Direccion direccion = convertirDTOAEntidad(direccionDTO);
        direccionRepository.save(direccion);

    }

    @Override
    public void actualizarDireccion(DireccionDTO direccion, Integer id) {
        Direccion direccion1 = convertirDTOAEntidad(direccion);
        direccion1.setId(id);
        direccionRepository.save(direccion1);
    }

    @Override
    public DireccionDTO listarDireccionPorId(Integer id) {
        Direccion direccion = direccionRepository.findById(id).get();
        return convertirEntidadADTO(direccion);
    }


    @Override
    public void borrarDireccion(Integer id_direccion) {
        direccionRepository.deleteById(id_direccion);
    }
}
