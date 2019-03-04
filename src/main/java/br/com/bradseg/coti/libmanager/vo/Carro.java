package br.com.bradseg.coti.libmanager.vo;

import java.io.Serializable;

/**
 * Carro
 */
public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}