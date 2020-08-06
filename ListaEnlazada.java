package com.company;

public class ListaEnlazada {
    Nodo cabeza; //La cabeza es el punto de incio(primer nodo), gracias a la cabeza vamos a poder recorrer toda la lista
    int size; //Determinara el tamaño de la lista

    public ListaEnlazada() {
        this.cabeza = null; //Incialmente la cabeza sera null, ya que no se ha añadido nada a la lista todavia
        this.size = 0; //Incialmente valdra 0 ya que la lista esta vacia
    }


    //Con este metodo se agregaran elementos a nuestra cabeza
    public void addPrimero(Object obj) {
        if (cabeza == null) { //Si la cabeza es nula, entoces se creará un nuevo nodo donde le pasaremos el valor de obj
            cabeza = new Nodo(obj);
        } else { //Si no es nula, signifa que el valor que se ingrese, pasara a ser la nueva cabeza
            Nodo temp = cabeza; //Metemos la cabeza en un nodo temporal
            Nodo nuevo = new Nodo(obj); //Creamos un nuevo nodo, que no está enlazado
            nuevo.enlazarSiguiente(temp); //Y el nuevo nodo lo enlazamos a el nodo Temp, que contenia el valor anterior de la otra cabeza
            cabeza = nuevo; //Y ahora le decimos que la cabeza sera nuevo
        }
        size++; //Cada vez que agreguemos un nuevo nodo el tamaño de nuestra lista tendra que aumentar
    }

    public void eliminarPrimero() {
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }

    public int size() {
        return size;
    }

    public Object obtener(int posicion) {
        int cont = 0;
        Nodo temp = cabeza;
        while (cont < posicion) {
            temp = temp.obtenerSiguiente();
            cont++;
        }
        return temp.obtenerValor();
    }

    public void eliminar(int posicion) {
        if (posicion == 0) {
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int cont = 0;
            Nodo temp = cabeza;
            // ->4
            while (cont < posicion - 1) {
                temp = temp.obtenerSiguiente();
                cont++;
            }
            temp.enlazarSiguiente(temp.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }

    //Con este metodo se comprobará si la lista esta vacia o no
    public boolean estaVacia() {
        if (cabeza == null) {
            return true; //Si retorna true, significara que la lista esta vacia
        } else {
            return false; //Si retorna false, significara que la lista NO esta vacia
        }
    }

}
