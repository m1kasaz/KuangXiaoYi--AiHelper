package com.m1kasaz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.m1kasaz.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}
