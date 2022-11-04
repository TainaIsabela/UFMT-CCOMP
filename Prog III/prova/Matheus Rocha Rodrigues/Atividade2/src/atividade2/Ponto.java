/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author Aluno-labB27
 */
public final class Ponto {
    private double x, y;
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }
    
    public double getX(){return x;}
    public double getY(){return y;}
    
    public Ponto transladar(double distX, double distY){
        Ponto p = new Ponto (getX() + distX , getY() + distY);
        return p;
    }
    
    public Ponto escalar(double scale){
        Ponto p = new Ponto (getX() * scale , getY() * scale);
        return p;
    }
}
