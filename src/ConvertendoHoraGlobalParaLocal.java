package instanciandoDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoHoraGlobalParaLocal {
    public static void main(String[] args) {

        LocalDate apenasDataLocal = LocalDate.parse("2022-07-20");
        LocalDateTime dataEhoraLocal = LocalDateTime.parse("2022-07-20T15:00:15");
        Instant dataEhoraComFusoHorario = Instant.parse("2022-07-20T01:00:15Z");

        LocalDate resultado1 = LocalDate.ofInstant(dataEhoraComFusoHorario, ZoneId.systemDefault());
        System.out.println(resultado1);
    }
}
