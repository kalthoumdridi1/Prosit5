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
public abstract class ProduitAgricole extends Produit implements Critere {
       float quantite;
       String saison;

public ProduitAgricole(int quantite, String saison, int id, String libelle, String marque, float prix) {
        super(id, libelle, marque, prix);
        this.quantite = quantite;
        this.saison = saison; 
}

}