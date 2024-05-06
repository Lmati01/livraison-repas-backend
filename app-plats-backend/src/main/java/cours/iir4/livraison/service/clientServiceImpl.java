package cours.iir4.livraison.service;
import cours.iir4.livraison.model.Client;
import cours.iir4.livraison.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class clientServiceImpl implements ClientService{

    private ClientRepository cr;
    public clientServiceImpl(ClientRepository cr) {
        this.cr = cr;
    }

    @Override
    public List<Client> getClients() {
        return cr.findAll();
    }

    @Override
    public Client getClient(Long idClient) {
        return cr.findById(idClient).get();
    }

    @Override
    public Client addClient(Client cl) {
        return null;
    }

    @Override
    public void deleteClient(Long idClient) {

    }

    @Override
    public void modifierClient(Client nouvClient) {

    }
}
