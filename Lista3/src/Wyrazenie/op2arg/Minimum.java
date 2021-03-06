package Wyrazenie.op2arg;

import Wyrazenie.Wyrazenie;

/**
 * Klasa Minimum reprezentuje minimalna wartosc w dwoch wyrazen
 * @author Kamil
 * 
 */
public class Minimum extends Operator2Arg {
    /**
     * Oblicza wyrazenie dla podanej klasy
     * @return Wynik wyrazenia
     */
    @Override
    public double oblicz(){
        return Math.min(x.oblicz(),y.oblicz());
    }
    
    public Minimum (Wyrazenie x,Wyrazenie y){
        super(x,y);
    };
    
     /**
     * 
     * @return Reprezentacja wyrazenia 
     */   
    @Override
    public String toString() {
        return "min("+x+" , "+y+")";
    }
}
