import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の数値 : ");
        double num1 = sc.nextDouble();
        
        System.out.print("演算子(+ - * /) : ");
        char operator = sc.next().charAt(0);
        
        System.out.print("2つ目の数値 : ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            
            case '-':
                result = num1 - num2;
                break;
                
            case '*':
                result = num1 * num2;
                break;
                
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("0で割れません!");
                    return;
                }
                break;
            
            default:
                System.out.println("無効な演算子です");
                return;
        }
        
        System.out.println("結果 : " + result);
    }
}