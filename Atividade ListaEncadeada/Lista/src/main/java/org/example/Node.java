package org.example;

public class Node {
    private int valor;
    private Node proximo;


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Node(int valor, Node _proximo) {
        this.valor = valor;
        this.proximo = _proximo;
    }

    public Node(){
    }

}