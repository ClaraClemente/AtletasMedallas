package atletamedalla.demo.repository;

import atletamedalla.demo.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtletaRepository extends JpaRepository<Atleta,Long> {


    default List<Atleta> atletasByFechaNacimiento(Fecha_Nacimiento) {

    }
}
