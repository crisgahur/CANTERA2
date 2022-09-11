package com.sofka.dao;

import com.sofka.domain.agenda;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface agendaDao extends CrudRepository<agenda, Long> {

    @Modifying
    @Query("update agenda age set age.name = :name where age.id = :id")
    public void updateName(
            @Param(value = "id") Long id,
            @Param(value = "name") String name

    );

    @Modifying
    @Query("update agenda age set age.number = :number where age.id = :id")
    public void updateNumber(
            @Param(value = "id") Long id,
            @Param(value = "number") String number

    );

    @Modifying
    @Query("update agenda age set age.email = :email where age.id = :id")
    public void updateEmail(
            @Param(value = "id") Long id,
            @Param(value = "email") String email

    );

    @Modifying
    @Query("update agenda age set age.born = :born where age.id = :id")
    public void updateBorn(
            @Param(value = "id") Long id,
            @Param(value = "born") String born

    );
}
