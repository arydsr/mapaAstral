package com.ada.mapaAstral.Enum;

import java.time.MonthDay;

public enum Sign {

    ARIES (MonthDay.of(3,21), MonthDay.of(4,20), "Aries"),
    TOURO (MonthDay.of(4,21), MonthDay.of(5,20), "Touro"),
    GEMINI (MonthDay.of(5,21), MonthDay.of(6,20), "Gemeos"),
    CANCER (MonthDay.of(6,21), MonthDay.of(7,20), "Cancer"),
    LEO (MonthDay.of(7,21), MonthDay.of(8,20), "Leao"),
    VIRGO (MonthDay.of(8,21), MonthDay.of(9,20), "Virgem"),
    LIBRA (MonthDay.of(9,21), MonthDay.of(10,20), "Libra"),
    SCORPIO (MonthDay.of(10,21), MonthDay.of(11,20), "Escorpiao"),
    SAGITTARIUS (MonthDay.of(11,21), MonthDay.of(12,20), "Sagitario"),
    CAPRICORN (MonthDay.of(12,21), MonthDay.of(1,20), "Capricornio"),
    AQUARIUS (MonthDay.of(1,21), MonthDay.of(2,20), "Aquario"),
    PISCES (MonthDay.of(2,21), MonthDay.of(3,20), "Peixes");


    private final MonthDay firstDay;
    private final MonthDay lastDay;

    private final String name;


    Sign(MonthDay firstDay, MonthDay lastDay, String name) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;

        this.name = name;
    }

    public MonthDay getFirstDay() {
        return firstDay;
    }

    public MonthDay getLastDay() {
        return lastDay;
    }

    public String getName() {
        return name;
    }
}
