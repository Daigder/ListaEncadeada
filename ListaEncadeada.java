package org.example;

public class ListaEncadeada {
    Node inicio;
    public void inserir(int valor) {
    }
    public void remover(int valor) {
    }
    public static void listar() {
    }
    public void inserirInicio(Node node) {
        if (inicio == null) {
            inicio = node;
        } else {
            node.setProximo(inicio);
            inicio = node;
        }
    }
    public void inserirFim(Node node){
        if(inicio == null){
            inicio = node;
        }else{
            Node aux = inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(node);
        }
    }
    public void inserirNaPosicao(int posicao, Node node){
        if(posicao == 0){
            inserirInicio(node);
        }else if(posicao > getTamanho()){
            inserirFim(node);
        }else{
            Node aux = inicio;
            int posicao_atual = 1;
            while(posicao > posicao_atual){
                aux = aux.getProximo();
                posicao_atual++;
            }
            node.setProximo(aux.getProximo());
            aux.setProximo(node);
        }
    }

    private int getTamanho() {
        int tamanho = 0;
        Node atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }

    public void removerPrimeiro(){
        Node aux = inicio;
        inicio = inicio.getProximo();
        aux = null;
    }
    public void removerUltimo(){
        Node aux = inicio;
        Node ant = null;
        while(aux.getProximo() != null){
            ant = aux;
            aux = aux.getProximo();
        }
        ant.setProximo(null);
    }
}