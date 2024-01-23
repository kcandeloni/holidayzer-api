package com.holidayzer.api;

import java.util.ArrayList;
import java.util.List;

public class Holidays {
    private List<Holiday> holidays = new ArrayList<>();

    Holidays(){
    }

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
