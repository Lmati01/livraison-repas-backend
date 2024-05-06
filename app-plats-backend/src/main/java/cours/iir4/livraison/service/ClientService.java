package cours.iir4.livraison.service;
import java.util.List;
import cours.iir4.livraison.model.Client;

public interface ClientService {
    List<Client> getClients();
    Client getClient(Long id);
    Client addClient(Client cl);
    void deleteClient(Long idClient);
    void modifierClient(Client nouvClient);
}
