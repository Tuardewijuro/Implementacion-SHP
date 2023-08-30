package com.lorenzo.terroristas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorenzo.terroristas.models.Terroristas;
import com.lorenzo.terroristas.dao.ITerroristasDAO;

@Service
public class TerroristasService implements ITerroristasService{

    @Autowired
    private ITerroristasDAO terroristaDAO;
    @Override
    public List<Terroristas> findAll() {
        return terroristaDAO.findAll();
    }

    @Override
    public Terroristas findById(Long id) {
        return terroristaDAO.findById(id).orElse(null);
    }

    @Override
    public Terroristas save(Terroristas terrorista) {
        return terroristaDAO.save(terrorista);
    }

    @Override
    public void delete(Long id) {
        terroristaDAO.deleteById(id);
    }

}
