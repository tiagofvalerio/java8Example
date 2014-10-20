package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import org.junit.Assert;
import org.junit.Test;

public class GetListOlderThen25Test {

	@Test
	public void test() {
		Long numberFuncionariosOlderThen25 = Java8Examples
				.getListOlderThen25(FuncionarioUtils.funcionarios);

		System.out
				.println("Quantidade de funcionários com idade maior que 25 : "
						+ numberFuncionariosOlderThen25);

		Assert.assertTrue(numberFuncionariosOlderThen25 > 0L);
	}

}
