package com.example.bms.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private int row;
    private int column;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;
}
