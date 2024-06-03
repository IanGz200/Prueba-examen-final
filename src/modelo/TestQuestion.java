/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * -Comenta la clase-
 *
 * @author IanGz
 */
public class TestQuestion {

    private String textoPregunta;

    private Answer respostas[];

    /**
     * Constante que define el numero de respostas
     */
    public static final int NRESPOSTAS = 4;

    /**
     * getter de textoPregunta
     *
     * @return
     */
    public String getTextoPregunta() {
        return textoPregunta;
    }

    /**
     * setter de textoPregunta
     *
     * @param textoPregunta
     */
    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    /**
     * getter de respostas
     *
     * @return
     */
    public Answer[] getRespostas() {
        return respostas;
    }

    /**
     * setter de respostas
     *
     * @param respostas
     */
    public void setRespostas(Answer[] respostas) {
        this.respostas = respostas;
    }

    /**
     * Constructor da clase
     *
     * @param textoPregunta
     */
    public TestQuestion(String textoPregunta) {
        this.textoPregunta = textoPregunta;
        this.respostas = new Answer[NRESPOSTAS];
    }

}
