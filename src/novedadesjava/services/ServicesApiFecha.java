/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novedadesjava.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author kgalarza
 */
public class ServicesApiFecha {

    DateTimeFormatter formatter;
    Locale idioma;

    {
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        idioma = new Locale("es", "ES");
    }

    public String getFechaActual() {
        return LocalDate.now().format(formatter);
    }

    public void establecerFormatoFecha(String patron) {
        formatter = DateTimeFormatter.ofPattern(patron);
    }

    public String getDiaSemana(LocalDate fecha) {
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        return diaSemana.getDisplayName(TextStyle.FULL, idioma);
    }

    public String getDiaSemanaActual() {
        LocalDate hoy = LocalDate.now();
        DayOfWeek diaSemana = hoy.getDayOfWeek();
        return diaSemana.getDisplayName(TextStyle.FULL, idioma);
    }
}
