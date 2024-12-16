// Part 4 - Appointment Class
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    // Parameterized constructor
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Method to display appointment details
    public void displayAppointment() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        if (doctor != null) {
            System.out.println("Doctor Details:");
            doctor.displayDetails();
        }
    }

    // Getter for patient mobile (used in appointment cancellation)
    public String getPatientMobile() {
        return patientMobile;
    }
}
