package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GetNumberOfCaractersTest {

	@Test
	public void test() {

		List<Integer> correct = Arrays.asList(12, 16, 13, 26, 19, 18, 18, 26,
				23, 16);

		List<Integer> numberOfCaracters = Java8Examples
				.getNumberOfCaracters(FuncionarioUtils.funcionarios);

		System.out
				.println("Número de caracteres de (nome + sobrenome) de cada funcionário : "
						+ numberOfCaracters);

		Assert.assertTrue(!numberOfCaracters.isEmpty()
				&& correct.equals(numberOfCaracters));
	}

}
