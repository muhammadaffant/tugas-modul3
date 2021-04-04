package tugasmodul3;

public class nomor1 {
    public static void main(String[] args) {
        System.out.println(" *** SEQUENTIAL SEARCH *** "+"\n" );
        String data [] = {"2, 4, 6, 8, 10, 12, 14, 16, 18, 20"};
        String key;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan data yang dicari: ");
        key =scan.nextline();
                
        System.out.print("isi data adalah: ");
        for (int i = 0; i < data.length; i++) {
            
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        for(int i = 0; i <= data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("data" +key+ "berada pada index - "+ i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("*** TERIMA KASIH ***");
            }
        }