package instanciandoDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TransformandoDataHoraEmTextoStringPersonalizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate apenasDataLocal = LocalDate.parse("2022-07-20" );
        LocalDateTime dataEhoraLocal = LocalDateTime.parse("2022-07-20T15:00:15");
        Instant dataEhoraComFusoHorario = Instant.parse("2022-07-20T15:00:15Z");

        DateTimeFormatter dataLocalPersonalizada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Apenas a data local. Padrão ISO 8601: " + apenasDataLocal);
        System.out.println("Apenas a data local. Persolanizada: " + apenasDataLocal.format(dataLocalPersonalizada));
        //Tambem podemos passas os parametros invertidos. O padrão personalizado recebendo o argumento da data.
        System.out.println(dataLocalPersonalizada.format(apenasDataLocal));
        System.out.println(apenasDataLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("=========================== Formatando data e hora local ==================================");
        DateTimeFormatter dataEhoraLocalPersonalizada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data e Hora personalizada: " + dataEhoraLocal.format(dataEhoraLocalPersonalizada));

        System.out.println("====================== Formatando datae hora com fuso-horário =============================");
        DateTimeFormatter dataEhoraComFuso = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Data e horario com fuso-horario: " + dataEhoraComFuso.format(dataEhoraComFusoHorario));
        DateTimeFormatter outraFormadePersonalizarComFuso = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Data e horario com fuso-horario: " + outraFormadePersonalizarComFuso.format(dataEhoraLocal));
        sc.close();
    }
}
