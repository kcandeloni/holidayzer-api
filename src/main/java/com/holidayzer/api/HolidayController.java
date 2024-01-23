package com.holidayzer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/holidays")
public class HolidayController {
    Holidays holidays = new Holidays();
    HolidayController(){
        holidays.setHoliday(new Holiday("01-01-2024", "Confraternização Mundial"));
        holidays.setHoliday(new Holiday("12-02-2024", "Carnaval"));
        holidays.setHoliday(new Holiday("13-02-2024", "Carnaval"));
        holidays.setHoliday(new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidays.setHoliday(new Holiday("21-04-2024", "Tiradentes"));
        holidays.setHoliday(new Holiday("01-05-2024", "Dia do Trabalho"));
    }

    @GetMapping()
    public Holidays getHolidays() {
        return holidays;
    }
    
    @GetMapping("/{date}")
    public String getHoliday(@PathVariable String date) {
        return holidays.getHoliday(date);
    }
    
}
