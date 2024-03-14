// package Builder;

// import Builder.AirplaneBuilder;

public class BuilderExample {
    public static void main(String[] args) {
        // Instantiate the director (hire the engineer)
        AerospaceEngineer aero = new AerospaceEngineer();

        // Instantiate each concrete builder (take orders)
        AirplaneBuilder crop = new CropDuster("Farmer Joe");
        AirplaneBuilder fighter = new FighterJet("The Navy");
        AirplaneBuilder glider = new Glider("Tim Rice");
        AirplaneBuilder airliner = new Airliner("United Airlines");

        // Build a CropDuster
        aero.setAirplaneBuilder(crop);
        aero.constructAirplane();
        Airplane completedCropDuster = aero.getAirplane();
        System.out.println(completedCropDuster.getType() + " is completed and ready for delivery to " + completedCropDuster.getCustomer());
        
        // The other 3 builds removed to fit the code on one page
    }
}
