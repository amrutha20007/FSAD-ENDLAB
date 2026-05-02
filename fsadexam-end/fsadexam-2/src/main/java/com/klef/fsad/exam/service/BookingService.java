package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repo.BookingRepo;

@Service
public class BookingService 
{
    @Autowired
    private BookingRepo repo;

    public Booking addBooking(Booking booking)
    {
        return repo.save(booking);
    }

    public String deleteBooking(int id)
    {
        repo.deleteById(id);
        return "Booking Deleted";
    }
}