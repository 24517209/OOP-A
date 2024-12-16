public class Appointment {
    private String PatientName;
    private String PatientMobile;
    private String PatientCondition;
    private String PreferredTimeSlot;
    private HealthProfessional Doctor;

    public Appointment() {
    }

    public Appointment(String PatientName, String PatientMobile, String PatientCondition, String PreferredTimeSlot, HealthProfessional Doctor) {
        this.PatientName = PatientName;
        this.PatientMobile = PatientMobile;
        this.PatientCondition = PatientCondition;
        this.PreferredTimeSlot = PreferredTimeSlot;
        this.Doctor = Doctor;
    }

    public String GetPatientName() {
        return PatientName;
    }

    public void SetPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String GetPatientMobile() {
        return PatientMobile;
    }

    public void SetPatientMobile(String PatientMobile) {
        this.PatientMobile = PatientMobile;
    }

    public String GetPatientCondition() {
        return PatientCondition;
    }

    public void SetPatientCondition(String PatientCondition) {
        this.PatientCondition = PatientCondition;
    }

    public String GetPreferredTimeSlot() {
        return PreferredTimeSlot;
    }

    public void SetPreferredTimeSlot(String PreferredTimeSlot) {
        this.PreferredTimeSlot = PreferredTimeSlot;
    }

    public HealthProfessional GetDoctor() {
        return Doctor;
    }

    public void SetDoctor(HealthProfessional Doctor) {
        this.Doctor = Doctor;
    }

    public void PrintAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.printf("%-20s: %s%n", "Patient Name", PatientName);
        System.out.printf("%-20s: %s%n", "Patient Mobile", PatientMobile);
        System.out.printf("%-20s: %s%n", "Patient Condition", PatientCondition);
        System.out.printf("%-20s: %s%n", "Preferred Time Slot", PreferredTimeSlot);
        System.out.println("Doctor Details:");
        Doctor.PrintDetails();
        System.out.printf("%-20s: %s%n", "Specialization Details", Doctor.GetSpecializationDetails());
        System.out.println("------------------------------------------------------------");
    }
}
