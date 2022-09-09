public class Circle
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

   public Circle()
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
   
    public Circle(double pNum, String pName, String fName, String lName, int a, String status, double h, double w)
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


}//main end