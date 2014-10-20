package grupo.estudo.tiago.java8_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import au.com.bytecode.opencsv.CSVWriter;

public class Java8Examples {

	// 1
	public static List<Funcionario> filterByName(
			List<Funcionario> funcionarios, String name) {
		return funcionarios.stream()
				.filter((Funcionario f) -> name.equals(f.getNome()))
				.collect(Collectors.toList());
	}

//	// 2
//	public static List<Funcionario> sortByAgeAndName(
//			List<Funcionario> funcionarios) {
//		return funcionarios
//				.stream()
//				.sorted((f3, f4) -> f3.getNome().compareTo(f4.getNome()))
//				.sorted((f1, f2) -> Integer.compare(f1.getIdade(),
//						f2.getIdade())).collect(Collectors.toList());
//	}
	
	// 2
	public static List<Funcionario> sortByAgeAndName(
			List<Funcionario> funcionarios) {
		return funcionarios
				.stream()
				.sorted(Comparator.comparing(Funcionario::getNome)
						.thenComparing(
								Comparator.comparing(Funcionario::getIdade)))
				.collect(Collectors.toList());
	}

	// 3
	public static List<String> getListOnlyWithNames(
			List<Funcionario> funcionarios) {
		return funcionarios.stream().map(Funcionario::getNome)
				.collect(Collectors.toList());
	}

	// 4
	public static Optional<Double> sumOfWeight(List<Funcionario> funcionarios) {
		return funcionarios.stream().map(Funcionario::getPeso)
				.reduce((p1, p2) -> {
					return p1 + p2;
				});
	}

	// 5
	public static List<Funcionario> getWeightsMinorThen80(
			List<Funcionario> funcionarios) {
		return funcionarios.stream().filter(f -> f.getPeso() < 80D)
				.collect(Collectors.toList());
	}

	// 6
	public static void createCsvFile(List<Funcionario> funcionarios) {
		String csv = "/tmp/CsvFile.csv";
		List<String> s = null;
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(csv));
			s = funcionarios.stream().map(Funcionario::toString)
					.collect(Collectors.toList());

			for (String sTemp : s) {
				String[] array = sTemp.split(",");
				writer.writeNext(array);
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 7
	public static List<String> getListWithNamesAndLastNames(
			List<Funcionario> funcionarios) {
		return funcionarios.stream().map(s -> {
			return s.getNome() + " " + s.getSobrenome();
		}).collect(Collectors.toList());
	}

	// 8
	public static Long getListOlderThen25(List<Funcionario> funcionarios) {
		return funcionarios.stream()
				.filter((Funcionario f) -> f.getIdade() > 25).count();
	}

	// 9
	public static List<Funcionario> getFirstThreeElements(
			List<Funcionario> funcionarios) {
		return funcionarios.stream().limit(3).collect(Collectors.toList());
	}

	// 10
	public static List<Integer> getNumberOfCaracters(
			List<Funcionario> funcionarios) {
		return funcionarios.stream().map((f) -> {
			return f.getNome().length() + f.getSobrenome().length();
		}).collect(Collectors.toList());
	}

}
