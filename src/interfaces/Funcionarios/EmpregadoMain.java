package src.interfaces.Funcionarios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpregadoMain {
    public static void main(String[] args) {
        Empregado joao = new Empregado("Joao", 100, BigDecimal.valueOf(2000d));
        Empregado maria = new Empregado("Maria", 200, BigDecimal.valueOf(2000d));
        Empregado paulo = new Empregado("Paulo", 150, BigDecimal.valueOf(2000d));

        List<Empregado> empregados = new ArrayList<>();
        ArrayList<Empregado> empregado1 = new ArrayList();

        empregados.add(joao);
        empregados.add(maria);
        empregados.add(paulo);

        System.out.println(">>>> Antes da ordenação.%n%n");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }

        Collections.sort(empregados);

        System.out.printf(">>>> Depois da ordenação.%n%n");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
}
