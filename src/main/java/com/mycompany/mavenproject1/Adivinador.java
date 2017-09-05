/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 2109950 y nadie más.
 */
@ManagedBean(name = "beanEstadoAdivinanza")
@SessionScoped

public class Adivinador {
    int numCorrecto;
    int numIntentos;
    int premAcumulado;
    String estadoJuego;
    int a;
    public Adivinador(){
        Random rnd = new Random();
        numCorrecto = (int) (rnd.nextDouble() * 1 + 10);
        numIntentos = 0;
        premAcumulado= 100000;
        estadoJuego = "Su puntaje es de:    ";
        a=0;
    }
    public void reiniciar(){
        Random rnd = new Random();
        numCorrecto = (int) (rnd.nextDouble() * 1 + 10);
        numIntentos = 0;
        premAcumulado= 100000;
    }
    public void adivinar(int nIntento){
        numIntentos+=1;
        if(premAcumulado >0){
            if(this.numCorrecto!=nIntento){
            premAcumulado-=10000;      
            }else{
                premAcumulado+=premAcumulado;
            }
        }else{
            reiniciar();
        }                
    }
    public void setA(int num){
        this.a=num;
    }
    
    public int getA(){
        return a;
    }
    
    public void setNumIntentos(int num){
        this.numIntentos=num;
    }
    
    public int getNumIntentos(){
        return numIntentos;
    }
    
    public void setEstadoJuego(String num){
        this.estadoJuego=num;
    }
    
    public String getEstadoJuego(){
        return estadoJuego;
    }
    
    public void setPremAcumulado(int num){
        this.premAcumulado=num;
    }
    
    public int getPremAcumulado(){
        return premAcumulado;
    }
    
}
