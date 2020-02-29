package methodsandlibraries;
public class Assignment2 {
        public static void main(String[] args) {
          /*  String password= generatePassword();
            System.out.println(password);
            System.out.println(100+(int)(Math.random()*100));
        }*/

            for (int i=0; i<100; i++){
                System.out.println((int)(101+(Math.random()*100)));
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

