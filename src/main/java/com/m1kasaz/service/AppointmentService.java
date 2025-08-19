package com.m1kasaz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.m1kasaz.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}