package com.holidayzer.api;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                     // Getters e setters
@NoArgsConstructor        // Construtor sem argumentos
@AllArgsConstructor       // Construtor com todos os argumentos
public class Holidays{
    List<Holiday> holidays = new ArrayList<>();

    void setHoliday(Holiday holiday) {
        this.holidays.add(holiday);
    }
    String getHoliday(String date){
        for(Holiday holiday : this.holidays){
            if(holiday.getDate().equals(date)){
                return("Dia "+date+" é "+holiday.getDesciption()+"! :)");
            }
        }
        return "Dia "+ date + " não é feriado :(";
    }
}
