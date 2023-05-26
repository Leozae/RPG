/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testes;

import RPG.Bervein;
import RPG.Ficha;
import javax.persistence.Entity;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.codehaus.mojo.exec.ExecMojo;


/**
 *
 * @author leonardo.godoy
 */
public class Testes {
    
    public static void main(String[] args) {
       
       Ficha f = new Ficha();
       f.setName("Shiro"); 
       f.setAge(21);
       f.setRange(1.80);
       f.setColor("Branco");
       f.setUniqueAdvantage("Elfo");
       f.setKits("Ranger");
       f.setRegion("Montanhas Sanguinárias, as Terras Bárbaras");
       f.setDivinity("Glórienn");
       f.setFunct("Arqueiro");
       f.setPoints(8);
       f.setStrenght(0);
       f.setPdf(3);
       f.setResistence(2);
       f.setArmor(1);
       f.setHability(3);
       f.setPV(10);
       f.setPM(10);
       f.setXP(8);
       
       
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("RPG-PU");
       EntityManager em = emf.createEntityManager();
       
       em.getTransaction().begin();
       em.persist(f);
       em.getTransaction().commit();
       
       em.close();
       emf.close();
       
       
       
    }
    
}
