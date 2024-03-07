package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private DemoApplication demoApplication;  // Inyecta cualquier bean que desees probar

    @Test
    void contextLoads() {
        // Verifica que el contexto de la aplicación se haya cargado correctamente
        assertThat(demoApplication).isNotNull();
    }
}
