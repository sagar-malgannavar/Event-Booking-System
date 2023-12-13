package com.booking.system.ticketbookingsystem.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Ticket {

    private Long Id;
    private String eventName;
    private Date eventDate;
    private Date expiryDate;

}
