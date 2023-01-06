import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("how many prime number do you want to print?");
        Scanner s=new Scanner(System.in);
        int count=s.nextInt();
        System.out.println("What is the limit do you want to print?");
        int limit=s.nextInt();
        int i=2;
        while(i<=limit&&count>0){
            int temp=2;
            while(temp<i){
                if (i%temp!=0){
                    temp++;
                }else{
                    break;
                }
            }
            if (temp==i){
                System.out.println(i);
                count--;
            }
            i++;

        }
    }
}