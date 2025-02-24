package sv.udb.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.udb.edu.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
