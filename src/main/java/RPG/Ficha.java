package RPG;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

/**
 *
 * @author leonardo.godoy
*/
@Entity
@Table(name = "Ficha")
@NamedQueries({
@NamedQuery(name = "characterName",
query = "SELECT f FROM Ficha f"),
@NamedQuery(name = "characterLevel",
query = "SELECT f FROM Ficha f WHERE name = :level")
})
        

public class Ficha implements Serializable {
    // Personagem
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "rangeActivity")
    private double range;
    @Column(name = "color")
    private String color;
    //Classe
    @Column(name = "kits")
    private String kits;
    @Column(name = "region")
    private String region;
    @Column(name = "divinity")
    private String divinity;
    @Column(name = "funct")
    private String funct;
    @Column(name = "points")
    private int points;
    @Column(name = "uniqueAdvantage")
    private String uniqueAdvantage;
    //Ações
    @Transient
    private int iniciative = 0;
    @Transient
    private int moviment = 0;
    @Transient
    private int weight =  0;
    @Transient
    private int maxWeight = 100;
    //Caracteristicas
    @Column(name = "strenght")
    private int strenght = 0;
    @Column(name = "hability")
    private int hability = 0;
    @Column(name = "resistence")
    private int resistence = 0;
    @Column(name = "armor")
    private int armor = 0;
    @Column(name = "pdf")
    private int pdf = 0;
    // Atributos não distribuiveis
    @Transient
    private int PV = 1;
    @Transient
    private int PM = 1;
    @Column(name = "XP")
    private int XP = 1;
    @Transient
    private int MaxPV;
    @Transient
    private int MaxPM;
  
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
      return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setRange(double range){
        this.range = range;
    }
    
    public double getRange(){
        return range;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
   public String getColor(){
       return color;
   }
   
   public void setKits(String kits){
        this.kits = kits;
   }
    
    public String getKits(){
      return kits;
    }
    
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public void setDivinity(String divinity){
        this.divinity = divinity;
    }
    
    public String getDivinity(){
        return divinity;
    }
    
    public void setFunct(String funct){
        this.funct = funct;
    }
    
    public String getFunct(){
        return funct;
    }
    
    public void setPoints(int points){
        this.points = points;
    }
    
   public int getPoints(){
       return points;
   }
   
   public void setUniqueAdvantage(String uniqueAdvantage){
        this.uniqueAdvantage = uniqueAdvantage;
    }
    
    public String getUniqueAdvantage(){
      return uniqueAdvantage;
    }
    
    public void setIniciative(int iniciative){
        this.iniciative = iniciative;
    }
    
    public int getIniciative(){
        return iniciative;
    }
    
    public void setMoviment(int moviment){
        this.moviment = moviment;
    }
    
    public int getMoviment(){
        return moviment;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
   public int getWeight(){
       return weight;
   }
   
   public void setMaxWeight(int maxWeight){
      switch (strenght){
          case 0:
              maxWeight = 100;
          case 1:
              maxWeight = 350;
          case 2:
              maxWeight = 500;
          case 3:
              maxWeight = 2000;
          case 4:
              maxWeight = 5000;
          case 5:
              maxWeight = 10000;
          
      }
   }
    
    public int getMaxWeight(){
      return maxWeight;
    }
    
    public void setStrenght(int strenght){
        this.strenght = strenght;
    }
    
    public int getStrenght(){
        return strenght;
    }
    
    public void setHability(int hability){
        this.hability = hability;
    }
    
    public int getHability(){
        return hability;
    }
    
    public void setResistence(int resistence){
        this.resistence = resistence;
    }
    
   public int getResistence(){
       return resistence;
   }

    public void setArmor(int armor){
        this.armor = armor;
   }
    
    public int getArmor(){
      return armor;
    }
    
    public void setPdf(int pdf){
        this.pdf = pdf;
    }
    
    public int getPdf(){
        return pdf;
    }
    
    public void setPV(int PV){
       this.PV = PV;
        
    }
    
    public int getPV(){
      return PV;
    }
    
    public void setPM(int PM){
        this.PM = PM;
    }
    
    public int getPM(){
        return PM;
    }
    
    public void setXP(int XP){
        this.XP = XP;
    }
    
    public int getXP(){
        return XP;
    }
    
      public void setMaxPV(int MaxPV){
        if (resistence >0){
           this.MaxPV = 5 * resistence;
        }
    }
    
    public int getMaxPV(){
      return MaxPV;
    }
    
    public void setMaxPM(int MaxPM){
        if (resistence >0){
           this.MaxPM = 5 * resistence;
        }
    }   
    public int getMaxPM(){
        return MaxPM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
