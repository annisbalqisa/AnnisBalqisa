import java.util.Scanner;
public class BinarySearch {
    public static int[] data = null;
    public static int awal, tengah, akhir, temp, count;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah data : ");        
        int jumlah = input.nextInt();
        
        data = new int[jumlah];
        for(int x = 0; x < data.length; x++){
            System.out.print("Masukkan Nilai Data ke-"+(x+1)+" : ");    
            data[x] = input.nextInt();
        }

        sorting();

        System.out.print("\nData yang ingin dicari : ");        
        int cari = input.nextInt();
        
        System.out.println();
        boolean temu = false;
        awal = 0;
        akhir = data.length - 1;
        temp = 0;
        count = 0;
        int iterasi = 0;
        while(temu != true)
        {                                
            tengah = (awal + akhir) / 2;
            iterasi++;
            
            if(data[tengah] == cari)
            {
                temu = true;
                    break;
            }
            
            else if(data[tengah] < cari)
            {
                awal = tengah + 1;
                
            }
                
            else if(data[tengah] > cari)
            {
                akhir = tengah - 1;
            }
            
            if(temp != data[tengah])
                temp = data[tengah];
            else
                count++;
            
            if(count == 3)
                break;
        }
        
        if(temu == true)
            System.out.println("\nData "+cari+" ditemukan pada index ke-"+tengah+"\n"+
            "dan Iterasi ke-"+iterasi);
        
        else
            System.out.println("\nData "+cari+" tidak ditemukan");
            
    }
    
    public static void sorting()
    {
        int temp = 0;
        for(int x = 0; x < data.length; x++)
        {
            for(int y = 0; y < data.length; y++)
            {
                if(x == y)
                    continue;
                
                else
                {
                    if(data[x] < data[y])
                    {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;
                        
                    }
                }
            }
        }
    }
}

