package instanciandoDateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataEhora {
    public static void main(String[] args) {

        LocalDate dataLocal = LocalDate.parse("2022-07-20");
        LocalDateTime dataEhoraLocal = LocalDateTime.parse("2022-07-20T15:00:15");
        Instant dataEhoraGlobal = Instant.parse("2022-07-20T15:00:15Z");

        LocalDate pastWeekLocalDate = dataLocal.minusWeeks(1);
        LocalDate nextWeekLocalDate = dataLocal.plusWeeks(1);
        System.out.println("pastWeekLocalDate ==> " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate ==> " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = dataEhoraLocal.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = dataEhoraLocal.plusWeeks(1);
        System.out.println("pastWeekLocalDateTime ==> " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime ==> " + nextWeekLocalDateTime);

        Instant pastWeekInstant = dataEhoraGlobal.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = dataEhoraGlobal.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant ==> " + pastWeekInstant);
        System.out.println("nextWeekInstant ==> " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, dataEhoraLocal);
        System.out.println("Duração ==> " + t1.toDays() + " dias");
    }
}
