import java.util.ArrayList;
import java.util.Scanner;
public class city
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        ArrayList<String> city=new ArrayList<>();
        city.add("Chennai");
        city.add("Madurai");
        city.add("Trichy");
        System.out.println("The initial list:"+city);
        System.out.println("Enter a city to add");
        String city_add=in.next();
        city.add(city_add);
        System.out.println("Updated list:"+city);
        System.out.println("Enter the city to insert");
        String newcity=in.next();
        System.out.println("Give the index to add the new city ");
        int index=in.nextInt();
        city.add(index,newcity);
        System.out.println("Updated list:"+city);
        System.out.println("Enter the city to search ");
        String sercity=in.next();
        for (int i =0;i<city.size();i++)
        {
            if (sercity.equals(city.get(i)))
            
                System.out.println("City found at index "+i);
            
        }
        System.out.println("Enter the character");
        char c=in.next().charAt(0);
        ArrayList<String> list=new ArrayList<>();
        for (int i =0;i<city.size();i++)
        {
            String str = city.get(i);
            if (str.charAt(0)==c)
            list.add(str);
        }
        System.out.println("Cities starting with '"+c+"':"+list);
    }
}