package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GetListOnlyWithNamesTest {

	@Test
	public void test() {

		List<String> correct = Arrays.asList("Tiago", "Cristiano", "Ricardo",
				"Funcionario4", "Funcionario5", "Funcionario6", "Funcionario7",
				"Funcionario8", "Funcionario9", "Funcionario10");

		// FuncionarioUtils.funcionarios.stream().map(Funcionario::getNome)
		// .forEach(correct::add);

		List<String> listOnlyWithNames = Java8Examples
				.getListOnlyWithNames(FuncionarioUtils.funcionarios);

		System.out.println("Lista somente com nomes: "
				+ Arrays.toString(listOnlyWithNames.toArray()));

		Assert.assertTrue(!listOnlyWithNames.isEmpty()
				&& correct.equals(listOnlyWithNames));
	}

}
