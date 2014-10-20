package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.Funcionario;
import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SortByAgeAndNameTest {

	@Test
	public void test() {

		List<Funcionario> sortedListByAgeAndName = Java8Examples
				.sortByAgeAndName(FuncionarioUtils.funcionarios);

		System.out.println("Lista ordenada por idade e nome em seguida: "
				+ Arrays.toString(sortedListByAgeAndName.toArray()));

		Assert.assertTrue(!sortedListByAgeAndName.isEmpty());

	}

}
