    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor

 * convertir de date vers chaîne => dateFormat.format(date)
 */
package ma.projet.test;

import java.text.ParseException;
import ma.projet.service.ProduitService;
import java.util.Date;
import java.util.List;
import ma.projet.entity.Produit;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Test {

    public static void main(String[] args){
        
            ProduitService ps = new ProduitService();
    
            ps.create(new Produit("YSL","R1",new Date(),123,"escarpins"));
            ps.create(new Produit("LV","R2",new Date(),231,"sac"));
            ps.create(new Produit("PARFOIS","R3",new Date(),321,"montre"));
            ps.create(new Produit("SEPHORA","R4",new Date(),7,"serum"));
            ps.create(new Produit("ZARA","R5",new Date(),66,"pantalon")); 

         /*  List<Produit> produits = ps.findAll();
            if (produits != null) {
                for (Produit produit : produits) {
                    System.out.println("ID : " + produit.getId());
                    System.out.println("Marque : " + produit.getMarque());
                    System.out.println("Référence : " + produit.getReference());
                    System.out.println("Date : " + produit.getDateAchat());
                    System.out.println("Prix : " + produit.getPrix());
                    System.out.println("Désignation : " + produit.getDesignation());
                    System.out.println("*****");
                }
            } else {
                System.out.println("Aucun produit trouvé.");
            }
            
            
            
            
            Produit produit2 = ps.findById(2);
            if(produit2!=null){
                System.out.println("ID : " + produit2.getId());
                System.out.println("Marque : " + produit2.getMarque());
                System.out.println("Référence : " + produit2.getReference());
                System.out.println("Date : " + produit2.getDateAchat());
                System.out.println("Prix : " + produit2.getPrix());
                System.out.println("Désignation : " + produit2.getDesignation());
                
            }
            else{
                System.out.println("Aucun produit trouvé ");
            }
            
            
            //ps.delete(ps.findById(3));
            
            
            Produit produit6 = ps.findById(6);
            produit6.setPrix(222);
            ps.update(produit6);
            
           
            List<Produit> produitss = ps.findAll();
            if (produitss != null) {
                System.out.println("Les produits dont le prix est supérieur à 100 DH sont : ");
                for (Produit produit : produitss) {
                    if (produit.getPrix()>100){
                        System.out.println("ID : " + produit.getId());
                        System.out.println("Marque : " + produit.getMarque());
                        System.out.println("Prix : " + produit.getPrix());
                        
                    }
                }
            } else {
                System.out.println("Aucun produit trouvé.");
            }
            /*
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //formater les dates
            
            
            System.out.println("Entrez la date de début (yyyy-MM-dd) : ");
            String firstDate = scanner.nextLine();
            System.out.println("Entrez la date de fin (yyyy-MM-dd) : ");
            String secondDate = scanner.nextLine();
            
            try {

            Date startDate = dateFormat.parse(firstDate); //convertir en date
            Date endDate = dateFormat.parse(secondDate);
            
            List<Produit> produitsss = ps.findAll();
            if (produits != null) {
                System.out.println("Les produits commandés entre " + firstDate + " et " + secondDate + " sont : ");
                for (Produit produit : produits) {
                    Date dateAchat = produit.getDateAchat();
                    if (dateAchat != null && (dateAchat.after(startDate) || dateAchat.equals(startDate)) && (dateAchat.before(endDate) || dateAchat.equals(endDate))) {
                        System.out.println("ID : " + produit.getId());
                        System.out.println("Marque : " + produit.getMarque());
                        System.out.println("Référence : " + produit.getReference());
                        System.out.println("Date : " + produit.getDateAchat());
                        System.out.println("Prix : " + produit.getPrix());
                        System.out.println("Désignation : " + produit.getDesignation());
                        System.out.println("***************************");
                    }
                }
            } else {
                System.out.println("Aucun produit trouvé.");
            }
        } catch (ParseException ex) {
                System.out.println("Format de date invalide.");
        }


          */      
    }
    
    
    
    
}
