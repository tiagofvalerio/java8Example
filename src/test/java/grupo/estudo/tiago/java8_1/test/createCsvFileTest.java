package grupo.estudo.tiago.java8_1.test;

import grupo.estudo.tiago.java8_1.FuncionarioUtils;
import grupo.estudo.tiago.java8_1.Java8Examples;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class createCsvFileTest {

	@Test
	public void test() {

		System.out.println("Criando arquivo csv... ");

		Java8Examples.createCsvFile(FuncionarioUtils.funcionarios);

		System.out.println("Arquivo criado! ");

		File f = new File("/tmp/CsvFile.csv");

		Assert.assertTrue(f.exists());
	}

}
