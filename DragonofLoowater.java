import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class DragonofLoowater {
    public static void main(String args[]){
        ArrayList<Integer> dragon = new ArrayList<Integer>();
        ArrayList<Integer> knight = new ArrayList<Integer>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        int loop;
        int total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan jumlah Dragon (1 - 20000) : ");
            loop = input.nextInt();
          }
          while (loop < 1 || loop > 20000);
        
        for (int i=0;i<loop;i++){
            System.out.print("Masukkan Diameter Dragon ke-"+(i+1)+" : ");
            dragon.add(input.nextInt());
        }

        do {
            System.out.print("Masukkan jumlah Knight (1 - 20000) : ");
            loop = input.nextInt();
          }
          while (loop < 1 || loop > 20000);
        
        for (int i=0;i<loop;i++){
            System.out.print("Masukkan Tinggi Knight ke-"+(i+1)+" : ");
            knight.add(input.nextInt());
        }
        Collections.sort(dragon);
        Collections.sort(knight);
        System.out.println("=======================================");
        System.out.print("Dragon : [");
        for(Integer dragon1:dragon) {
            System.out.print(dragon1+",");
        }
        System.out.print("] , Knight : [");
        for(Integer knight1:knight) {
            System.out.print(knight1+",");
        }
        System.out.print("]");
        System.out.println("");



        for (int i = 0; i < dragon.size(); i++){
            for (int j = 0; j < knight.size(); j++){             
                if (knight.get(j) == dragon.get(i)){
                    total += knight.get(j);
                    knight.remove(j);
                    dragon.remove(i);
                    break;
                } else {
                    continue;
                }
            }
        }

        for (int i = 0; i < dragon.size(); i++){
            for (int j = 0; j < knight.size(); j++){
                if (knight.get(j) > dragon.get(i)){
                    total += knight.get(j);
                    knight.remove(j);
                    dragon.remove(i);
                    break;
                } else {
                     continue;
            }
            }
        }

        if (dragon.size() == 0) {
            System.out.println("Knight Win");
            System.out.println("Total Knight minimum yang dibutuhkan : "+total);
        }else {
            System.out.println("Knight Fall!!");
        }
    }
}