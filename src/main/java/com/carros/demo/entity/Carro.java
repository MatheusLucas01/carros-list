package com.carros.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Substitui o @Getter e @Setter
@Setter
@AllArgsConstructor // Substitui o @AllArgsConstructor e @NoArgsConstructor
@NoArgsConstructor
@Entity // Ao importar esse Entity as tabelas serão criadas no banco de dados automaticamente
public class Carro {

    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Mapeamento do objeto
    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private Integer anoFabricacao;

    // Get e "Setter" do "id", para poder usar o "id" em outras classe e também setar
    public void setId(long id) {
        this.id = id;
    }
}
