import java.util.Scanner;
class prima { 
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int bilangan, checker=0;

        System.out.println("PROGRAM BILANGAN PRIMA");
        System.out.print("Masukkan angka : ");
        bilangan = input.nextInt();

        System.out.println("------------------------");

        for (int i=2; i<=bilangan; i++)
        {
            if (bilangan%i==0)
            {
                checker++;
            }
        }
        if (checker==1)
        {
            System.out.print(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
    input.close();
    }
}

