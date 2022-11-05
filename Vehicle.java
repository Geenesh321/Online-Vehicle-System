/*
 * This is one of the super/parent class.
 * author @ Geenesh Acharya
 * ID: NP05CP4s220023@iic.edu.np 
 */
public class Vehicle
{
    //Declaration of five attributes of Vehicle Class
    private int vehicleID;
    private String vehicleColor;
    private String vehicleSpeed;
    private String vehicleName;
    private String vehicleWeight;
    /** 
     * Passing arguments to a constructor for the vehicle class
     */
    public Vehicle (int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor)
    {
        //Initilization of instance variable
        this.vehicleColor=vehicleColor;
        this.vehicleWeight=vehicleWeight;
        this.vehicleID=vehicleID;
        this.vehicleName=vehicleName;   
    }
    
    /**
     * Each attribute of Vehicle Class has an accessor method.
     */
    public int getvehicleID()
    {
        return this.vehicleID;
    }
    
    public String getvehicleName()
    {
        return this.vehicleName;
    }
    
    public String getvehicleWeight()
    {
        return this.vehicleWeight;
    }
    
    public String getvehicleColor()
    {
        return this.vehicleColor;
    }
    
    public String getvehicleSpeed()
    {
        return this.vehicleSpeed;
    }
    
    /**
     * Vehicle Speed Mutator Method
     */
    public void setVehicleSpeed (String vehicleSpeed)
    {
        this.vehicleSpeed=vehicleSpeed;
    }
    
    /**
     * Vehicle Color Mutator Method
     */
    public void setVehicleColor (String vehicleColor)
    {
        this.vehicleColor=vehicleColor;
    }
     
    /**
     * The output will be shown using this way.
     */
    public void display()
    {
        System.out.println("The Color of Vehicle: "+getvehicleColor());
        System.out.println("The Speed of Vehicle: "+getvehicleSpeed());
        System.out.println("The ID of Vehicle: "+getvehicleID());
        System.out.println("The Name of Vehicle: "+getvehicleName());
        //Using (if else) statement to check Vehicle Weight is empty
        if(getvehicleWeight().equals("")){
            System.out.println("The Weight of Vehicle is empty");
        }
        else{
            System.out.println("The Weight of Vehicle: "+getvehicleWeight());
        }
        
    }

}