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
public class Answer {

    private String texto;
    private boolean estadoResposta;

    /**
     * getter de texto
     * 
     * @return o texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * setter de texto
     * 
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * getter de estadoResposta
     * 
     * @return se é correcta ou non
     */
    public boolean isEstadoResposta() {
        return estadoResposta;
    }

    /**
     * setter de estadoResposta
     * 
     * @param estadoResposta
     */
    public void setEstadoResposta(boolean estadoResposta) {
        this.estadoResposta = estadoResposta;
    }

    /**
     * Constructor de clase
     * 
     * @param texto
     * @param estadoResposta
     */
    public Answer(String texto, boolean estadoResposta) {
        this.texto = texto;
        this.estadoResposta = estadoResposta;
    }

}
