import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDepartureAndDestination {

    public static String[] find(List<List<String>> passes) 
    {
        Set<String> src  = new HashSet<String> (); 
        Set<String> dest = new HashSet<String> (); 
        
        for(int i=0;i<passes.size();i++)
        {
            src.add(passes.get(i).get(0) );
            dest.add(passes.get(i).get(1));
        }
         
        Set<String> intersection = new HashSet<String>(src);
        intersection.retainAll(dest);
        
        src.removeAll(intersection);
        dest.removeAll(intersection);

        String[] r = { src.toArray(new String[0])[0] , dest.toArray(new String[0])[0] };

        return r;
        
    }

    public static void main(String[] args) 
    {
        List<List<String>> boardingPass = new ArrayList<>();
        
        List<String> bp1 = new ArrayList<>();
        bp1.add("Dallas"); bp1.add("New York");
        boardingPass.add(bp1);
       
        List<String> bp2 = new ArrayList<>();
        bp2.add("Houston"); bp2.add("Berlin");
        boardingPass.add(bp2);
      
        List<String> bp3 = new ArrayList<>();
        bp3.add("Austin");bp3.add("Dallas");
        boardingPass.add(bp3);
        
        List<String> bp4 = new ArrayList<>();
        bp4.add("New York");bp4.add("Seattle");
        boardingPass.add(bp4);
        
        List<String> bp5 = new ArrayList<>();
        bp5.add("Seattle");bp5.add("Houston");
        boardingPass.add(bp5);
        
        List<String> bp6 = new ArrayList<>();
        bp6.add("Tokyo");bp6.add("Austin");
        boardingPass.add(bp6);
        
        String[] r;
        
        r = find(boardingPass);
        System.out.println("Departure: " + r[0] + ", Destination: " + r[1]);
        
    }
}
