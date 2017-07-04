/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class Funcionario {

	private String nome;
	private String departamento;
	private String cargo;
	private double salario = 0;
	private String promocao;
	private String RG;
	private Data dataEntrada;
	private boolean estaNaEmpresa;
        private int identificador = 0;
        
        /**
         * 
         * @param nome Nome do funcionario
         * @param departamento onde trabalha o funcionario
         * @param cargo função exercida
         * @param salario rendimento
         * @param RG identidade
         * @param dia nascimento do funcionario
         * @param mes nascimento do funcionario
         * @param ano nascimento do funcionario
         * @param identificador identifaca cada funcionario na ordem que foi criado 1, 2, 3...
         */
	
	Funcionario(String nome,String departamento, String cargo,
			double salario,String RG, int dia, int mes, int ano){
            
		this.nome = nome;
		this.departamento = departamento;
		this.cargo = cargo;
		this.salario = salario;
		this.RG = RG;
		this.dataEntrada = new Data(dia,mes,ano);
		this.estaNaEmpresa = true;
                this.identificador += 1;
	}

        Funcionario() {
                this.nome = null;
		this.departamento = null;
		this.cargo = null;
		this.salario = 0;
		this.RG = null;
		this.dataEntrada = new Data(0,0,0);
		this.estaNaEmpresa = true;
                this.identificador += 1;
        }
        
        public String getNome() {
            return nome;
        }
        
        /**
        * @return the departamento
        */
        public String getDepartamento() {
           return departamento;
        }
	
	public double getSalario() {
		return salario;
	}
	
	public String getRG() {
		return RG;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setPromocao(String promocao){
		this.cargo = promocao;
	}
	
	public void aumentaSalario(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual() {
		return getSalario()*12;
	}
        
        /**
        * @return the dataEntrada
        */
        public Data getDataEntrada() {
           return dataEntrada;
        }
	
	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}
        
        /**
        * @return the indentificador
        */
       public int getIdentificador() {
           return identificador;
       }
	
	public void demitir(){
		this.estaNaEmpresa = false;
	}
	
	public String status(){
		if (this.getEstaNaEmpresa()){
			return "Admitido.";
		}
		else{
			return "Demitido.";
		}
	}
        
	public void mostra(){
		System.out.println("Nome: " + this.getNome() + "\n");
		System.out.println("Departamento: " + this.getDepartamento() +"\n");
		System.out.println("Cargo: " + this.getCargo() +"\n");
		System.out.println("Salario: " + this.getSalario() +"\n");
		System.out.println("RG: " + this.getRG() +"\n");
		System.out.println("Data da Entrada " + this.getDataEntrada().getDia()+"/" + this.getDataEntrada().getMes() +"/"+ this.getDataEntrada().getAno() +"\n");
		System.out.println("Status do Funcionário: " + this.status() +"\n");
		}
	
	public String toString(){
		String Funcionario = "";
		Funcionario += "Nome: " + this.getNome() + "\n";
		Funcionario += "Departamento: " + this.getDepartamento() +"\n";
		Funcionario += "Cargo: " + this.getCargo() +"\n";
		Funcionario += "Salario: " + this.getSalario() +"\n";
		Funcionario += "RG: " + this.getRG() +"\n";
		Funcionario += "Data da Entrada " + this.getDataEntrada() +"\n";
		Funcionario += "Status do Funcionário: " + this.status() +"\n";
		
		return Funcionario;
		}	
}