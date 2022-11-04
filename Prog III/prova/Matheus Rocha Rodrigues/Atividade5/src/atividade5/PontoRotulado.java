/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

/**
 *
 * @author Aluno-labB27
 */
public class PontoRotulado extends Ponto {
    private String rotulo;
    
    public PontoRotulado(String rotulo, double x, double y){
        super(x, y);
        this.rotulo = rotulo;
    }
    
    public String getRotulo(){
        return rotulo;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "\n Rotulo: " + getRotulo();
    }
}
