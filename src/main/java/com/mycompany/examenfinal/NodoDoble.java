/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfinal;

/**
 * @author Jimena
 */
public class NodoDoble {

    public Cancion dato;
    public NodoDoble anterior;
    public NodoDoble siguiente;

    public NodoDoble(Cancion dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}