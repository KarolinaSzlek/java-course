package Wyrazenie.op2arg;

import Wyrazenie.Wyrazenie;

/**
 * Klasa Dodawanie reprezentuje wyrazenie dodawania dwoch  wyrazen
 * @author Kamil
 * 
 */
public class Dodawanie extends Operator2Arg{
    /**
     * Oblicza wyrazenie dla podanej klasy
     * @return Wynik wyrazenia
     */
   @Override
   public double oblicz(){
        return x.oblicz()+y.oblicz();
    }
    
    public Dodawanie (Wyrazenie x,Wyrazenie y){
        super(x,y);
    };
     /**
     * 
     * @return Reprezentacja wyrazenia 
     */       
   @Override
    public String toString() {
        return "("+x+"+"+y+")";
    }   
}
