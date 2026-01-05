package com.carros.demo.service;

import com.carros.demo.entity.Carro;
import com.carros.demo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

/*
   Instância da classe Carro no repository
   Método de salvar um carro
 */
    @Autowired
    private CarroRepository carroRepository;

    // Salva um carro
    public String save(Carro carro) { // Objeto carro da classe carro
        this.carroRepository.save(carro);
        return "Carro salvo com sucesso!";
    }

    // Atualiza um carro
    public String update(Carro carro, long id) {
        carro.setId(id);
        this.carroRepository.save(carro);
        return "Carro atualizado com sucesso!";
    }

    // Deleta um carro
    public String delete(long id){
        this.carroRepository.deleteById(id);
        return "Carro deletado com sucesso!";
    }

    // Listar todos os carros
    public List<Carro> listar() {
        List<Carro> listaCarros = this.carroRepository.findAll();
        return listaCarros;
    }

    // Buscar um carro pelo “id”
    public Carro findById(long id){
        Carro carro = this.carroRepository.findById(id).get();
        return carro;
    }
}


    








