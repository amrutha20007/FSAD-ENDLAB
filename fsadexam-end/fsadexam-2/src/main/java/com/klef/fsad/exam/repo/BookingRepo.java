package com.klef.fsad.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.model.Booking;

public interface BookingRepo extends JpaRepository<Booking,Integer>
{

}