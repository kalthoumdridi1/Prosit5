/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Kal
 */
public class GestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2510, "Yaourt", "vitalait");
        Produit p4 = new Produit(3250, "tomate", "sicam", 1.2f);


      Magasin aziza = new Magasin(1, "ESPRIT ");

        aziza.ajouterProduit(p4);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(new Produit(2, "tomate", "tomate"));

        System.out.println(aziza.toString());

    }

}
