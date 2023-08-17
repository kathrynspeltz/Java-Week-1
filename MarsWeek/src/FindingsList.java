import java.lang.reflect.Array;
import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {


        Thread.sleep(500);
        System.out.println("Welcome back, I hope you had a smooth journey!");
        List<String> rocksList = new ArrayList<>();
        rocksList.add("rock");
        rocksList.add("weird rock");
        rocksList.add("smooth rock");
        rocksList.add("not rock");

        System.out.println("Everything has been downloaded: " + rocksList);
        System.out.println("Oh no, there is a non-rock on your list, let me update that....");
        rocksList.remove(3);
        System.out.println("Here is your updated list: " + rocksList);
        System.out.println("Perfect.");
        Thread.sleep(1000);

        Map<String, String> fossils = new HashMap<>();
        fossils.put("Bird", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();
        String fossilChoiceDesc = fossils.get(fossilChoice);
        System.out.println("Here is more information about " + fossilChoice + " : " + fossilChoiceDesc);
        Thread.sleep(700);

        HashSet<String> specialSupplies = new HashSet<>();
        specialSupplies.add("Alien detector");
        specialSupplies.add("Water shooter");
        specialSupplies.add("Night light");
        System.out.println("Supplies before Expedition:" + specialSupplies);
        specialSupplies.remove("Alien detector");
        System.out.println("Supplies after expedition: " + specialSupplies);


    }
}
