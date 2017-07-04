/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class PessoaFisica {
    
    private String cpf;
    private String nome;
    
    PessoaFisica(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    boolean validaCPF(String cpf){
        int i, cont = 0;
        for(i = 0; i < cpf.length() ; i++){
            cont += 1;
        }
        
        if (cont == 11){ // 11 é o numero de digitos do cpf atualmente.
            return true;
        }
        else{
            return false;
        }
    }
}
