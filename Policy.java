public class Policy
{
   //Insurance policy attributes:
   private int policyNumber;
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
      policyNumber = 123456;
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

    public Policy(int pNum, String pName, String fName, String lName, int a, String status, double h, double w)
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

   public void setPolicyNumber(int pNum)
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

   public int getPolicyNumber()
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

   public double setHeight()
   {
      return height;
   }
   
    /**method that gets Policyholder’s Weight
   */

   public double getWeight()
   {
      return weight;
   }
   
   /**method that calculates BMI
   */

   public double getBMI()
   {
      return (weight * 703) / (height * height);
   }





}//main end