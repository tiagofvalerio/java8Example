package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

public class SumOfWeightsTest {

	@Test
	public void test() {
		Optional<Double> sumOfWeight = Java8Examples
				.sumOfWeight(FuncionarioUtils.funcionarios);

		System.out.println("Soma dos pesos : " + sumOfWeight.get());

		Assert.assertTrue(sumOfWeight.get() > 0D);
	}

}
