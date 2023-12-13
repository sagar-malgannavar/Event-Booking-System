package com.booking.system.ticketbookingsystem.repository;

import com.booking.system.ticketbookingsystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Ticket, Long> {
}
