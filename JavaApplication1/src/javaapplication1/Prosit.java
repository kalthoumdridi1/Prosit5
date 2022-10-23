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
public class Prosit {
    
    
    public static void main(String[] args) {
        
//Creation des deux magasins M1 et M2

Magasin M1 = new Magasin(1, "carrefour", "centre-ville");
Magasin M2 = new Magasin(2, "Monoprix", "menzah 6");

//Employes de M1
Caissier C1 = new Caissier(1, "Ahmed Ben Ahmed", "Tunis", 40,1);
Caissier C2 = new Caissier(2, "Soumaya Ferchichi", "Ben Arous", 32,2);

Vendeur V1= new Vendeur (1, "Mohamed Ahmed", "Tunis", 40,15.0);
Responsable R1= new Responsable (1, "Youssef Ahmed", "Ariana", 20,250.0);

//Employes de M2
Caissier C3 = new Caissier(3, "Zeineb Gabsi", "Sfax", 22, 3);
Vendeur V2 = new Vendeur(2, "Salah Sleh", "Tunis", 20, 20);
Vendeur V3 = new Vendeur(3, "Ameni Jribi", "Tunis", 20, 30);
Vendeur V4 = new Vendeur(4, "Younes", "Ben Younes", 20, 20);
Responsable R2 = new Responsable(2, "Aziz", "Sassi", 40, 240.0);

//Ajout des employées de M1
M1.employe.add(C1);
M1.employe.add(C2);
M1.employe.add(V1);
M1.employe.add(R1);

//Ajout des employées de M2
M2.employes.add(C3);
M2.employes.add(V2);
M2.employes.add(V3);
M2.employes.add(V4);
M2.employes.add(R2);

//Affichage de 3 employés différents
System.out.println(C1.toString());
System.out.println(V1.toString());
System.out.println(R1.toString());

//Création de trois produits
Produit P =new Produit(5, "Biscuits", "Break", 1000);
Produit P1 =new Produit(6, "Lait", "Natilait", 2000);
Produit P2 =new Produit(7, "Savon", "Dove", 600);

//Ajout des produits dans les magasins M1 et M2
M1.produits.ajouterProduit(P);
M2.produits.ajouterProduit(P1);
M2.produits.ajouterProduit(P2);

//Afficher les produits des M1
System.out.println(M1.toString());

//Afficher les employés de M1
M1.afficherEmployes();

//Affichage des salaires de C1, V1 et R1
salaire_caissier(C1);
salaire_vendeur(V1);
salaire_responsable(R1);
    }
    
    
    
