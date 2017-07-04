/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario [] empregados;
    private int quantidadeFuncionario = 0;
    private int indiceFuncionario = 0, contaFuncionario = 0;
    
    /**
     * @param nome Nome da Empresa
     * @param cnpj CNPJ da Empresa
     * @param empregados lista onde seram guardado os funcionarios da empresa
     * @param quantidadeFuncionario quantidade inicial de funcionanrios da empresa
     * @param indiceFuncionario Usado para localizar o funcionario na lista "empregados"
     * @param contaFuncionario conta a quantidade de funcionarios que foram adicionados
     */
    
    //Na classe Empresa, em vez de criar um array de tamanho fixo, 
    //receba como parâmetro no construtor o tamanho do array de Funcionario. Com esse construtor, o que acontece se 
    //tentarmos dar new Empresa() sem passar argumento algum? Porquê? (Responda no comentário da resposta)
    
    Empresa(String nome, String cnpj,int quantidadeFuncionario){
        /**
         * construtor 1
         */
        this.nome = nome;
        this.cnpj = cnpj;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this. empregados = new Funcionario[quantidadeFuncionario];
    }
    
    Empresa(){
    /**
     * Construtor 2: dependendo da necessidade uso o Esse.
     */
    this.nome = null;
    this.cnpj = null;
    this. empregados = new Funcionario[quantidadeFuncionario];
    
    }
    
     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
     /**
     * @return the quantidadeFuncionario
     */
    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    /**
     * @param quantidadeFuncionario the quantidadeFuncionario to set
     */
    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        /**
         * Altera a capacidade de funcionarios na lista empregados
         */
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.empregados = new Funcionario[quantidadeFuncionario];
    }
        
    void adicionaEmpregado(Funcionario empregado){
        /**
         * Adiciona um novo funcionario
         */
        if (this.contaFuncionario < this.getQuantidadeFuncionario()){
            this.empregados[this.indiceFuncionario] = empregado;
            System.out.println("Funcionário "+ empregado.getNome() + " adicionado com sucesso!\n");
            this.indiceFuncionario++;
            this.contaFuncionario++;
        }
        else{
            System.out.println("A quantidade maxima de funcionados informados já foram adicionados! "
                    + "Altere a quantidade de funcionarios(SetQuantidadeFuncionario()) para adicionar um novo funcionario");
        }
    }
    
    Funcionario getFuncionario(int pessoa){
        return this.empregados[pessoa];
    }
    
    void mostraEmpregados(Empresa empresa){
        /**
         * Imprime os dados da empresa e dos funcionarios
         */
        String empresas = "";
        empresas += "Nome da empresa: "+ this.getNome() +"\n";
        empresas += "CNPJ da empresa: "+ this.getCnpj() +"\n";
        System.out.println(empresas);
        for (Funcionario empregado : empregados){
            System.out.println(empregado);
        }
    }
    
    boolean contem(Funcionario f){
        /**
         * Compara o RG do um objeto funcionario como os funcionarios da empresa e retorna true caso 
         * o funcionario passado como paramentro esteja na empresa
         */
        int i;
        for (i = 0; i < this.empregados.length; i++){
             if (this.empregados[i] != null){ // Esse if possibilita que seja informa que a empresa tenha 4 funcionarios e seja informado um numero menor.
                if (this.empregados[i].getRG() == f.getRG()){
                    return true;
                }
            }
        }
        return false;
    }
}
