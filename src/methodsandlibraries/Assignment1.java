package methodsandlibraries;
public class Assignment1 {
    public static void main(String[] args) {
        /*int count = 0;
        while (count < 20) {
            generatePass();
            count++;

       }
         */
        String password= generatePassword();
        System.out.println(password);
    }
    public static void generatePass(){
        for (int i=0; i<6; i++){
            System.out.print((int)(Math.random()*10));
        }
        System.out.println();
    }
    public static String generatePassword(){
        String result="";
        for (int j=0; j<6; j++) {
            result+=(int)(Math.random()*10);
        }
        return result;
        }
    }

