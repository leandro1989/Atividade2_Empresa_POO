/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class TestaEmpresa {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario;
		String nome;
                Empresa deltaLTDA;
		
		Funcionario leandro = new Funcionario("Leandro","Operacoes Especiais","operador",
				1000,"1234567",10, 8,2000);
		Funcionario jose = new Funcionario("josé","Operacoes Especiais","armador",
				1000,"1234567",10, 8,2000);
		/*System.out.println(leandro);
                leandro.demitir();
		System.out.println(leandro.calculaGanhoAnual());
		System.out.println(leandro);*/
                jose.demitir();
                
                deltaLTDA = new Empresa("DeltaLTDA", "123456789", 2);
                
                deltaLTDA.adicionaEmpregado(leandro);
                deltaLTDA.adicionaEmpregado(jose);
                deltaLTDA.setQuantidadeFuncionario(2);
                System.out.println(deltaLTDA.getQuantidadeFuncionario());
                System.out.println(deltaLTDA.contem(jose));
                deltaLTDA.adicionaEmpregado(jose);
                System.out.println(deltaLTDA.contem(jose));
                System.out.println(deltaLTDA.contem(leandro));
                System.out.println(deltaLTDA.getFuncionario(1));
	}
}