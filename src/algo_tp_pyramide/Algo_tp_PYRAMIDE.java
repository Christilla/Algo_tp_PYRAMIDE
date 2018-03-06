/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_tp_pyramide;

import java.util.Scanner;

/**
 *
 * @author Christilla
 */
public class Algo_tp_PYRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
// verification du type entier
if(sc.hasNextInt()){
 int hauteur = sc.nextInt();
//traitement pour fabriquer la pyramide
for (int a = 0; a < hauteur; a++) {
for (int b = 0; b < hauteur -a; b++){
    System.out.print(" ");
} for (int c =0; c <= 2*a;c++)
{System.out.print("*");
} System.out.println(" ");
}   
}
}
    }
    
}
