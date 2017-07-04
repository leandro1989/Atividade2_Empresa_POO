/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class Data {
    int dia, mes, ano;

	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		}

	public int getDia() {
		return dia;
		}

	public void setDia(int dia) {
		this.dia = dia;
		}

	public int getMes() {
		return mes;
		}

	public void setMes(int mes) {
		this.mes = mes;
		}

	public int getAno() {
		return ano;
		}

	public void setAno(int ano) {
		this.ano = ano;
		}
	
	public String toString(){
		String data;
		data = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
		return data;
		}
}