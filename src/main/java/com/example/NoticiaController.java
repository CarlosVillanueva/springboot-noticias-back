package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/noticias")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping
    public ResponseEntity<List<Noticia>> obtenerTodas() {
        List<Noticia> noticias = noticiaService.obtenerTodas();
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Noticia>> buscarPorTitulo(@RequestParam String titulo) {
        List<Noticia> noticias = noticiaService.buscarPorTitulo(titulo);
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Noticia> guardar(@RequestBody Noticia noticia) {
        Noticia nuevaNoticia = noticiaService.guardar(noticia);
        return new ResponseEntity<>(nuevaNoticia, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id) {
        noticiaService.borrar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}