package ru.project.saske.car;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String make;

    private int numberOfSeats;

    public String color;

}
