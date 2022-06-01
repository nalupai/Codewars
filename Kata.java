public class Kata {

    public static void main(String[] args) {
        System.out.println(solution("The quick brown fox jumps over a lazy dog."));
    }

    /* https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java */
    public static boolean solution(String sentence) {
        if ((sentence.contains("A") || sentence.contains("a")) &&
            (sentence.contains("B") || sentence.contains("b")) &&
            (sentence.contains("C") || sentence.contains("c")) &&
            (sentence.contains("D") || sentence.contains("d")) &&
            (sentence.contains("E") || sentence.contains("e")) &&
            (sentence.contains("F") || sentence.contains("f")) &&
            (sentence.contains("G") || sentence.contains("g")) &&
            (sentence.contains("H") || sentence.contains("h")) &&
            (sentence.contains("I") || sentence.contains("i")) &&
            (sentence.contains("J") || sentence.contains("j")) &&
            (sentence.contains("K") || sentence.contains("k")) &&
            (sentence.contains("L") || sentence.contains("l")) &&
            (sentence.contains("M") || sentence.contains("m")) &&
            (sentence.contains("N") || sentence.contains("n")) &&
            (sentence.contains("O") || sentence.contains("o")) &&
            (sentence.contains("P") || sentence.contains("p")) &&
            (sentence.contains("Q") || sentence.contains("q")) &&
            (sentence.contains("R") || sentence.contains("r")) &&
            (sentence.contains("S") || sentence.contains("s")) &&
            (sentence.contains("T") || sentence.contains("t")) &&
            (sentence.contains("U") || sentence.contains("u")) &&
            (sentence.contains("V") || sentence.contains("v")) &&
            (sentence.contains("W") || sentence.contains("w")) &&
            (sentence.contains("X") || sentence.contains("x")) &&
            (sentence.contains("Y") || sentence.contains("y")) &&
            (sentence.contains("Z") || sentence.contains("z"))) {
            return true;
        }
        return false;
    }

    /* https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java 
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
