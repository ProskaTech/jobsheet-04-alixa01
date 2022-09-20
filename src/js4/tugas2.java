
package js4;

/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas2 {
    public static void main(String[] agrs){
        int a = 10;
        int b = 23;
        int c = 5;
        int tinggi;
        int tinggi1;
        
        tinggi = (a >= b) ? a : b;
        tinggi1 = (tinggi >= c) ? tinggi : c;
        
        System.out.println("number 1 = " +a);
        System.out.println("number 2 = " +b);
        System.out.println("number 3 = " +c);
        System.out.println("nilai tertingginya adalah angka = " + tinggi1);
    }
    
}
