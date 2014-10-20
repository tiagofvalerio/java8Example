package grupo.estudo.tiago.java8_1;

import java.util.Arrays;
import java.util.List;

public class FuncionarioUtils {

	private static Funcionario f1 = new Funcionario("Tiago", "Valerio", 26,
			90.0D, 1.79D);
	private static Funcionario f2 = new Funcionario("Cristiano", "Andrade", 28,
			20.0D, 2.30D);
	private static Funcionario f3 = new Funcionario("Ricardo", "Vanhoz", 23,
			95.0D, 1.60D);
	private static Funcionario f4 = new Funcionario("Funcionario4",
			"Idade repetida", 23, 50.0D, 1.80D);
	private static Funcionario f5 = new Funcionario("Funcionario5", "Bozinho",
			80, 45.0D, 1.55D);
	private static Funcionario f6 = new Funcionario("Funcionario6", "He-Man",
			35, 85.0D, 2.05D);
	private static Funcionario f7 = new Funcionario("Funcionario7", "Sheera",
			20, 45.0D, 1.60D);
	private static Funcionario f8 = new Funcionario("Funcionario8",
			"Dá Radugue Ryu", 27, 70.0D, 1.880D);
	private static Funcionario f9 = new Funcionario("Funcionario9",
			"Defende Ken", 26, 72.0D, 1.92D);
	private static Funcionario f10 = new Funcionario("Funcionario10", "Fim",
			109, 45.0D, 1.60D);

	public static final List<Funcionario> funcionarios = Arrays.asList(f1, f2,
			f3, f4, f5, f6, f7, f8, f9, f10);
}
