/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author V244682
 */
public final class Vehicle {
     private String	manufacturer;
	private String	model;
	private int	makeYear;
        private String RegistrationNo; 
       private int OdometerReadingKm; 
        private int TankCapacityL;
               
	private final FuelPurchase fuelPurchase;
     private Service s = new Service();
	/**
	 * Class constructor specifying name of make (manufacturer), model and year
	 * of make.
	 * @param manufacturer
	 * @param model
	 * @param makeYear
         * @param RegistrationNo
	 */
	public Vehicle(String manufacturer, String model, int makeYear, String RegistrationNo,int OdometerReadingKm, int TankCapacityL
        ,int LastService0, int ServiceCourt, String Date) {
		setmanufacturer(manufacturer);
		setModel(model);
		setMakeYear(makeYear);
                setRegistrationNo(RegistrationNo);
                setOdometerReadingKm(OdometerReadingKm);
                setTankCapacityL(TankCapacityL);
		fuelPurchase = new FuelPurchase();
                recoredService(LastService0,Date, ServiceCourt);
	}
        
        
        
//Setter and getters
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setmanufacturer(String fmanufacturer) {
        this.manufacturer = fmanufacturer;
    }

    public String getModel(){
        return this.model;
    }
    public void setModel(String fModel){
        this.model = fModel;
    }
    public int getMakeYear(){
        return this.makeYear;
    }
    public void setMakeYear(int fmakeyear){
        this.makeYear = fmakeyear;
    }
    
     public String getRegistrationNo(){
        return this.RegistrationNo;
    }
    public void setRegistrationNo(String fRegistrationNo){
        this.RegistrationNo = fRegistrationNo;
    }
    
      public int getOdometerReadingKm(){
        return this.OdometerReadingKm;
    }
   public void setOdometerReadingKm(int fOdometerReadingKm){
        this.OdometerReadingKm = fOdometerReadingKm;
    }
  
     public int getTankCapacityL(){
        return this.TankCapacityL;
    }
    public void setTankCapacityL(int fTankCapacityL){
        this.TankCapacityL = fTankCapacityL;
    }
        
	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Vehicle: " + makeYear + " " + manufacturer + " " + model);		
                // TODO Display additional information about this vehicle
	}

        
        //  addKilometers method which takes a parameter for distance travelled 
         // and adds it to the odometer reading. 
        public void addKilometers(int kilometersTravel){
            this.OdometerReadingKm =+ kilometersTravel;
        }
        
       

        // adds fuel to the car
        public void addFuel(double litres, double price){            
            fuelPurchase.purchaseFuel(litres, price);
        }   
        
        public void recoredService(int distance, String date, int count){
            s.recordedService(distance, date ,count);
        }
        
}