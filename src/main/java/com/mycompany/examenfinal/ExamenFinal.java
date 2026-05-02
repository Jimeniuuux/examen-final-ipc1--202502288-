/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenfinal;

/**
 *
 * @author pichi
 */
public class ExamenFinal {
    
    public static void main(String[] args) {

        Playlist lista = new Playlist();

        Cancion c1 = new Cancion("La mentira", 180, "Luis Miguel");
        Cancion c2 = new Cancion("La cancion", 210, "Bad Bunny");
        Cancion c3 = new Cancion("Algo contigo", 200, "Los Panchos");

        lista.agregarCancion(c1);
        lista.agregarCancion(c2);
        lista.agregarCancion(c3);

        lista.mostrarPlaylist();

        System.out.println("---- SIGUIENTE ----");
        lista.siguiente();

        System.out.println("---- ANTERIOR ----");
        lista.anterior();

        System.out.println("---- ELIMINAR ACTUAL ----");
        lista.eliminarActual();

        lista.mostrarPlaylist();
    }
}

