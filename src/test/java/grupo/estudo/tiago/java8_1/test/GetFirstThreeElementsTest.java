package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.Funcionario;
import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GetFirstThreeElementsTest {

	@Test
	public void test() {
		List<Funcionario> firstThree = Java8Examples
				.getFirstThreeElements(FuncionarioUtils.funcionarios);

		System.out.println("Lista com os três primeiros elementos: "
				+ Arrays.toString(firstThree.toArray()));

		Assert.assertTrue(!firstThree.isEmpty() && firstThree.size() == 3);
	}

}
