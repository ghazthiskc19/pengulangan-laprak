public class hurufBintang {
    public static void main(String[] args) {
        for(int i = 0; i < 12; i++){
            // Huruf G
            for(int g = 0; g < 5; g++){
                if(i == 0 || i == 4){
                    if(g > 0 && g < 4){
                        System.out.print("G ");
                    }else{
                        System.out.print("  ");
                    }
                }else if(i == 1){
                    if(g == 0){
                        System.out.print("G ");
                    }
                }else if(i == 2){
                    if(!(g == 1)){
                        System.out.print("G ");
                    }else{
                        System.out.print("  ");
                    }
                }else if(i == 3){
                    if(g == 0){
                        System.out.print("G ");
                    }else if (g == 4) {
                        System.out.print("G");
                        
                    }else{
                        System.out.print("  ");
                    }
                }else if(i > 5 && i < 11){
                    if(!(i == 8)){
                        if(g == 0){
                            System.out.print("H ");
                        }else if (g == 4) {
                            System.out.print("H");
                            
                        }else{
                            System.out.print("  ");
                        }
                    }else{
                        if(g == 4){
                            System.out.print("H");
                        }else{
                            System.out.print("H ");
                        }
                    }
                }
            }
            System.out.println(" ");
        }

        for(int a = 1; a <= 5; a++){
            for(int b = 0; b < 10; b++){
                if(b == 5 - a  || b == a + 3){
                    System.out.print("A");
                }
                else if(b > 1 && b < 7 && a == 4){
                    if(b % 2 == 1){
                        System.out.print("A");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
