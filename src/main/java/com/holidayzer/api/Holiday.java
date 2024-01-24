package com.holidayzer.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                     // Getters e setters
@NoArgsConstructor        // Construtor sem argumentos
@AllArgsConstructor       // Construtor com todos os argumentos
public class Holiday {
    String dateHoliday;
    String description;

    String getDate(){
        return dateHoliday;
    }

    String getDesciption(){
        return description;
    }
}