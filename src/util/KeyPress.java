package util;

public class KeyPress {
    public static void pressKeyToContinue() {
        System.out.println("\nPressione enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
