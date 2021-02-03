package com.example.banking.customer.service;

import com.example.banking.customer.domain.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    void confirmAppointment(Long id);

    Appointment findAppointment(Long id);
}
