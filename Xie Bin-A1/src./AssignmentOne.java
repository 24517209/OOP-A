import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    // Method to create an appointment
    public static void createAppointment() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter patient name: ");
            String patientName = scanner.nextLine();
            System.out.print("Enter patient mobile: ");
            String patientMobile = scanner.nextLine();
            System.out.print("Enter preferred time slot (e.g., 08:00): ");
            String timeSlot = scanner.nextLine();

            System.out.println("Choose doctor type: 1. General Practitioner 2. Specialist");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            HealthProfessional selectedDoctor;
            if (choice == 1) {
                selectedDoctor = new GeneralPractitioner(1, "Dr. Smith", "Downtown Clinic");
            } else {
                selectedDoctor = new Specialist(2, "Dr. Johnson", "Cardiology");
            }

            Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, selectedDoctor);
            appointments.add(appointment);
            System.out.println("Appointment created successfully!");
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }

    // Method to cancel a booking by patient mobile
    public static void cancelBooking() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter patient mobile to cancel: ");
            String mobile = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < appointments.size(); i++) {
                if (appointments.get(i).getPatientMobile().equals(mobile)) {
                    appointments.remove(i);
                    System.out.println("Appointment cancelled successfully!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No appointment found with the given mobile number.");
            }
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }

    // Main method
    public static void main(String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Brown", "City Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Green", "Suburban Clinic");
        Specialist sp1 = new Specialist(3, "Dr. White", "Dermatology");

        gp1.displayDetails();
        System.out.println("------------------------------");
        gp2.displayDetails();
        System.out.println("------------------------------");
        sp1.displayDetails();
        System.out.println("------------------------------");

        createAppointment();
        createAppointment();
        printExistingAppointments();
        cancelBooking();
        printExistingAppointments();
    }

    // Method to print existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println("------------------------------");
                appointment.displayAppointment();
            }
        }
    }
}
