public class Dentist extends HealthProfessional {
    private String ClinicName;

    public Dentist() {
        super();
    }

    public Dentist(int Id, String Name, String Specialty, String BadgeNumber, String ClinicName) {
        super(Id, Name, Specialty, BadgeNumber);
        this.ClinicName = ClinicName;
    }

    public String GetClinicName() {
        return ClinicName;
    }

    public void SetClinicName(String ClinicName) {
        this.ClinicName = ClinicName;
    }

    @Override
    public void PrintDetails() {
        super.PrintDetails();
        System.out.printf("%-20s: %s%n", "Type", "Dentist");
        System.out.printf("%-20s: %s%n", "Clinic Name", ClinicName);
    }

    @Override
    public String GetSpecializationDetails() {
        return "Specializes in dental care. Clinic: " + ClinicName;
    }

    @Override
    public String GetNameAndSpecialty() {
        return GetName() + " (Dentistry)";
    }
}
