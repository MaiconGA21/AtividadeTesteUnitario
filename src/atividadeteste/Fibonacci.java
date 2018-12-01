/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeteste;

/**
 *
 * @author Maicon Guimaraes de Almeida RA: 31713843
 */
public class Fibonacci {

    public int DeterminaPosicaoFibonacci(int posicao) {
        
        int F = 0;     // atual
        int ant = 0;   // anterior

        for (int i = 1; i <= posicao; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }
}
