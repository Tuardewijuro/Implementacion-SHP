package com.lorenzo.terroristas.services;

import java.util.List;
import com.lorenzo.terroristas.models.Terroristas;
public interface ITerroristasService {
    public List<Terroristas> findAll();
    public Terroristas save(Terroristas terrorista);
    public void delete(Long id);
    public Terroristas findById(Long id);
}