package br.com.invillia.insiders.grupo1.model.service;

import br.com.invillia.insiders.grupo1.model.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    public ResponseEntity<?> getById(Long id) {
        return ResponseEntity.ok(create(id));
    }

    private ResponseEntity<?> create(Long id) {

        return ResponseEntity.ok(new Course(
                id,
                "Curso Spring Boot",
                12.00,
                "Aberto"
        ));
    }



}
