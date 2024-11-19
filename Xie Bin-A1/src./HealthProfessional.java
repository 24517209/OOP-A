import java.util.ArrayList;
import java.util.List;

public abstract class HealthProfessional implements Bookable {
    private int Id;
    private String Name;
    private String Specialty;
    private String BadgeNumber;
    private List<String> AvailableSlots;

    public HealthProfessional() {
        AvailableSlots = new ArrayList<>();
    }

    public HealthProfessional(int Id, String Name, String Specialty, String BadgeNumber) {
        this.Id = Id;
        this.Name = Name;
        this.Specialty = Specialty;
        this.BadgeNumber = BadgeNumber;
        this.AvailableSlots = new ArrayList<>();
    }

    public int GetId() {
        return Id;
    }

    public void SetId(int Id) {
        this.Id = Id;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public String GetSpecialty() {
        return Specialty;
    }

    public void SetSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public String GetBadgeNumber() {
        return BadgeNumber;
    }

    public void SetBadgeNumber(String BadgeNumber) {
        this.BadgeNumber = BadgeNumber;
    }

    public List<String> GetAvailableSlots() {
        return AvailableSlots;
    }

    public void PrintDetails() {
        System.out.printf("%-20s: %s%n", "ID", Id);
        System.out.printf("%-20s: %s%n", "Name", Name);
        System.out.printf("%-20s: %s%n", "Specialty", Specialty);
        System.out.printf("%-20s: %s%n", "Badge Number", BadgeNumber);
    }

    public abstract String GetSpecializationDetails();

    @Override
    public void AddAvailableSlot(String Slot) {
        AvailableSlots.add(Slot);
    }

    @Override
    public boolean IsSlotAvailable(String Slot) {
        return AvailableSlots.contains(Slot);
    }

    @Override
    public void BookSlot(String Slot) {
        if (AvailableSlots.contains(Slot)) {
            AvailableSlots.remove(Slot);
        } else {
            System.out.println("Error: Slot " + Slot + " is not available.");
        }
    }

    public void PrintAvailableSlots() {
        if (AvailableSlots.isEmpty()) {
            System.out.println("No available slots.");
        } else {
            System.out.println("Available Slots:");
            for (String Slot : AvailableSlots) {
                System.out.println(Slot);
            }
        }
    }

    public String GetNameAndSpecialty() {
        return Name + " (" + Specialty + ")";
    }
}
