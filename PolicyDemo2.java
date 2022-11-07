import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class PolicyDemo2 
{   
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //read from a file
      File file = new File("PolicyInformation.txt");
      if(!file.exists())
      {
         System.out.println("Unable to open file: ");
         System.exit(0);
      }
      
      //creates a scanner object with the file object as the argument
      Scanner inputFile = new Scanner(file);
      
      //use while loop - process the file as long as I havent hit the end yet
      //hasNext() boolean return type that checks to see if any data is left
      while(inputFile.hasNext())
      {
         //prompt the user to enter information about the Policy 
         System.out.print("Please enter the Policy Number: ");
         policyNumber = inputFile.nextLine();
         System.out.print(policyNumber);
         System.out.println();
         
         System.out.print("Please enter the Provider Name: ");
         providerName = inputFile.nextLine();
         System.out.print(providerName);
         System.out.println();
      
         System.out.print("Please enter the Policyholder's First Name: ");
         firstName = inputFile.nextLine();
         System.out.print(firstName);
         System.out.println();
      
         System.out.print("Please enter the Policyholder's Last Name: ");
         lastName = inputFile.nextLine();
         System.out.print(lastName);
         System.out.println();
      
         System.out.print("Please enter the Policyholder's Age: ");
         age = inputFile.nextInt();
         System.out.print(age);
         System.out.println();
      
      
         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         System.out.print(smokingStatus);
         System.out.println();
      
         System.out.print("Please enter the Policyholder's Height (in inches): ");
         height = inputFile.nextDouble();
         System.out.print(height);
         System.out.println();
      
         System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         weight = inputFile.nextDouble();
         System.out.println(weight);
         System.out.println();
         
         if(inputFile.hasNext())
            inputFile.nextLine();//clears the new line
         if(inputFile.hasNext())
            inputFile.nextLine();//skip the blank line in the file
           
         //create a Policy object and add it to our ArrayList
         policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));

         
         

         
      }
      
    
      inputFile.close();

   }//public static void main(String[] args) throws IOException end
   
}//public class PolicyDemo2 end