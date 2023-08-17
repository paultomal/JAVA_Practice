import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> internJob = new HashMap<>(); //1st String is key, 2nd String is Value

        internJob.put("FrontEnd ",1);
        internJob.put("BackEnd1", 2);
        internJob.put("BackEnd2 ",3);
        internJob.put("IOSDev ", 4);

        System.out.println(internJob);
        System.out.println(internJob.get("FrontEnd ")); //specific kono key er value chaile
        System.out.println(internJob.containsKey("IOSDev "));
        System.out.println(internJob.containsValue(2));
        internJob.putIfAbsent("FlutterDev", 3);
        System.out.println(internJob);

        //To Print All the Key
        Set<String> keys = internJob.keySet();
        System.out.println("All the keys are: ");
        for(String i : keys){

            System.out.println(i + ": " +internJob.get(i));
        }


    }
}