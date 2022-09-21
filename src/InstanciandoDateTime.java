package instanciandoDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InstanciandoDateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate apenasData01 = LocalDate.now(); //Instanciando apenas a data. LocalDate é um método estático.
        System.out.println("Data SEM o horário > LocalDate <       " + apenasData01.toString());

        LocalDateTime dataComHorario01 = LocalDateTime.now(); //Instanciando data com hora.
        System.out.println("Data COM o horário > LocalDateTime <   " + dataComHorario01);

        Instant dataHoraComFusoHorario = Instant.now();
        System.out.println("Data e horario COM fuso > Instant <       " + dataHoraComFusoHorario);

        LocalDate texto8601EmHora = LocalDate.parse("2022-03-13");
        System.out.println("Convertento Texto ISO 8601 em LocalDate        " + texto8601EmHora);

        LocalDateTime texto8601EmHoraEData = LocalDateTime.parse("2022-03-13T14:15:35");
        System.out.println("Convertento Texto ISO 8601 em LocalDateTime    " + texto8601EmHoraEData);

        Instant texto8601EmHoraComFusoHorario = Instant.parse("2022-03-13T14:15:35Z");
        System.out.println("Convertento Texto ISO 8601 em Instant com fuso " + texto8601EmHoraComFusoHorario);

        //Convertendo um formato personalizado de data em DateTime ISO 8601; ex: 12/03/2022
        DateTimeFormatter dataPersolizada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataFormatadaPersonalizadaParaISO = LocalDate.parse("13/03/1998", dataPersolizada);
        System.out.println("Data persolanizada para ISO 8601 ==> " + dataFormatadaPersonalizadaParaISO);

        LocalDateTime dataEHoraPersonalizadaParaISO = LocalDateTime.parse("13/03/1998 13:15", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Data e hora personalizada para ISO 8061 ==> " + dataEHoraPersonalizadaParaISO);

        LocalDate anoMesDiaSeparados = LocalDate.of(2022, 03, 13);
        System.out.println("Recebendo ano, mês e dia separados: " + anoMesDiaSeparados);

        LocalDateTime anoMesDiaHoraMinutoSeparados = LocalDateTime.of(2022, 03, 13, 15, 13);
        System.out.println("Recebendo Ano, Mês, Dia, Hora e Minutos separadamente: " + anoMesDiaHoraMinutoSeparados);
        sc.close();
    }

}
