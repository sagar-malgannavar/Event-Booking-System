package com.booking.system.ticketbookingsystem.controller;

import com.booking.system.ticketbookingsystem.entity.Ticket;
import com.booking.system.ticketbookingsystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookingController {

    @Autowired
    private BookingService bookingService;

    // This Rest API will book the ticket provided the details in the JSON format and returns the created ticket in String
    @PostMapping("/bookticket")
    public String bookTicket(@RequestBody Ticket ticket) {
        Ticket ticket1 = bookingService.saveTicket(ticket);
        return ticket1.toString();
    }

    // This Rest API will fetch the tickets by ID of the ticket and then returns the list of ID's in the JSON format
    @GetMapping("/find/{id}")
    public ResponseEntity<List<Ticket>> getTicketByID(@PathVariable Long id) {
        List<Ticket> ticket = bookingService.findTicketById(id).stream().toList();
        return new ResponseEntity<>(ticket,HttpStatus.FOUND);
    }

    //This Rest API will delete the ticket ID's
    @DeleteMapping("/delete/{id}")
    public void deleteTicketById(@PathVariable Long id) {
        bookingService.deleteTicketById(id);
    }
}
