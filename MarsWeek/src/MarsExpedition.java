import java.util.Map;
import java.util.Scanner;
import static java.util.Map.entry;
public class MarsExpedition {

    public MarsExpedition() throws InterruptedException {

            System.out.println("Welcome to the Mars Expedition program");
            Thread.sleep(250);
            System.out.println("Systems are firing up for your adventure");
            Thread.sleep(250);
            System.out.println("All systems are ready");
            System.out.println("What is your name?");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Hi, " + name + " Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N”");
            String ready = input.nextLine();
            if (ready.equals("Y")) {
                System.out.println("I knew you would say that. You are team leader for a reason.");
            } else if (ready.equals("N")) {
                System.out.println("Too bad you are team leader. You have to go.");
            }

            System.out.println("How many people would you like on your team?");
            int teamSize = input.nextInt();
            input.nextLine();
            if (teamSize > 2) {
                System.out.println("That’s way too many people. We can only send 2 more members.");
                teamSize = 2;
            } else if (teamSize == 2) {
                System.out.println("That is the exact size you need!");
            } else {
                System.out.println("Sorry, the team actually needs to be a total size of 3, you need to bring 2 members " +
                        "with you");
                teamSize = 2;
            };
            System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
            String snack = input.nextLine();
            System.out.println("Nice choice! You will be bringing " + snack + " with you.");
            Map<Integer, String> mapChoices =
                    Map.ofEntries(
                            entry(1, "Zodiac Zoomer"),
                            entry(2, "Astroid Avoider"),
                            entry(3, "Star Shooter")
                    );
            System.out.println("Next, you will need to choose a vehicle:");
            System.out.println(mapChoices);
            System.out.println("What is the number of the vehicle you would like to choose? (1-3)");
            int vehicle = input.nextInt();
            input.nextLine();
            String vehicleName = mapChoices.get(vehicle);
            System.out.println("Oh yes, the " + vehicleName + " is a good choice!");
            System.out.println(name + " I must say, I am so excited for your journey! Your team of " + teamSize + " will have so much fun flying the " + vehicleName + " while munching on " + snack);
            System.out.println("Get ready to go! In....");
            System.out.println("3");
            Thread.sleep(250);
            System.out.println("2");
            Thread.sleep(250);
            System.out.println("1");
            Thread.sleep(250);
            System.out.println("Blast off!!");

        }


}