package io.github.felipeferreirabarbosa.service;

import io.github.felipeferreirabarbosa.model.Client;
import io.github.felipeferreirabarbosa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private  ClientRepository repository;

    public ClientService(ClientRepository repository){
        this.repository = repository;
    }

    public void saveClient(Client client){
        validateClient(client);
        this.repository.insert(client);

    }

    public void validateClient(Client client){
        //Aplicate validation
    }

}
