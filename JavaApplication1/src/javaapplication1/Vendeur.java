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
public class Vendeur extends Employe{
private float tauxvente;  

public Vendeur (int id, String nom, String address, int nb_heures) {
super(id,nom,address,nb_heures);
this.tauxvente = tauxvente;
}

@Override
 public String toString() {
 return "Vendeur{" + "id=" + getID() + ", nom=" + getNom() + ", adresse=" + getAddress() + ", nbr_h= " + getNbheures() + " tauxDeVente= " + tauxvente + '}';
    }
 
 public void salaire_vendeur(){
     float pourcentage_taux= (this.tauxvente)/100;
     float somme=450 * pourcentage_taux;
     System.out.println("Salaire Vendeur = "+somme);
        
    }
}


