import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter 2 string :");
        String s1 = sn.nextLine();
        String s2 = sn.nextLine();
        sn.close();
        if(s1.length()!=s2.length()){
            System.out.println("Not an anagram");
            return;
        }
        int c1;int c2;
        
        s1.toLowerCase();
        s2.toLowerCase();



        for(int i=97;i<=122;i++)
        {
            c1=c2=0;

         for(int j=0;j<s1.length();j++)
         {
            char a1=s1.charAt(j);
            char a2=s2.charAt(j);
            if(a1==i)
            c1++;
            if(a2==i)
            c2++;
         }
    

         if(c1!=c2)
         {
             System.out.println("Not amagram");
             return;
         }
        }
    
    System.out.println("Anagram");
     }
}





        
    
        
       



       

        
    


