public class Kata {

    public static void main(String[] args) {
        System.out.println(solution("hello!", "!"));
    }

    /* https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java */
    public static boolean solution(String str, String ending) {
        
        if (str.length() >= ending.length()) {
            for (int i = 1; i <= ending.length(); i++) {
                if (str.charAt(str.length() - i) != ending.charAt(ending.length() - i)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        
        return true;
    }

    /*
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }*/
}
