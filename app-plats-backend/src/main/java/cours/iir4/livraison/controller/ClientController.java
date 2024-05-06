package cours.iir4.livraison.controller;
import cours.iir4.livraison.model.Client;
import cours.iir4.livraison.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class ClientController {

    private ClientService cs;
    public ClientController(ClientService cs) {
        this.cs = cs;
    }

    @GetMapping
    public List<Client> getClients(){
        return cs.getClients();
    }

    @GetMapping("/{id}")
    public Client getClient(Client idClient){
        return cs.getClient(idClient.getIdClient());
    }

    @PostMapping
    public Client addClient(Client cl){
        return cs.addClient(cl);
    }
}
