package com.example.banking.customer.dao;

import com.example.banking.customer.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment,Long> {
    List<Appointment> findAll();

}
