import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraDeDatas {

    // Método para calcular a diferença de dias entre duas datas
    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }
}
