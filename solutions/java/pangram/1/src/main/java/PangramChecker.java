public class PangramChecker {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public boolean isPangram(String input) {
        return alphabet.chars().mapToObj(c -> (char) c).allMatch(c -> input.toLowerCase().indexOf(c) >= 0);
    }

}
