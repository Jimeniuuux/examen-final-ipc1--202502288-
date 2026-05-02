/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenfinal;

/**
 * @author Jimena
 */
public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        cabeza = null;
        cola = null;
        actual = null;
        tamanio = 0;
    }

    public void agregarCancion(Cancion c) {
        NodoDoble nuevo = new NodoDoble(c);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }

        tamanio++;
    }

    public void mostrarPlaylist() {
        NodoDoble temp = cabeza;

        System.out.println("----- PLAYLIST -----");

        while (temp != null) {
            System.out.println(temp.dato.getTitulo() + " - " + temp.dato.getArtista());
            temp = temp.siguiente;
        }

        System.out.println("--------------------");
    }
    
    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            actual.dato.reproducir();
        } else {
            System.out.println("Ya estas en la ultima cancion");
        }
    }

    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            actual.dato.reproducir();
        } else {
            System.out.println("Ya estas en la primera cancion");
        }
    }

    public void eliminarActual() {

        if (actual == null) return;

        if (cabeza == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        }

        else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        }

        else if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola;
        }
       
        else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
            actual = actual.siguiente;
        }

        tamanio--;
        System.out.println("Cancion eliminada");
    }
    
}