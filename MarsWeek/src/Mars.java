public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Greenville";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        double newMeals = (meals - ((shipPopulation * .75) *2));
        System.out.println(newMeals);
        newMeals = newMeals * 1.5;
        System.out.println(newMeals);
        shipPopulation += 5;
        String landingLocation = "The Ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        landing =  landingCheck(10);
    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute < minutesLeft; minute++){
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}