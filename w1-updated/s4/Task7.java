package w1-updated.s4;

public class Task7 {
    String num = String.valueOf(Math.abs(input1));
        Set<Character> chars = new HashSet<>();

        for (char c : num.toCharArray()) {
            chars.add(c);
        }

        return chars.size();
    
}
