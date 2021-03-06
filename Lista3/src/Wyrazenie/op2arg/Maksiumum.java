package Wyrazenie.op2arg;

import Wyrazenie.Wyrazenie;

/**
 * Klasa Maksimum reprezentuje wyrazenie maksymalne z  dwoch  wyrazen
 * @author Kamil
 * 
 */
public class Maksiumum extends Operator2Arg{
     /**
     * Oblicza wyrazenie dla podanej klasy
     * @return Wynik wyrazenia
     */
    @Override
    public double oblicz(){
        
        return Math.max(x.oblicz(),y.oblicz());
    }
    
    public Maksiumum (Wyrazenie x,Wyrazenie y){
        super(x,y);
    };
    /**
     * 
     * @return Reprezentacja wyrazenia 
     */    
    @Override
    public String toString() {
        return "max("+x+" ,"+y+")";
    }
}
