 public class SolarSystemDetails {
    public static void main(String[] args) {
        int panelId = 101;                  
        double energyGenerated = 12.5;      
        int numberOfPanels = 20;            
        char systemStatus = 'A';            

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
    }
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter energy generated (kWh): ");
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }
