package sv.udb.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.udb.edu.domain.Boleto;

public interface BoletoRepository extends JpaRepository<Boleto, Long> {
}
