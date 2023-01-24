/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author SHREYA
 */
class Instruments {
    private String name;
    private List<Instruments> inst = new ArrayList<Instruments>();

    public Instruments(String name) {
        this.name = name;
    }
    
    public void add(Instruments i)
    {
        inst.add(i);
    }
    
    public List<Instruments> getInst()
    {
        return inst;
    }
    
    @Override
    public String toString() {
        return "Instruments{" + "Name=" + name + '}';
    }    
}
public class Main
{
    public static void main(String[] args) {
        Instruments instrument = new Instruments("Instruments");
        Instruments western = new Instruments("Western");
        Instruments guitar = new Instruments("Guitar");
        Instruments piano = new Instruments("Piano");
        Instruments classical = new Instruments("Classical");
        Instruments harmonium = new Instruments("Harmonium");
        Instruments tabla = new Instruments("Tabla");
        
        instrument.add(western);
        instrument.add(classical);
        classical.add(tabla);
        classical.add(harmonium);
        western.add(guitar);
        western.add(piano);
        
        System.out.println(instrument);
        for(Instruments gen : instrument.getInst()){
            System.out.println(gen);
            for(Instruments type : gen.getInst()){
                System.out.println(type);
            }
        }

    }
}
