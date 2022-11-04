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
public class Ponto {
    private double x, y;
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){return x;}
    public double getY(){return y;}
    
    
    @Override
    public String toString(){
        return "Classe: " + this.getClass().getName() + "\n Coordenada X do Ponto: " + getX() + "\n Coordenada Y do Ponto: " + getY();
    }    
    
            
    @Override
    public boolean equals(Object obj) {
        if(obj == null){return false;}
        //if(){return true;}
        //if(this == obj){return true;}
        if(super.equals(obj)) {return true; }
        
        if(this.getClass() == obj.getClass()){
            Ponto o = (Ponto)obj;
            
            if(this.getX() == o.getX() && this.getY() == o.getY()){
                return true; 
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    
}
