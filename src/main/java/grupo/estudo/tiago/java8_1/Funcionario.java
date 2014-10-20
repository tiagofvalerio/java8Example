package grupo.estudo.tiago.java8_1;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private Integer idade;
	private Double peso;
	private Double altura;

	public Funcionario() {

	}

	public Funcionario(String nome, String sobrenome, Integer idade,
			Double peso, Double altura) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return nome + "," + sobrenome + "," + idade + "," + peso + "," + altura;
	}
}
