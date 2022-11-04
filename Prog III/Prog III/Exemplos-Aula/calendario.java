import java.time.DayOfWeek;
import java.time.LocalDate;

public class calendario {    
    public static void main(String[] args){
        int mes = Integer.parseInt(args[0]);
        int ano = Integer.parseInt(args[1]);

        LocalDate database = LocalDate.of(ano, mes, 1);

        System.out.println(" Seg Ter Qua Qui Sex Sab Dom");

        DayOfWeek diaSemana = database.getDayOfWeek();
        for (int i = 1; i < diaSemana.getValue(); i++){System.out.println("    ");}
        while (database.getMonthValue() == mes)
        {
            System.out.printf("%4d", database.getDayOfMonth());
            if (database.getDayOfWeek().getValue() == 7) 
                System.out.println();
            database = database.plusDays(1);
            
        }
    }
}
