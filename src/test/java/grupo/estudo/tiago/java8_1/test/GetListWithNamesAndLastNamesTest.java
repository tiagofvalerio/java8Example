package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GetListWithNamesAndLastNamesTest {

	@Test
	public void test() {

		List<String> correct = Arrays.asList("Tiago Valerio",
				"Cristiano Andrade", "Ricardo Vanhoz",
				"Funcionario4 Idade repetida", "Funcionario5 Bozinho",
				"Funcionario6 He-Man", "Funcionario7 Sheera",
				"Funcionario8 Dá Radugue Ryu", "Funcionario9 Defende Ken",
				"Funcionario10 Fim");

		List<String> listWithNamesAndLastNames = Java8Examples
				.getListWithNamesAndLastNames(FuncionarioUtils.funcionarios);

		System.out.println("Lista com nomes e sobrenomes: "
				+ Arrays.toString(listWithNamesAndLastNames.toArray()));

		Assert.assertTrue(!listWithNamesAndLastNames.isEmpty()
				&& correct.equals(listWithNamesAndLastNames));
	}

}
