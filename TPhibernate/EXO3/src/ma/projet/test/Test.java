/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import java.util.List;
import ma.projet.classes.Tache;
import ma.projet.service.TacheService;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        TacheService ts = new TacheService();
        ts.create(new Tache("Analyse", new Date(10/02/2013), new Date(20/02/2013), 1500));
        ts.create(new Tache("Conception", new Date(10/03/2013), new Date(15/03/2013),1240));
        ts.create(new Tache("Developpement", new Date(10/04/2013), new Date(25/04/2013),990));
        List<Tache> taches = ts.getTachesPrixSup1000();
        if (taches != null) {
            for (Tache tache : taches) {
                System.out.println("Tâche : " + tache.getNom() + ", Prix : " + tache.getPrix());
            }
        } else {
            System.out.println("Aucune tâche trouvée.");
        }
    }
}


