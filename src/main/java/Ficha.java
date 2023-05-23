/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leonardo.godoy
 */
public class Ficha {
    
    // Personagem
    private String name;
    private short age;
    private double range;
    private String color;
    //Classe
    private String kits;
    private String divinity;
    private String funct;
    private byte points;
    private String uniqueAdvantage;
    //Ações
    private byte iniciative = 0;
    private byte moviment = 0;
    private int weight =  0;
    private int maxWeight = 100;
    //Caracteristicas
    private byte strenght = 0;
    private byte hability = 0;
    private byte resistence = 0;
    private byte armor = 0;
    private byte pdf = 0;
    // Atributos não distribuiveis
    private int PV = 1;
    private int PM = 1;
    private int XP = 1;
    private int MaxPV;
    private int MaxPM;
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
      return name;
    }
    
    public void setAge(short age){
        this.age = age;
    }
    
    public short getAge(){
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
    
    public void setPoints(byte points){
        this.points = points;
    }
    
   public byte getPoints(){
       return points;
   }
   
   public void setUniqueAdvantage(String uniqueAdvantage){
        this.uniqueAdvantage = uniqueAdvantage;
    }
    
    public String getUniqueAdvantage(){
      return uniqueAdvantage;
    }
    
    public void setIniciative(byte iniciative){
        this.iniciative = iniciative;
    }
    
    public byte getIniciative(){
        return iniciative;
    }
    
    public void setMoviment(byte moviment){
        this.moviment = moviment;
    }
    
    public byte getMoviment(){
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
    
    public void setStrenght(byte strenght){
        this.strenght = strenght;
    }
    
    public byte getStrenght(){
        return strenght;
    }
    
    public void setHability(byte hability){
        this.hability = hability;
    }
    
    public byte getHability(){
        return hability;
    }
    
    public void setResistence(byte resistence){
        this.resistence = resistence;
    }
    
   public byte getResistence(){
       return resistence;
   }

    public void setArmor(byte armor){
        this.armor = armor;
   }
    
    public byte getArmor(){
      return armor;
    }
    
    public void setPdf(byte pdf){
        this.pdf = pdf;
    }
    
    public byte getPdf(){
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
}
