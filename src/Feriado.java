import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Feriado {

    private Set<LocalDate> feriados;

    // Construtor que carrega os feriados
    public Feriado() {
        this.feriados = new HashSet<>();
        carregarFeriados();
    }

    // Método para verificar se uma data é feriado
    public boolean isFeriado(LocalDate data) {
        return feriados.contains(data);
    }

    // Carregar feriados para o calendário (exemplo de alguns feriados nacionais no Brasil)
    private void carregarFeriados() {
        int anoAtual = LocalDate.now().getYear();
        feriados.add(LocalDate.of(anoAtual, 1, 1));  // Ano Novo
        feriados.add(LocalDate.of(anoAtual, 4, 21)); // Tiradentes
        feriados.add(LocalDate.of(anoAtual, 5, 1));  // Dia do Trabalho
        feriados.add(LocalDate.of(anoAtual, 9, 7));  // Independência do Brasil
        feriados.add(LocalDate.of(anoAtual, 10, 12)); // Nossa Senhora Aparecida
        feriados.add(LocalDate.of(anoAtual, 11, 15)); // Proclamação da República
        feriados.add(LocalDate.of(anoAtual, 12, 25)); // Natal
    }
}
