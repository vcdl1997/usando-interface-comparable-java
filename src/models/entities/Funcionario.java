package models.entities;

public class Funcionario implements Comparable<Funcionario>{
	
	private String name;
	private Double salario;
	
	public Funcionario(String name, Double salario) {
		this.name = name;
		this.salario = salario;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalarioBruto() {
		return this.salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}


	@Override
	public int compareTo(Funcionario o) {
		return this.name.compareTo(o.name);
	}
}
