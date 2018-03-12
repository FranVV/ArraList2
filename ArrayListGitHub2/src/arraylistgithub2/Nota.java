/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistgithub2;

/**
 *
 * @author alumno
 */
public class Nota {
   private String modulo;
   private double calificacion;

    public Nota(String modulo) {
         this.modulo = modulo;
        this.calificacion = 0;
    }

    public Nota(String modulo, double calificacion) {
        this.modulo = modulo;
        this.calificacion = calificacion;
    }
   
   

    @Override
    public String toString() {
        return "modulo=" + getModulo() + ", calificacion=" + getCalificacion();
    }

    /**
     * @return the modulo
     */
    public String getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
   
   
}
