// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(Multiplicacion (5,4));
    }


    public static int Multiplicacion (int a, int b){
        int c = 0;

        if(b == 0 ){

            return 0;
        }else {
            if (b==1){

                return a;

            }else{

                c = a + Multiplicacion(a,b-1);

            }

        }
        return c;

    }
            System.out.print("V5");
             System.out.print("soy otro programador");




}