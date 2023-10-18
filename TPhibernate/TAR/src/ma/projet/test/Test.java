/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;

/**
 *
 * @author DELL
 */
public class Test {
     public static void main(String[] args) {
         FemmeService fs = new FemmeService(); 
         HommeService hs = new HommeService();
         
         fs.create(new Femme("f1","a","1234567890",new Date(2/2/1990)));
            fs.create(new Femme("f2","b","123456789",new Date(2/2/1991)));
            fs.create(new Femme("f3","c","12345678",new Date(2/2/1993)));
            fs.create(new Femme("f4","d","1234567",new Date(6/9/1995)));
            fs.create(new Femme("f5","e","123456",new Date(8/5/1990)));
            fs.create(new Femme("f6","f","12345",new Date(30/8/1989)));
            fs.create(new Femme("f7","g","1234",new Date(15/9/1975)));
            fs.create(new Femme("f8","h","123",new Date(8/8/2000)));
            fs.create(new Femme("f9","i","12",new Date(22/11/1991)));
            fs.create(new Femme("f10","j","120",new Date(31/12/1998)));
            hs.create(new Homme("h1","k","67890",new Date(29/12/1999)));
            hs.create(new Homme("h2","l","56789",new Date(18/7/1991)));
            hs.create(new Homme("h3","m","45678",new Date(22/1/1996)));
            hs.create(new Homme("h4","n","34567",new Date(4/6/1995)));
            hs.create(new Homme("h5","o","23456",new Date(9/6/1980)));
         
         List<Femme> femmes = fs.getAll();
            if (femmes != null) {
                for (Femme femme : femmes) {
                    System.out.println("ID : " + femme.getId());
                    System.out.println("NOM : " + femme.getNom());
                    System.out.println("PRENOM : " + femme.getPrenom());
                    System.out.println("TELEPHONE : " + femme.getTelephone());
                    System.out.println("DATE : " + femme.getDateNaissance());
                    
                    System.out.println("*****");
                }
            } else {
                System.out.println("Aucun femme trouvé.");
            }
            
            
            
            
         
         
         
         
         
         
         
         
         
         
         
         
}
}