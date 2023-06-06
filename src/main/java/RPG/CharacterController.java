/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG;

import static Testes.Testes.em;
import java.util.List;
import RPG.Bervein;
import RPG.Ficha;
import javax.persistence.Entity;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.codehaus.mojo.exec.ExecMojo;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Transaction;
/**
 *
 * @author leonardo.godoy
 */
public class CharacterController {
    


    public  EntityManagerFactory emf = Persistence.createEntityManagerFactory("RPG-PU");
    public  EntityManager em = emf.createEntityManager();

    public void create(){
           
           
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
       
       
       em.getTransaction().begin();
       em.persist(f);
       
       em.getTransaction().commit();
   }
    
    public void update(){
           
        Ficha lv = em.createNamedQuery("characterLevel", Ficha.class)
        .setParameter("level", "Shiro")          
        .getSingleResult();
        lv.setXP(2);
     
        em.getTransaction().begin();
        em.merge(lv);
        em.getTransaction().commit();
        
       
    System.out.println("Parabéns, você upou de nível, seu nível atual é:" + lv.getXP());   

       }
         
    public void printCharacters(){
    
        List<Ficha> var = em.createNamedQuery("characterName", Ficha.class)
       //.setParameter("uniqueAdvantage", "Elfo")
       .getResultList();
       
       
        for(Ficha personagem: var){
            System.out.println("Você está vendo a ficha de: " + personagem.getName());  
        }
    }
}