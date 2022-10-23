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
public class ProduitLegume extends ProduitAgricole {
     
     public ProduitLegume (float quantite, String saison, int id, String libelle, String marque, float prix) {
     super(quantite, saison, id, libelle, marque, prix);
      
}
     
@Override
public boolean estFrais(String saison) {
return this.saison.equals(saison);
    }
}
