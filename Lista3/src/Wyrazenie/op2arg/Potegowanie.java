package Wyrazenie.op2arg;

import Wyrazenie.Wyrazenie;

/**
 * Klasa Potegowanie reprezentuje wyrazenie potegowania wyrazenia
 * @author Kamil
 * 
 */
public class Potegowanie extends Operator2Arg{
    /**
     * Oblicza wyrazenie dla podanej klasy
     * @return Wynik wyrazenia
     */ 
    @Override
    public double oblicz(){
        return Math.pow(x.oblicz(),y.oblicz());
    }
    
    public Potegowanie (Wyrazenie x,Wyrazenie y){
        super(x,y);
    };
     /**
     * 
     * @return Reprezentacja wyrazenia 
     */       
    @Override
    public String toString() {
        return "("+x+" ^ "+y+")";
    }
}
