import java.time.LocalDate;
import java.time.Month;

public class Calendario {

    // Método para exibir o calendário de um determinado mês e ano
    public void exibirCalendario(int ano, int mes) {
        LocalDate primeiroDia = LocalDate.of(ano, mes, 1);
        Month mesEnum = primeiroDia.getMonth();
        System.out.println("Calendário de " + mesEnum + " " + ano);
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");

        int diaDaSemana = primeiroDia.getDayOfWeek().getValue() % 7; // Ajuste para começar no domingo
        for (int i = 0; i < diaDaSemana; i++) {
            System.out.print("    "); // Espaçamento inicial
        }

        for (int dia = 1; dia <= mesEnum.length(primeiroDia.isLeapYear()); dia++) {
            System.out.printf("%3d ", dia);
            if ((dia + diaDaSemana) % 7 == 0) {
                System.out.println(); // Quebra de linha após sábado
            }
        }
        System.out.println();
    }
}
