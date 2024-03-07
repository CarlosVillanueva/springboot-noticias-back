package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository noticiaRepository;

    public List<Noticia> obtenerTodas() {
        return noticiaRepository.findAll();
    }

    public List<Noticia> buscarPorTitulo(String titulo) {
        return noticiaRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public Noticia guardar(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    public void borrar(Long id) {
        noticiaRepository.deleteById(id);
    }
}
