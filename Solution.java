
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));    
    String[] str = new String[10];
    int[] num = new int[10];
    
     for (int i = 0; i < str.length; i++){
            str[i] = reader.readLine();
        }
     for (int k = 0; k < num.length; k++){
            num[k] = str[k].length();
            System.out.println(num[k]);
        }
        
        
    }
}
