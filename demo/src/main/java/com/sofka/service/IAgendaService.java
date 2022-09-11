package com.sofka.service;

import com.sofka.domain.agenda;

import java.util.List;
import java.util.Optional;

public interface IAgendaService {
    public List<agenda> list();

    public agenda save(agenda agenda);

    public agenda update(Long id, agenda agenda);

    public void delete (agenda agenda);

    public Optional<agenda> findUser(agenda agenda);
}
