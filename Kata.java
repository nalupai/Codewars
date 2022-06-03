public class Kata {

    public static void main(String[] args) {

        System.out.println(solution("oxf", "xof"));
    }

    /* https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java */
    public static String solution(String s1, String s2) {

        String allLetters = s1 + s2;
        String uniqueLetters = "";

        for(int i = 0; i < allLetters.length(); i++) {
            char letter = allLetters.charAt(i);
            if (uniqueLetters.contains(letter + "")) {
                continue;
            } else {
                uniqueLetters = uniqueLetters + allLetters.charAt(i);
            }
        }

        char[] letters = new char[uniqueLetters.length()];

        for(int i = 0; i < letters.length; i++) {
            letters[i] = uniqueLetters.charAt(i);
        }

        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < letters.length - 1; j++) {
                if (letters[j] < letters[j+1]) {
                    continue;
                } else {
                    char temp = letters[j];
                    letters[j] = letters[j+1];
                    letters[j+1] = temp;
                }
                if (j == letters.length - 1) {
                    letters[j+1] = letters[j+1];
                }
            }
        }

        return String.valueOf(letters);
    }

    /* https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java 
    public static int persistence(long n) { //999

        if (n < 10) {
            return 0;
        }

        int counter = 1;
        
        //long -> String (for length check)
        String nStr = String.valueOf(n); //"999"
        //length check
        long length = nStr.length(); //3

        String highestFactor = "1";
        for (int i = 0; i < length - 1; i++) {
            highestFactor = highestFactor + "0";
        }
        long factor = Long.parseLong(highestFactor); //100

        long m = 1L;
        
        for(int i = 0; i < length; i++) { //3 times
            long digit = n / factor; //999 / 100 =  9
            m = m * digit; //1 * 9
            n = n - (digit * factor); //999 - 900 = 99
            String factorStr = String.valueOf(factor); //"100"
            if (factorStr.length() > 2) {
                factorStr = factorStr.substring(0, factorStr.length() - 1); // "10"
                factor = Long.parseLong(factorStr); //10
            } else {
                factor = 1L;
            }
        }

        if (String.valueOf(m).length() > 2) {
            counter = counter + persistence(m);
        } else {
            while (String.valueOf(m).length() == 2) {
            String resultStr = String.valueOf(m);
            m = Long.parseLong(resultStr.substring(0, 1)) * Long.parseLong(resultStr.substring(1));
            counter++;
            }
        }

        return counter;
    }

    //999 --> 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, 1*2 = 2
    /*public static long persistence(long n) { //999

        String nStr = String.valueOf(n); //"999"
        long length = nStr.length(); //3

        String highestFactor = "1";
        for (int i = 0; i < length - 1; i++) {
            highestFactor = highestFactor + "0";
        }
        long factor = Long.parseLong(highestFactor); //100

        long m = 1L;

        for(int i = 0; i < length; i++) { //3
            long digit = n / factor; //999 / 100 =  9
            m = m * digit; //1 * 9
            n = n - (digit * factor); //999 - 900 = 99
            String factorStr = String.valueOf(factor); //"100"
            if (factorStr.length() > 2) {
                factorStr = factorStr.substring(0, factorStr.length() - 1); //"10"
                factor = Long.parseLong(factorStr); //10
            } else {
                factor = 1L;
            }
        }

        long result;

        if (String.valueOf(m).length() > 2) {
            result = persistence(m);
        } else {
            while (String.valueOf(m).length() == 2) {
                String resultStr = String.valueOf(m);
                m = Long.parseLong(resultStr.substring(0, 1)) * Long.parseLong(resultStr.substring(1));
            }
            result = m;
        }

        return result;
    }*/

    /* https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java 
    public static boolean solution(char[] walk) {
        int counterN = 0;
        int counterS = 0;
        int counterE = 0;
        int counterW = 0;
        
        if (walk.length > 10 || walk.length == 2) {
            return false;
        }
        
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n': counterN++; break;
                case 's': counterS++; break;
                case 'e': counterE++; break;
                case 'w': counterW++; break;
            }
        }

        if (counterN == counterS && counterE == counterW) {
            return true;
        }
        
        return false;
    }

    /* https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java 
    public static boolean solution(int n) {
        
        double a = Math.sqrt(n);
        int b = (int)Math.sqrt(n);
        
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    /*
    public static boolean solution(int n) {
        return Math.sqrt(n) == (int)Math.sqrt(n) ? true : false;
    }*/

    /* https://www.codewars.com/kata/545cedaa9943f7fe7b000048/train/java 
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
