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
public class Grupo {

    private ArrayList<Alumno> vAlumno;

    /**
     *
     */
    public Grupo() {
        this.vAlumno = new ArrayList<>();
    }

    //Decir si un alumno está matriculado en ese grupo
    /**
     * Decir si un alumno está matriculado en ese grupo
     * @param alumno
     * @return true si esta el alumno y false si no esta
     */
    public boolean alumnomatriculado(String alumno) {
        for (int i = 0; i < vAlumno.size(); i++) {
            if (vAlumno.get(i).getNombre().equalsIgnoreCase(alumno)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtener la mejor nota de los alumnos de la clase: Nota obtenerMejorNota()
     *
     * @return 
     */
    public double mejorNota() {
        double contador = 0;
        for (int i = 0; i < vAlumno.size(); i++) {
            if (vAlumno.get(i).getvNotas().get(i).getCalificacion() > contador) {
                contador = vAlumno.get(i).getvNotas().get(i).getCalificacion();
            }
        }
        return contador;

    }

    /**
     *
     * @return int de la mejor nota
     */
    /**
     * Calcular el número de suspensos que ha habido en ese grupo
     *
     * @return 
     */
    public int numSuspensos() {
        int contador = 0;
        for (int i = 0; i < vAlumno.size(); i++) {
            if (vAlumno.get(i).getvNotas().get(i).getCalificacion() < 5) {
                contador++;
            }
        }
        return contador;

    }

    /**
     * @return int con el total de suspoensos
     */
    /**
     * borrar todo
     */
    public void borrarTodo() {
        vAlumno.clear();

    }

    /**
     * Borrar a un alumno del grupo
     *
     * @param alumno le paso el nombre
     * @return 
     */
    public boolean borrarAlumno(String alumno) {
        int a = vAlumno.indexOf(alumno);
        if (a != 0) {
            vAlumno.remove(a);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Poner la nota a un alumno en un módulo determinado
     *
     * @param nombreAlumno
     * @param nombreModulo le paso el modulo al quepertenece el amluno
     */
    public void ponerNotaAlumno(String nombreAlumno, String nombreModulo) {

        for (int i = 0; i < vAlumno.size(); i++) {
            if (vAlumno.get(i).getNombre().equalsIgnoreCase(nombreAlumno)) {
                vAlumno.get(i).ponerNotaModulo(nombreModulo);
            }
        }
    }

    /**
     * matrucular aun alumno a un modulo
     *
     * @param nomAlum le paso el nombre del alumno
     * @param nomModulos le paso un vector de strin de modulos
     * @return 
     */
    public boolean matricularAlunoaunModulo(String nomAlum, String[] nomModulos) {
        ArrayList<Nota> a = null;
        for (int i = 0; i < nomModulos.length; i++) {
            a.add(new Nota(nomModulos[i]));
        }

        Alumno nuevo = new Alumno(nomAlum, a);

        if (vAlumno.add(nuevo)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @return true si se a añadido correctamente false no se a podido añadir
     */
    @Override
    public String toString() {
        return "Grupo{" + "vAlumno=" + getvAlumno() + '}';
    }

    /**
     * @return the vAlumno
     */
    public ArrayList<Alumno> getvAlumno() {
        return vAlumno;
    }

    /**
     * @param vAlumno the vAlumno to set
     */
    public void setvAlumno(ArrayList<Alumno> vAlumno) {
        this.vAlumno = vAlumno;
    }

}
