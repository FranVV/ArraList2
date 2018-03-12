/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistgithub2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
   private String nombre;
   private ArrayList<Nota> vNotas;

    public Alumno(String nombre, ArrayList<Nota> vNotas) {
        this.nombre = nombre;
        this.vNotas = vNotas;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.vNotas = new ArrayList<>();
    }
    /**
     * Obtener la calificación de un módulo()
     * @param modulo no devuelve nada 
     */
    public  double calificacionmMdulo(String modulo) {
        double nota=0;
    for (int i = 0; i < vNotas.size(); i++) {
            if (vNotas.get(i).getModulo().equalsIgnoreCase(nombre)) {
                nota=vNotas.get(i).getCalificacion();
            }
        }    
    return nota;
    }
    /**
     * comprovacion cual el double mas alto de un ArrayListe
     * @return devuelve un entero con la nota mas alta
     */
    //Nota obtenerMejorNota()
    public double mejorNota() {
       double nota=0;
        for (int i = 0; i < vNotas.size(); i++) {
          if (nota < vNotas.get(i).getCalificacion()){
              nota=vNotas.get(i).getCalificacion();
          } 
        }
       
        return nota;
    }
    /**
     * poner aun modulo una nota
     * @param modulo recive un String y devuelve true o false 
     */
    public boolean ponerNotaModulo(String nombre ) {
        int n=0;
        double a=0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vNotas.size(); i++) {
            if (vNotas.get(i).getModulo().equalsIgnoreCase(nombre)) {
                System.out.println("Dime la nota del modulo");
                a= leer.nextDouble();
                vNotas.get(i).setCalificacion(a);
                return true;
            }
        }
        return false; 
        }
    /**
     * 
     * @return fasle->el mudulo no existe
     * true-> realuza el metodo y le añada la nota
     */
    @Override
    public String toString() {
        return "nombre=" + getNombre() + ", vNotas=" + getvNotas();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vNotas
     */
    public ArrayList<Nota> getvNotas() {
        return vNotas;
    }

    /**
     * @param vNotas the vNotas to set
     */
    public void setvNotas(ArrayList<Nota> vNotas) {
        this.vNotas = vNotas;
    }
   
}
