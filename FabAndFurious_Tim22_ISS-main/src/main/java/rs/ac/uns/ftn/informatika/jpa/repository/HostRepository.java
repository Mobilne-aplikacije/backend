package rs.ac.uns.ftn.informatika.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.uns.ftn.informatika.jpa.model.Host;

import java.util.List;
import java.util.Optional;

public interface HostRepository extends JpaRepository<Host, Long> {

    List<Host> findAll();
    Optional<Host> findById(String Long);

}