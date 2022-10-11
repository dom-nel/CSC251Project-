public class Policy
{
   //Insurance policy attributes:
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //No arg constructor
   public Policy()
   {
      policyNumber = "123456";
      providerName = "Bluecross";
      firstName = "Scott";
      lastName = "Styles";
      age = 53;
      smokingStatus = "smoker";
      height = 75;
      weight = 240;
   }
   
    
   /**contrustor that accepts arguments
   @params pNum Policy Number
   @params pName Provider Name
   @params fName Policyholder’s First Name
   @params lName Policyholder’s Last Name
   @params a age
   @params h Policyholder’s Height
   @params w Policyholder’s Height
   */

    public Policy(String pNum, String pName, String fName, String lName, int a, String status, double h, double w)
   {
      policyNumber = pNum;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = status;
      height = h;
      weight = w;
   }
   
   
   
   /**method that sets Policy Number
   @params pNum Policy Number
  */

   public void setPolicyNumber(String pNum)
   {
      policyNumber = pNum;
   }
   
   
   /**method that sets Provider Name
   @params pName Provider Name
  */

   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   
   /**method that sets Policyholder’s First Name
   @params fName First Name
  */

   public void setFirstName(String fName)
   {
      firstName = fName;
   }

    /**method that sets Policyholder’s Last Name
   @params lName Last Name
  */

   public void setLastName(String lName)
   {
      lastName = lName;
   }



    /**method that sets Policyholder’s Age
   @params a Age
  */

   public void setAge(int a)
   {
      age = a;
   }

    /**method that sets Policyholder’s Smoking status
   @params status Age
  */

   public void setSmokingStatus(String status)
   {
      smokingStatus = status;
   }
   
    /**method that sets Policyholder’s Height
   @params h Height
  */

   public void setHeight(double h)
   {
      height = h;
   }
   
    /**method that sets Policyholder’s Weight
   @params w Weight
  */

   public void setWeight(double w)
   {
      weight = w;
   }
   
    
   /**method that gets Policy Number
   */

   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   
   /**method that gets Provider Name
   */

   public String getProviderName()
   {
      return providerName;
   }
   
   
   /**method that gets Policyholder’s First Name
   */

   public String getFirstName()
   {
      return firstName;
   }

    /**method that gets Policyholder’s Last Name
   */

   public String getLastName()
   {
      return lastName;
   }



    /**method that gets Policyholder’s Age
   */

   public int getAge()
   {
      return age;
   }

    /**method that gets Policyholder’s Smoking status
   */

   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
    /**method that gets Policyholder’s Height
   */

   public double getHeight()
   {
      return height;
   }
   
    /**method that gets Policyholder’s Weight
   */

   public double getWeight()
   {
      return weight;
   }
   
  //Calculates the Policyholder's BMI
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   //Calculates the Policy's price
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
   
   //Not included in the instructions but can be added...
   /*Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
   */




}//main end