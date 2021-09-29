package Info5100_hw1;

/**
 * Author Khushbu
 * This class represent the input for RansomNote Question
 */
public class RansomMagazineInput {
    String ransomNote;
    String magazine;

    public RansomMagazineInput(String ransomNote, String magazine) {
        this.ransomNote = ransomNote;
        this.magazine = magazine;
    }

    public String getRansomNote() {
        return ransomNote;
    }

    public String getMagazine() {
        return magazine;
    }
}
