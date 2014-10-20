package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.Funcionario;
import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GetWeightsMinorThen80Test {

	@Test
	public void test() {
		List<Funcionario> weightMinorThen80List = Java8Examples
				.getWeightsMinorThen80(FuncionarioUtils.funcionarios);

		System.out.println("Lista com pesos menores que 80: "
				+ Arrays.toString(weightMinorThen80List.toArray()));

		Assert.assertTrue(!weightMinorThen80List.isEmpty()
				&& weightMinorThen80List.size() == 7);
	}

}
