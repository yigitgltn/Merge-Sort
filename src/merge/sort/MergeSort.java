
package merge.sort;

import java.util.Scanner;

public class MergeSort {

    public static void MergeSort(int [] dizi , int baslangic ,int bitis){
        int p = baslangic;
        int r = bitis;
        
        if(p>=r){
            return;
        }
        
        int q =(p+r)/2;
        
        MergeSort(dizi, p, q);
        MergeSort(dizi,q+1,r);
        
        int basinSonu = q;
        int sonunBasi = q+1;
        
        while((p<=basinSonu)&&(sonunBasi<=r)){
            System.out.println("* dizi["+p+"]: "+dizi[p]);
            System.out.println("* dizi["+sonunBasi+"]: "+dizi[sonunBasi]);
            
            if(dizi[p]<dizi[sonunBasi]){
                System.out.println("* "+dizi[p]+" < "+dizi[sonunBasi]+" oldugu icin yer degistirilmedi.");
                p++;
            }else{
                System.out.println("* "+dizi[p]+" > "+dizi[sonunBasi]+" oldugu icin " +dizi[sonunBasi]+
                        " alinir ve dizide "+p+ ". yere koyulur.");
                int Temp = dizi[sonunBasi];
                
                for(int k = sonunBasi-1;k>=p;k--){
                    dizi[k+1] = dizi[k];
                }
                dizi[p]=Temp;
                sonunBasi++;
                basinSonu++;
                p++;
                System.out.println("");
                
                for(int k=0;k<dizi.length;k++){
                    System.out.print(dizi[k]+" | ");
                }
            
                System.out.println("");
                System.out.println("");
                
            }
            
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç elemanlı = ");
        int max = scan.nextInt();

        int[] dizi = new int[max];
        
        System.out.println("Siralanacak dizi:");
        
        for(int i=0; i<dizi.length ;i++){
            dizi[i] = (int)(Math.random()*100);
            System.out.print(dizi[i]+" | ");
        } 
        System.out.println("");
        System.out.println("");
      
        int baslangic = 0;
        int bitis = dizi.length-1;
        
        MergeSort(dizi,baslangic,bitis);
        
        System.out.println("");
        
        System.out.println("Yeni dizi: ");

        for(int m=0 ; m<dizi.length ;m++){
            System.out.print(dizi[m]+" | ");
        }
    }
    
}
