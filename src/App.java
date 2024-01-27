import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int queda = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                temp = arr[i];
            } else{
                if(arr[i]>= temp){
                    temp = arr[i];
                }else{
                    queda = i +1;
                    break;
                }
            }
        }

        sc.close();
        System.out.println(queda);
    }
}
