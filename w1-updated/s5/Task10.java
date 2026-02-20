package w1-updated.s5;

public class Task10 {
    String[] word = input1.trim().split("\\s+");

        if (word.length < 2) {
            return "LESS";
        }

        return word[1].toUpperCase();
	}
    
}
