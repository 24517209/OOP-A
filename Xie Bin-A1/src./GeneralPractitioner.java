public class GeneralPractitioner extends HealthProfessional {
    private int YearsOfExperience;

    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int Id, String Name, String Specialty, String BadgeNumber, int YearsOfExperience) {
        super(Id, Name, Specialty, BadgeNumber);
        this.YearsOfExperience = YearsOfExperience;
    }

    public int GetYearsOfExperience() {
        return YearsOfExperience;
    }

    public void SetYearsOfExperience(int YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }

    @Override
    public void PrintDetails() {
        super.PrintDetails();
        System.out.printf("%-20s: %s%n", "Type", "General Practitioner");
        System.out.printf("%-20s: %d years%n", "Years of Experience", YearsOfExperience);
    }

    @Override
    public String GetSpecializationDetails() {
        return "General health care with " + YearsOfExperience + " years of experience.";
    }

    @Override
    public String GetNameAndSpecialty() {
        return GetName() + " (General Medicine)";
    }
}
