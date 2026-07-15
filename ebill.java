import java.util.Scanner;
class ebill{
    public static void main(String[]args)
    {
        Scanner ed=new Scanner(System.in);
        System.out.println("Enter Consumer No:");
        int cn=ed.nextInt();
        ed.nextLine();
        System.out.println("Enter Consumer Name:");
        String cN=ed.nextLine();
        System.out.println("Enter Previous Reading:");
        int pr=ed.nextInt();
        System.out.println("Enter Current Reading:");
        int cr=ed.nextInt();
        ed.nextLine();
        System.out.println("Enter the Type:");
        String ty=ed.nextLine();
        int U=cr-pr;
        int bill=0;
        if (ty.equalsIgnoreCase("domestic"))
        {
            if(U<=100)
            {
                bill=0;
            }
            else if(U<=200)
            {
                bill=(U-100)*2;
            }
            else if(U<=500)
            {
                bill=(100*2+(U-200)*4);
            }
            else
            {
                bill=(100*2+300*4+(U-500)*6);
            }
        }
        else if(ty.equalsIgnoreCase("commercial"))
        {
            if(U<=100)
            {
                bill=U*2;
            }
            else if(U<=200)
            {
                bill=(100*2+(U-100)*4);
            }
            else if(U<=500)
            {
                bill=(100*2+100*4+(U-200)*6);
            }
            else
            {
                bill=(100*2+100*4+300*6+(U-500)*7);
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        System.out.println("_____EB BILL_____");
        System.out.println("Consumer Name:"+cN);
        System.out.println("Consumer Number:"+cn);
        System.out.println("Connection Type:"+ty);
        System.out.println("Unit Consumed:"+U);
        System.out.println("Bill Amount :Rs."+bill);
    }
}