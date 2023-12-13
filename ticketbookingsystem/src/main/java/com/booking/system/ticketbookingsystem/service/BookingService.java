package com.booking.system.ticketbookingsystem.service;

import com.booking.system.ticketbookingsystem.entity.Ticket;
import com.booking.system.ticketbookingsystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    public Ticket saveTicket(Ticket ticket) {
        Ticket ticket1 = bookingRepository.save(ticket);
        return ticket1;
    }

    public Optional<Ticket> findTicketById(Long id) {
        Optional<Ticket> ticketList= bookingRepository.findById(id);
        return ticketList;
    }

    public void deleteTicketById(Long id) {
        bookingRepository.deleteById(id);
    }
}
