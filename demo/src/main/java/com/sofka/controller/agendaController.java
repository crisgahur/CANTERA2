package com.sofka.controller;

import com.sofka.domain.agenda;
import com.sofka.service.AgendaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin
@RestController
public class agendaController {


    @Autowired
    private AgendaService agendaService;

    @GetMapping(path = "/contacts")
    public List<agenda> listado(){
        return agendaService.list();
    }

    @PostMapping(path = "/contact")
    public ResponseEntity<agenda> create(agenda agenda) {
        log.info("Contact to create: {}", agenda);
        agendaService.save(agenda);
        return new ResponseEntity<>(agenda, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<agenda> delete(agenda agenda) {
        log.info("Contact to delete: {}", agenda);
        agendaService.delete(agenda);
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @PutMapping(path = "/contact/{id}")
    public ResponseEntity<agenda>  update(agenda agenda, @PathVariable ("id") Long id) {
        log.info("Contact to modify: {}", agenda);
        agendaService.update(id, agenda);
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/name/{id}")
    public ResponseEntity<agenda> updateName(agenda agenda, @PathVariable ("id") Long id) {
        log.info("Contacto a modificar nombre: {}", agenda);
        agendaService.updateName(id, agenda);
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/number/{id}")
    public ResponseEntity<agenda> updateNumber (agenda agenda, @PathVariable ("id") Long id) {
        log.info("Contact to modify number: {}", agenda);
        agendaService.updateNumber(id, agenda);
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/email/{id}")
    public ResponseEntity<agenda> updateEmail(agenda agenda, @PathVariable ("id") Long id) {
        log.info("Contact to modify email: {}", agenda);
        agendaService.updateEmail(id, agenda);
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

    @PatchMapping(path = "/contact/born/{id}")
    public ResponseEntity<agenda> updateBorn(agenda agenda, @PathVariable ("id") Long id) {
        log.info("Contact to modify born date: {}", agenda);
        agendaService.updateBorn(id, agenda);
        return new ResponseEntity<>(agenda, HttpStatus.OK);
    }

}