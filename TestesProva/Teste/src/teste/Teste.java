/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author PICHAU
 */
public class Teste {

    public Object[] pilha;
    public int posicaoPilha;

    public Teste() {
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }
    
    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static int decimalParaBinario(int n){
        if(n > 0){
            decimalParaBinario(n/2);
            System.out.print(n % 2);
        }
        return n;
    }

    public static void main(String args[]) {
        Teste p = new Teste();
        int valor1 = 10;
        int valor2 = 15;
        int valor3 = 20;

        p.empilhar(decimalParaBinario(valor1));
        System.out.println();
        p.empilhar(decimalParaBinario(valor2));
        System.out.println();
        p.empilhar(decimalParaBinario(valor3));
        System.out.println();
        
                while (p.pilhaVazia() == false) {
             System.out.println(p.desempilhar());
        }
    }
}