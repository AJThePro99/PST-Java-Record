package w4.s3;

public class Task5 {
        public static String timeConversion(String s) {
        int n = s.length();
        int hour = Integer.parseInt(s.substring(0, 2));
        String amOrPm = s.substring(n-2);
        String remaining = s.substring(2, n - 2);
        
        if (amOrPm.equalsIgnoreCase("am")) {
            if (hour == 12) {
                return "00" + remaining;
            } else {
                return String.format("%02d", hour) + remaining;
            }
        } else {
            if (hour != 12) {
                hour += 12;                
            }
        }
        return String.format("%02d", hour) + remaining;
    
    }
}
