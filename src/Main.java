import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Exibindo o calendário de um mês específico
        Calendario calendario = new Calendario();
        calendario.exibirCalendario(2024, 9); // Exemplo: setembro de 2024

        // Verificando se uma data é feriado
        Feriado feriado = new Feriado();
        LocalDate dataTeste = LocalDate.of(2024, 9, 7); // Independência do Brasil
        if (feriado.isFeriado(dataTeste)) {
            System.out.println(dataTeste + " é feriado.");
        } else {
            System.out.println(dataTeste + " não é feriado.");
        }

        // Calculando a diferença de dias entre duas datas
        CalculadoraDeDatas calculadora = new CalculadoraDeDatas();
        LocalDate data1 = LocalDate.of(2024, 9, 1);
        LocalDate data2 = LocalDate.of(2024, 9, 15);
        long diferenca = calculadora.calcularDiferencaDias(data1, data2);
        System.out.println("Diferença de dias: " + diferenca + " dias.");
    }
}
