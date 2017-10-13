package atletamedalla.demo.repository;

import atletamedalla.demo.domain.Medalla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedallaRepository extends JpaRepository<Medalla,Long> {

}
