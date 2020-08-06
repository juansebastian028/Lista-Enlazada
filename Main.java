package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista1 = new ListaEnlazada();
        System.out.println("¿Esta vacia? " + lista1.estaVacia()); //Imprime true, ya que no se ha añadido elementos todavia
        //Cada vez que se añada un nuevo elemento, ese nuevo elemento pasara a ser la cabeza
        lista1.addPrimero("Juan");
        lista1.addPrimero(22);
        lista1.addPrimero("Hola");
        lista1.addPrimero(7);
        /*lista1.eliminarPrimero();*/
        /*lista1.eliminar(2);*/
        System.out.println("Primer elemento: " + lista1.obtener(0)); //Imprime 7
        System.out.println("Ultimo elemento: " + lista1.obtener(lista1.size() - 1)); //Imprime Juan
        System.out.println("Elemento en la posición 2: " + lista1.obtener(2)); //Imprime 22
        System.out.println("¿Esta vacia? " + lista1.estaVacia()); //Imprime false, ya que ya hemos añadido elemetos a la lista
        System.out.println("Tamaño: " + lista1.size());
    }
}
