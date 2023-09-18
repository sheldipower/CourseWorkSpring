package com.example.CourseWorkSpring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="bid")
@Getter
@Setter
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bidderName;
    private LocalDateTime dateTime;


    public Bid() {
    }
    public Bid(String bidderName) {
        this.bidderName = bidderName;
        this.dateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", bidderName='" + bidderName + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}