package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character < 'a' || character > 'z') {
            System.out.println("wrong alphabet!");
        } else if (character == 'a' || character == 'e' || character == 'y' || character == 'u' || character == 'i' || character == 'o') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
