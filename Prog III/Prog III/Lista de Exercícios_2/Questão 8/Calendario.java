import java.time.DayOfWeek;
import java.time.LocalDate;
    
public class Calendario {
    // 8.Implemente a classe Calendário com método estático para imprimir o calendário de um dado ano e mês. Use importes estáticos para as classes System e LocalDate. Lembre-se imports estáticos permitem usar métodos estáticos sem mencionar as classes.
  
    public static void imprimirCalendario(int ano, int mes) {
        LocalDate data = LocalDate.of(ano, mes, 1);
        DayOfWeek dia = data.getDayOfWeek();

        System.out.println(" Seg Ter  Qua  Qui Sex Sab Dom");
        
        for (int i = 1; i < dia.getValue(); i++) { System.out.print("    "); }

        while (data.getMonthValue() == mes)
        {
            System.out.printf("%4d", data.getDayOfMonth());
            if (data.getDayOfWeek().getValue() == 7)
                System.out.println();
            data = data.plusDays(1);
        }
    }

    public static void main(String[] args) {
        imprimirCalendario(2022, 5);

    }
}