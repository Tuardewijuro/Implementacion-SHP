package com.lorenzo.terroristas.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "terroristas")
public class Terroristas implements Comparable<Terroristas>, Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String alias;
    @Column
    private String nacionalidad;
    @Column
    private int posicionMasBuscados;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public String getAlias(){
        return alias;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public void setPosicionMasBuscados(int posicionMasBuscados){
        this.posicionMasBuscados = posicionMasBuscados;
    }

    public int getPosicionMasBuscados(){
        return posicionMasBuscados;
    }

    @Override
    public int compareTo(Terroristas o) {
        if(this.getPosicionMasBuscados() > o.getPosicionMasBuscados()){
            return -1;
        }else{
            return 1;
        }
    }
}