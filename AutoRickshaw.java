/*
 * This is one of the class of vehicle class.
 * author @ Geenesh Acharya
 * ID: NP05CP4s220023@iic.edu.np 
 */
public class AutoRickshaw extends Vehicle
{   // accessor method of given code
    private int engineDisplacement;
    private int numberOfSeats;
    private int chargeAmount;
    private int fuelTankCapacity;
    private String groundClearance;
    private String torque;
    private String bookedDate;
    private boolean isBooked;
   
    public AutoRickshaw(int vehicleId,String vehicleName,String torque, String vehicleWeight,String vehicleColor,String vehicleSpeed,String groundClearance, int engineDisplacement,int fuelTankCapacity)
    {
        super(vehicleId, vehicleName,vehicleColor,vehicleWeight);
        super.setVehicleSpeed(vehicleSpeed);    
        super.setVehicleColor(vehicleColor);
        this.engineDisplacement= engineDisplacement;
        this.torque=torque;
        this.fuelTankCapacity=fuelTankCapacity;
        this.groundClearance=groundClearance;
        this.engineDisplacement=engineDisplacement;
        this.isBooked= false;
        // making an accessor method
    }
        public int getEngineDisplacement()
    {
        return this.engineDisplacement;
    }
    public String getTorque()
    {
        return this.torque;
    }
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    public int getFuelTankCapacity()
    {
        return this.fuelTankCapacity;
    }
    public int getChargeAmount()
    {
        return this.chargeAmount;
    }
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    public String getGroundClearance()
    {
         return this.groundClearance;
        }
// Setters are methods for changing the value of a private variable.
    public void setChargeAmount(int chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public void setNumberOfSeat(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    // developing a book method to display booked information
    public void booking(String bookedDate, int chargeAmount, int numberOfSeat) {
        if (this.getIsBooked() == true) {
            System.out.println("The status of isBooked is "+this.getIsBooked()+" So,autorickshaw is alredy booked");
        } else {
            this.bookedDate = bookedDate;
            this.setChargeAmount(chargeAmount);
            this.setNumberOfSeat(numberOfSeat);
            this.isBooked = true;
        }
    }

    // AutoRickshaw details are displayed using this way.
    public void displayDetails() {
        super.display();
        if (isBooked == true) {
            System.out.println("The engine displacement is" + this.getEngineDisplacement());
            System.out.println("The torque is" + this.getTorque());
            System.out.println("The fuel tank capacity is" + this.getFuelTankCapacity());
            System.out.println("The ground clearance is" + this.getGroundClearance());
            System.out.println("The booked date is" + this.getBookedDate());

            if (this.getChargeAmount() == 0) {
                System.out.println("The Charge Amount is Empty!");
            } else {
                System.out.println("The Charge Amount is " + this.getChargeAmount());
            }

            if (this.getNumberOfSeats() == 0) {
                System.out.println("The number of seat is Empty!");
            } else {
                System.out.println("The number of seat is " + this.getNumberOfSeats());
            }
        }
    }
}