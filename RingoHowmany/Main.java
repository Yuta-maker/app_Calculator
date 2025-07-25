import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("リンゴの総量を入力してください: ");
        int n = sc.nextInt();

        Map<String, Integer> manage = new HashMap<>();

        for(int i = 0; i < n; i++){
            System.out.println("リンゴを渡す" + (i+1) + "人目の名前をローマ字で入力してください: ");
            String name = sc.next();
            manage.put(name, manage.getOrDefault(name, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : manage.entrySet()){
            System.out.println(entry.getKey() + "は" + entry.getValue() + "個のリンゴを持っています");
        }
    }
}

// a