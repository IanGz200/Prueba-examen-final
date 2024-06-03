/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.util.ArrayList;

/**
 * -Comenta la clase-
 * @author IanGz
 */
public class Test {

    private int numero;
    
    private String titulo;
    
    private ArrayList<TestQuestion> preguntas;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<TestQuestion> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<TestQuestion> preguntas) {
        this.preguntas = preguntas;
    }

    public Test(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
        this.preguntas =  new ArrayList<>();
    }
    
    
    
}
