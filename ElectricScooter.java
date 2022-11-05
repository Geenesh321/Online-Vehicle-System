 /*This is subclass of vehicle .
 * author @ Geenesh Acharya
 * ID: NP05CP4s220023@iic.edu.np 
 */public class ElectricScooter extends Vehicle
 {
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    //constructing a constructor to store value
       public ElectricScooter(int vehicleId, String vehicleName,String vehicleSpeed, int batteryCapacity, String vehicleColor, String vehicleWeight)
       {
           super(vehicleId, vehicleName,vehicleColor,vehicleWeight);
           super.setVehicleSpeed(vehicleSpeed);    
           super.setVehicleColor(vehicleColor);
           this.batteryCapacity=batteryCapacity;
           this.range=0;
           this.price= 0;
           this.brand="";
           this.mileage= "";
           this.chargingTime="";
           this.hasPurchased=false;
           this.hasSold= false;
       }
       // To get data, use the accessor technique.
       public int getRange()
       {
           return this.range;
       }
       public int getBatteryCapacity()
       {
           return this.batteryCapacity;
       }
       public int getPrice()
       {
           return this.price;
       }
       public String getChargingTime()
       {
           return this.chargingTime;
       }
       public String getBrand()
       {
           return this.brand;
       }
       public String getMileage()
       {
            return this.mileage;  
       }
       public boolean getHasPurchased()
       {
           return this.hasPurchased;
       }
        public boolean getHasSold()
       {
           return this.hasSold;        
       }
       public void setBrand(String brand)
       {
           if (hasPurchased==false)  {
               this.brand=brand;
           }
           else {
               System.out.println("The vahicle is already purchased, so brand can not be changed");
           }
       }
   
       // develop a way for purchasing a scooter
       public void purchasedScooter(String brand, int price, String chargingTime,String mileage, int range )
       {
           // to see whether the scooter has been purchased or not
           if (this. hasPurchased == false)
           {
               this.setBrand(brand);
               this.price=price;
               this.chargingTime= chargingTime;
               this.mileage=mileage;
               this.range=range;
               this.hasPurchased = false;
           }
          
      
       }
     // devising a technique for selling the scooter
       public void sell (int price) {
           if(this.hasSold == false)
          
           {
               this.price = price;
               this.range = 0;
               this.chargingTime= "";
               this.mileage= "";
               this.batteryCapacity=0;
               this.hasSold = true;
               this.hasPurchased=false;
           }
           else if(this.getHasSold() == true)
          
           {
               System.out.print ("this scooter is already sold");
           }
       }
       //construction of a display for the qualities of the electric scooter class
       public void display()

       {
           //Invoking the constructor of the superclass
           super.display();
           if (this.getHasPurchased()==true)
           {
               System.out.println("The battery capacity of vehicle" + this.getBatteryCapacity());
               System.out.println("The brand of vehicle" + this.getBrand());
               System.out.println("The range of vehicle" + this.getRange());
               System.out.println("The charge time of vehicle" + this.getChargingTime());
               System.out.println("The mileage of vehicle" + this.getMileage());
           }
       }
   }