// Part 1 - Base Class
public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    // Parameterized constructor
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Method to display health professional details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    // Getters for use in Appointment class
    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}
