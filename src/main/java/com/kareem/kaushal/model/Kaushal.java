package com.kareem.kaushal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kaushal {
    String name;
    String place;
    double salary;
    public Kaushal(double salary){
        this.salary=salary;
    }
}
