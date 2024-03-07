package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
    List<Noticia> findByTituloContainingIgnoreCase(String titulo);
}