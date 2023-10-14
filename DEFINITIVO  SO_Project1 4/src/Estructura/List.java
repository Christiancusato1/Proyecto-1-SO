/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura;

/**
 *
 * @author giovannacianfaglione
 */
public class List<T> {
    // HACER EJERCICIO DE ES PALINDROMO!!!!

    private Node pFirst;
    private Node pLast;
    private int size;

    public List() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public int vaciarLista(){
        int ret = this.size; 
        this.pLast = null; 
        this.pFirst = null;
        return ret; 
    }

    public void appendLast(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            pFirst = node;
            pLast = node;
           
        } else {
            Node aux = pLast;
            pLast = node;
            aux.setpNext(node);
            
        } size++;

    }

    public void appendStart(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            pFirst = node;
            pLast = node;
        } else {
            Node aux = pFirst;
            pFirst = node;
            node.setpNext(aux);
        }
        size++;
    }
    
    public void appendIn(int i, T data){
        Node node = new Node(data); 
        if (this.isEmpty() || i ==0) {
            this.appendStart(data);
            System.out.println("La lista está vacía, sin embargo se agregó el nodo");  
        }else if(i > this.size || i == this.size){
            this.appendLast(data);
            System.out.println("El indice que coloco no existe, sin embargo, se agrego el dato al final de la lista");
        }else{
            int counter = 0; 
            Node prev = this.pFirst; 
            while(counter+1 != i){
                prev = prev.getpNext(); 
                counter ++; 
            } // prev será el nodo que estará a la izquierda 
            Node next = prev.getpNext(); // es el nodo que está a la derecha
            prev.setpNext(node);
            node.setpNext(next);
            this.size ++; 
        }
    }
    
    public void appendInOrder(T data){ 
        // vamos a meter en la lista de forma ordenada (forma creciente)
        if (this.isEmpty() || (int) this.pFirst.getData() >= (int) data ) {
            this.appendStart( data);
        }else if((int) this.getpLast().getData() <=(int) data){
            this.appendLast( data);
        }else{
            Node aux = this.pFirst; 
            int contador = 0; 
            boolean found = false;
            while(!found && aux != null){
                if ((int)aux.getData() >= (int) data) {
                    found = true; 
                }aux = aux.getpNext(); 
                contador ++; 
            }this.appendIn(contador-1, data);
        }
    }

    public void print() {
        String list = "";
        if (isEmpty()) {
            System.out.println("//");
        } else {
            Node aux = pFirst;
            while (aux != null) {
                list += aux.getData() + "->";
                aux = aux.getpNext();
            }
            list += "//";
            System.out.println(list);
        }
    }

    public T deleteStart() {
        T data = (T) pFirst.getData(); 
        if (isEmpty()) {
            System.out.println("La lista está vacia");
        } else if (size == 1) {
            pFirst = null;
            pLast = null;
            System.out.println("Se eliminó con exito el primer nodo");
        } else {
            Node aux = pFirst;
            pFirst = aux.getpNext();
            System.out.println("Se eliminó con exito el primer nodo");
        }
        size--;
        return data; 
    }

    public T deleteEnd() {
        T data = (T) pLast.getData(); 
        if (isEmpty()) {
            System.out.println("La lista está vacía");
        } else if (size == 1) { 
            pFirst = null;
            pLast = null;
        } else {
            Node aux = pFirst;
            while (aux.getpNext().getpNext() != null) {
                aux = aux.getpNext();
            }
            aux.setpNext(null);
            pLast = aux;
        }
        size--;
        return data; 
    }

    public boolean itExists(T data) {
        if (isEmpty()) {
            return false;
        } else if (pFirst.getData() == data || pLast.getData() == data) {
            return true;
        } else {
            Node aux = pFirst.getpNext();
            while (aux != pLast) {
                if (aux.getData() == data) {
                    return true;
                } else {
                    aux = aux.getpNext();
                }
            }
        }
        return false;
    }

    public void delete(T data) { // elimina y retorna lo que se eliminó
        T ret = null; 
        if (pFirst.getData() == data) {
            deleteStart();
            
        } else if (pLast.getData() == data) {
            deleteEnd();
        } else {
            if (isEmpty()) {
                System.out.println("La lista está vacía");
            } else {
                if (itExists(data)) {
                    Node aux = pFirst;
                    while (aux.getpNext().getData() != data && aux != pLast) {
                        aux = aux.getpNext();
                    }
                    Node aux2 = aux.getpNext().getpNext();
                    aux.setpNext(aux2);
                    size--;

                } else {
                    System.out.println("No existe ese nodo en la lista");
                }
            }
        }
    }

    public void deleteIn(int i) {
        if (i > size - 1) {
            System.out.println("Index out of bound");
        } else {
            if (i == 0) {
                this.deleteStart();
            } else if (i == size - 1) {
                this.deleteEnd();
            } else {
                int contador = 0;
                Node aux = pFirst;
                while (i < contador) {
                    contador++;
                    aux = aux.getpNext();
                }
                Node aux2 = aux.getpNext().getpNext();
                aux.setpNext(aux2);
            }
            System.out.println("Se elimino con exito el nodo");
            size--;
        }
    }

    public int getIndex(T data) {// retorna el indice (el primer nodo tiene indice 0)si no se encuentra el indice es 0
        if (itExists(data)) {
            if (pFirst.getData() == data) {
                return 0;
            } else if (pLast.getData() == data) {
                return size - 1;

            } else {
                Node aux = pFirst;
                int contador = 0;
                while (aux != null) {
                    if (aux.getData() == data) {
                        return contador;
                    } else {
                        aux = aux.getpNext();
                        contador++;
                    }
                }

            }

        }
        return -1;
    }

    public List makeCopy() { // te retorna una copia de la lista 
        List copy = new List();
        if (this.isEmpty()) {
            return copy;
        } else {
            Node aux = this.pFirst;
            while (aux != null) {
                copy.appendLast(aux.getData());
                aux = aux.getpNext();
            }
            return copy;
        }
    }

    public List makeCopyReverse() {
        List copy = new List();
        if (this.isEmpty()) {
            return copy;
        } else {
            Node aux = this.pFirst;
            while (aux != null) {
                copy.appendStart(aux.getData());
                aux = aux.getpNext(); 
            }
            return copy;
        }
    }
    
    


    /**
     * @return the pFirst
     */
    public Node getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Node getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Node pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
