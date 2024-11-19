public interface Bookable {
    void AddAvailableSlot(String Slot);
    boolean IsSlotAvailable(String Slot);
    void BookSlot(String Slot);
}
