package Lista1;

public class Q7 {
    public static void main(String[] args) { 
        for(int i = 1; i < 100; i++){
            if(i % 3 == 0){
                int resultInt = i/2;
                double resultDouble = i/2.0;
                System.out.println("Valor de i: "+ i + " | Result Int: "+ resultInt + " | Result Double: "+ resultDouble);
             }
        }
    }
}
