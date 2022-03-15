package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    final int GIGA_SECOND = 1_000_000_000;
    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        setDateTime(LocalDateTime.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth(),
               0 ,0, 0));
    }

    public Exercise004(LocalDateTime dateTime) {
        setDateTime(dateTime);
    }

    private void setDateTime(LocalDateTime localDateTime) {
        dateTime = localDateTime.plusSeconds(GIGA_SECOND);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
