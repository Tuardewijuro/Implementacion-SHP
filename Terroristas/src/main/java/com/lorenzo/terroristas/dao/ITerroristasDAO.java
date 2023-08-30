package com.lorenzo.terroristas.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lorenzo.terroristas.models.Terroristas;
public interface ITerroristasDAO extends JpaRepository<Terroristas, Long>{

}
