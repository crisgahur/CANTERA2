package com.sofka.service;

import com.sofka.dao.agendaDao;
import com.sofka.domain.agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AgendaService implements IAgendaService{

    @Autowired // It's to insert agendaDao
    private agendaDao agendaDao;


    @Override
    @Transactional(readOnly = true)
    public List<agenda> list() {
        return (List<agenda>) agendaDao.findAll();
    }

    @Override
    public agenda save(agenda agenda) {
        return agendaDao.save(agenda);
    }

    @Override
    @Transactional
    public agenda update(Long id, agenda agenda) {
        agenda.setId(id);
        return agendaDao.save(agenda);
    }

    @Transactional
    public void updateName(Long id, agenda agenda){
        agendaDao.updateName(id,agenda.getName());
    }

    @Transactional
    public void updateNumber(Long id, agenda agenda){
        agendaDao.updateNumber(id,agenda.getNumber());
    }

    @Transactional
    public void updateEmail(Long id, agenda agenda){
        agendaDao.updateEmail(id,agenda.getEmail());
    }

    @Transactional
    public void updateBorn(Long id, agenda agenda){
        agendaDao.updateBorn(id,agenda.getBorn());
    }

    @Override
    @Transactional
    public void delete(agenda agenda) {
           agendaDao.delete(agenda);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<agenda> findUser(agenda agenda) {
        return agendaDao.findById(agenda.getId());
    }
}
