package cours.iir4.livraison.repository;
import cours.iir4.livraison.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository< Client , Long> {}