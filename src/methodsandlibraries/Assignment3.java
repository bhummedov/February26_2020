package methodsandlibraries;
public class Assignment3 {
    public static void main(String[] args) {
        int passLen = 6;
        generateLetterPassword(passLen);
        System.out.println();
        int passLength = 10;
        System.out.print((generateLetterPass(passLength)));
    }
       public static void generateLetterPassword(int passLen){
           for (int j = 0; j < passLen; j++) {
               System.out.println((char) (97 + (int) (Math.random() * 26)));

           }
    }
    public static String generateLetterPass(int passLength){
        String result="";
        for (int i=0; i<passLength; i++) {
            result += result + (char) (97 + (int) (Math.random() * 26));
        }
        return result;
        }
    }

