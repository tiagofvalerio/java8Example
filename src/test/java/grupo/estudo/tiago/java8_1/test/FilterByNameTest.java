package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.Funcionario;
import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FilterByNameTest {

	@Test
	public void test() {
		List<Funcionario> filteredListByName = Java8Examples.filterByName(
				FuncionarioUtils.funcionarios, "Tiago");

		System.out.println("Filtra lista pelo nome [Tiago]: "
				+ Arrays.toString(filteredListByName.toArray()));

		Assert.assertTrue(!filteredListByName.isEmpty());

	}

}
