package methodsandlibraries;
public class Assignment4 {
    public static void main(String[] args) {
        System.out.println(password()+passwordLetter());
    }
           /* for (int j = 0; j < 3; j++) {
                System.out.print((char) (97 + (int) (Math.random() * 26)));
            }
            for (int i = 0; i < 3; i++) {
                System.out.print((int) (Math.random() * 10));

            }
        }*/
        public static String password(){
        String result ="";
        for (int i=0; i<3; i++){
            result+=(int) (Math.random() * 10);
        }
        return result;
        }
        public static String passwordLetter(){
        String result="";
        for (int j=0; j<3; j++){
            result+=((char) (97 + (int) (Math.random() * 26)));
        }
        return result;
        }
    }



