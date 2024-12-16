// Part 2 - Child Class: General Practitioner
public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.clinicLocation = "Unknown Location";
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String clinicLocation) {
        super(id, name, "General Practitioner");
        this.clinicLocation = clinicLocation;
    }

    // Method to display health professional details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Clinic Location: " + clinicLocation);
    }
}
