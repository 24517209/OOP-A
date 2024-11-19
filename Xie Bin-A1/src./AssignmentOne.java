import java.util.ArrayList;

public class AssignmentOne {

    private static ArrayList<Appointment> AppointmentList = new ArrayList<>();

    public static void main(String[] args) {

        GeneralPractitioner Gp1 = new GeneralPractitioner(1, "Dr. Alice", "General Medicine", "GP001", 5);
        Gp1.AddAvailableSlot("08:00 - 09:00");
        Gp1.AddAvailableSlot("11:00 - 12:00");

        GeneralPractitioner Gp2 = new GeneralPractitioner(2, "Dr. Bob", "General Medicine", "GP002", 8);
        Gp2.AddAvailableSlot("09:00 - 10:00");
        Gp2.AddAvailableSlot("13:00 - 14:00");

        Dentist Dentist1 = new Dentist(4, "Dr. Daisy", "Dentistry", "D001", "Happy Smile Clinic");
        Dentist1.AddAvailableSlot("08:30 - 09:30");
        Dentist1.AddAvailableSlot("15:00 - 16:00");

        System.out.println("------------------------------");
        Gp1.PrintDetails();
        Gp1.PrintAvailableSlots();

        System.out.println("------------------------------");
        Gp2.PrintDetails();
        Gp2.PrintAvailableSlots();

        System.out.println("------------------------------");
        Dentist1.PrintDetails();
        Dentist1.PrintAvailableSlots();

        System.out.println("------------------------------");
        System.out.println("// Part 4 – Creating appointments");

        Appointment Appointment1 = new Appointment("John Doe", "1234567890", "Flu Symptoms", "08:00 - 09:00", Gp1);
        Appointment1.PrintAppointmentDetails();

        System.out.println("------------------------------");

        Appointment Appointment2 = new Appointment("Jane Doe", "0987654321", "Toothache", "15:00 - 16:00", Dentist1);
        Appointment2.PrintAppointmentDetails();

        System.out.println("------------------------------");

        System.out.println("// Part 5 – Collection of appointments");

        CreateAppointment("Michael Smith", "1122334455", "Back Pain", "13:00 - 14:00", Gp2);
        CreateAppointment("Laura Wilson", "2233445566", "General Check-up", "11:00 - 12:00", Gp1);

        CreateAppointment("Emma Brown", "3344556677", "Dental Cleaning", "08:30 - 09:30", Dentist1);
        CreateAppointment("Olivia White", "4455667788", "Wisdom Tooth Pain", "15:00 - 16:00", Dentist1);

        PrintExistingAppointments();

        System.out.println("------------------------------");

        CancelBooking("3344556677");

        System.out.println("------------------------------");
        PrintExistingAppointments();
    }

    public static void CreateAppointment(String PatientName, String PatientMobile, String PatientCondition, String PreferredTimeSlot, HealthProfessional Doctor) {
        if (PatientName == null || PatientMobile == null || PatientCondition == null || PreferredTimeSlot == null || Doctor == null) {
            System.out.println("Error: Missing information. Appointment cannot be created.");
            return;
        }
        Appointment NewAppointment = new Appointment(PatientName, PatientMobile, PatientCondition, PreferredTimeSlot, Doctor);
        AppointmentList.add(NewAppointment);
        System.out.println("Appointment created successfully for " + PatientName);
    }

    public static void PrintExistingAppointments() {
        if (AppointmentList.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            System.out.printf("%-20s %-15s %-20s %-15s %-30s%n",
                    "Patient Name", "Mobile Number", "Condition", "Time Slot", "Doctor (Specialty)");
            System.out.println("--------------------------------------------------------------------------------------");
            for (Appointment Appointment : AppointmentList) {
                System.out.printf("%-20s %-15s %-20s %-15s %-30s%n",
                        Appointment.GetPatientName(),
                        Appointment.GetPatientMobile(),
                        Appointment.GetPatientCondition(),
                        Appointment.GetPreferredTimeSlot(),
                        Appointment.GetDoctor().GetNameAndSpecialty());
            }
        }
    }

    public static void CancelBooking(String PatientMobile) {
        boolean Found = false;
        for (int i = 0; i < AppointmentList.size(); i++) {
            if (AppointmentList.get(i).GetPatientMobile().equals(PatientMobile)) {
                AppointmentList.remove(i);
                System.out.println("Appointment with mobile " + PatientMobile + " has been cancelled.");
                Found = true;
                break;
            }
        }
        if (!Found) {
            System.out.println("Error: No appointment found with mobile number " + PatientMobile);
        }
    }
}
