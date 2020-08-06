package com.company;

public class Nodo {
    Object valor; //Al ser de tipo object me permite guardar cualquier tipo de dato primitivo, int, String, etc
    Nodo siguiente; //Es el nodo siguiente, que se utilizara más adelante para poderlo enlazar

    public Nodo(Object valor) { //A través del constructor le pasamos el valor que va a contener el nodo
        this.valor = valor;
        this.siguiente = null; //El valor empieza en nulo ya que no hay un siguiente nodo
    }

    public Object obtenerValor() {
        return valor;
    }

    public void enlazarSiguiente(Nodo n) {//Con este metodo nuestro puntero siguiente apuntara al nuevo nodo que se ingrese por parametro

        siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente; //Si retorna nulo significa que no hay un siguiente nodo
        //Si no retornara el valor del siguiente nodo
    }
}
