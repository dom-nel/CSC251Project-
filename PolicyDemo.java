import java.util.Scanner;
import java.io.*;
<<<<<<< Updated upstream
import java.util.ArrayList;
=======
>>>>>>> Stashed changes

public class PolicyDemo 
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
<<<<<<< Updated upstream
     
      
      //read from a file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file); //Creates a scanner object with the file object as an argument
      if (!file.exists())//makes sure the file exist
      {
         System.out.println("Unable to locate file");
         System.exit(0);//exit the program early
      }

   
      //prompt the user to enter information about the Policy   
=======
      
      
      File file = new File("policyInformation.txt");
      Scanner inputFile = new Scanner(file);
      //read from a file
      //step 1 - Open the file
      
      
           
      //creates a scanner object with the file object as the argument
      
      
      //use while loop - process the file as long as I havent hit the end yet
      //hasNext() boolean return type that checks to see if any data is left
      while(inputFile.hasNext())
      {
         //prompt the user to enter information about the Policy   
>>>>>>> Stashed changes
      System.out.print("Please enter the Policy Number: ");
      policyNumber = inputFile.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = inputFile.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = inputFile.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = inputFile.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = inputFile.nextInt();
      
<<<<<<< Updated upstream
      inputFile.nextLine();
=======
>>>>>>> Stashed changes
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = inputFile.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = inputFile.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = inputFile.nextDouble();
<<<<<<< Updated upstream
=======
         
         
         
         
         System.out.println(policyNumber);
         System.out.println(providerName);
         System.out.println(firstName);
         System.out.println(lastName);
         System.out.println(age);
         System.out.println(smokingStatus);
         System.out.println(height);
         System.out.println(weight);
         
         
      }

   
      
>>>>>>> Stashed changes
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      //create a Policy object
      policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
      
      //put a blank line before the output
      System.out.println();
      
     /*display information about the Policy
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice()); */
   }
}