import java.util.Scanner;
public class VolumeBidang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean repeated = true;
        
        while(repeated) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            int n = input.nextInt();
            
            switch (n) {
                case 0:{
                    repeated = false;
                    System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
                    break;
                }
                case 1:{
                    System.out.print("Nilai panjang : ");
                    int p = input.nextInt();
                    
                    System.out.print("Nilai lebar : ");
                    int l = input.nextInt();
                    
                    System.out.print("Nilai tinggi : ");
                    int t = input.nextInt();
                    
                    int volume = p * l * t;
                    System.out.printf("VOLUME BALOK DENGAN P: %dcm, L: %dcm, T: %dcm adalah %dcm", p, l, t, volume);
                    break;
                }case 2:{
                    System.out.print("Nilai jari-jari : ");
                    int r = input.nextInt();
    
                    double volume = 4 / 3 * Math.PI * (r*r*r);  
                    System.out.printf("VOLUME BOLA DENGAN RADIUS: %d adalah %.3fcm", r, volume);
                    break;
                }case 3:{
                    System.out.print("Nilai jari-jari : ");
                    int r = input.nextInt();
    
                    System.out.print("Nilai tinggi kerucut : ");
                    int t = input.nextInt();
    
                    double volume = (double) 1 / 3 * Math.PI * (r * r * t); 
                    System.out.printf("VOLUME KERUCUT DENGAN RADIUS: %dcm adalah %.3fcm", r, volume);
                    break;
                }case 4: {
                    System.out.print("Nilai jari-jari : ");
                    int r = input.nextInt();
    
                    System.out.print("Nilai tinggi silinder : ");
                    int t = input.nextInt();
    
                    double volume = Math.PI * r * r * t;  
                    System.out.printf("VOLUME SILINDER DENGAN RADIUS: %d adalah %.3fcm", r, volume);
                    break;
                }case 5: {
                    System.out.print("Nilai Tinggi segitiga : ");
                    int a = input.nextInt();
    
                    System.out.print("Nilai alas segitiga : ");
                    int b = input.nextInt();
    
                    System.out.print("Nilai tinggi limas : ");
                    int t = input.nextInt();
    
                    double volume = (double) 1 / 3 * ((a * b) / 2 ) * t;  
                    System.out.printf("VOLUME LIMAS SEGITIGA : %.3fcm", volume);
                }
            }
            System.out.println("");
        }
    }
}
