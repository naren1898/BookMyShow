package com.example.bms.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {

    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;

    private Date timeOfPayment;
    private double amount;
    private String referenceId;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @ManyToOne
    private Ticket ticket;
}
