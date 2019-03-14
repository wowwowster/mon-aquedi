package com.claurier.monaquedi.utils;

import com.claurier.monaquedi.exception.ApplicationException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;

/**
 * @author claurier
 * ZonedDateTime, Instant and OffsetTime ne sont pas supportés par le driver Postgre.
 * On ne peut pas utiliser les méthodes de conversion de dates standards
 */
public class PostgreDateUtils {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //private static DateFormat dateFormatWithSeconds = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    private static DateFormat dateFormatWithSeconds = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SSS");

    //Date dateMesure = dateFormatWithSeconds.parse("2019/02/25 07:00:00.000");
    private PostgreDateUtils() {
        throw new AssertionError();
    }


    /**
     * @param dateToConvert
     * @return
     * @author claurier
     * Un attribut java.util.Date qui mappe le data type Postgre DATE renvoie un format étrange, qu'on ne peut pas
     * convertir de façon classique en objet java.time.LocalDate.
     * La méthode toInstant() génère une erreur.
     * Du coup, on doit appliquer une conversion intermédiaire au format String
     */
    public static LocalDate convertPostGreDateToLocalDate(Date dateToConvert) {
        LocalDate localDate;
        try {
            String dateFormatString = "";
            dateFormatString = dateFormat.format(dateToConvert);
            localDate = LocalDate.parse(dateFormatString, formatter);
        } catch (Exception ex) {
            throw ex;
        }
        return localDate;
    }

    public static Date convertLocalDateToPostgreDate(LocalDateTime localDate) {
        Date convertedDate;
        String text;
        try {
            text = localDate.format(formatter);
            convertedDate = dateFormat.parse(text);

        } catch (ParseException pex) {
            ApplicationException appliException = new ApplicationException("Erreur lors de la conversion d'une date au format java vers le format Postgre");
            appliException.initCause(pex);
            throw appliException;
        } catch (Exception ex) {
            throw ex;
        }
        return convertedDate;
    }

    public static Date convertLocalDateToPostgreDate(LocalDate localDate) {
        Date convertedDate;
        try {
            String text = localDate.format(formatter);
            convertedDate = dateFormat.parse(text);
        } catch (ParseException pex) {
            ApplicationException appliException = new ApplicationException("Erreur lors de la conversion d'une date au format java vers le format Postgre");
            appliException.initCause(pex);
            throw appliException;
        }
        return convertedDate;
    }
}
