package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		try (
			BufferedReader br = new BufferedReader(
				new InputStreamReader(
					new FileInputStream("C:\\temp\\nomes-pessoas.csv"), "UTF-8"
				)
			);
		){
			
			List<Funcionario> funcionarios = new ArrayList<>();
			String linha = br.readLine();
			
			while(linha != null) {
				String[] colunas = linha.split(",");
				String nome = colunas[0];
				double salario = Double.valueOf(colunas[1]);
				funcionarios.add(new Funcionario(nome, salario));
				linha = br.readLine();
			}
			
			Collections.sort(funcionarios);
			
			System.out.println("Funcionarios:");
			for(Funcionario funcionario : funcionarios) {
				System.out.println("Nome: " + funcionario.getName());
				System.out.println("Salário: R$ " + String.format("%.2f", funcionario.getSalarioBruto()) + "\n");
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
