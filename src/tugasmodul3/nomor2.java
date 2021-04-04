/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul3;

/**
 *
 * @author user
 */
public class nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" *** BINARRY SEARCH *** "+"\n");
        
        System.out.println("Kumpulan Data nya");
        int A,angka;
        int data[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        boolean notfound =true;
        
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+"");
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("\nmasukan angka yang ingin dicari=");
        angka=sc.nextInt();
        
        int BatasAtas=data.length-1;
        int BatasBawah=0;
        
        while(notfound)
        {
            int posisiSekarang = (BatasAtas + BatasBawah)/2;
            if (data[posisiSekarang] == angka);
            {
                 notfound=false;
                 System.out.print("Angka" +angka+ "ditemukan");
            }
            else if(BatasBawah>BatasAtas);
            {
                System.out.println("angka" +angka+ "tidak ditemukan");
                break;
            }
            else
            {
                    if(data[posisiSekarang]< angka);
                    {
                    BatasBawah = posisiSekarang +1;
                    }
                    else
                    {
                    BatasAtas = posisiSekarang-1;
                    }
                    }
            }
    }
    
}
