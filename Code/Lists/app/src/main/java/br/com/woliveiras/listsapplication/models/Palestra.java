package br.com.woliveiras.listsapplication.models;

import java.io.Serializable;

/**
 * Created by williamsouza on 3/16/16.
 */
public class Palestra implements Serializable {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public Palestra setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Palestra setAutor(String autor) {
        this.autor = autor;
        return this;
    }
}
