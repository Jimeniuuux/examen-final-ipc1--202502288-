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

        Cancion c1 = new Cancion("La mentira", 200, " Luis Miguel");
        Cancion c2 = new Cancion("La canción", 180, " Bad Bunny");
        Cancion c3 = new Cancion("Algo contigo", 210, " Los panchos");

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
    }
}
