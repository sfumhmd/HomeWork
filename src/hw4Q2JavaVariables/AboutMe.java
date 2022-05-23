package hw4Q2JavaVariables;

public class AboutMe {

	public String myName;  //variable declared
	public String firstName;  //variable declared
	public String lastName; //variable declared
	public byte age;  //variable declared
	public float myGPA; //variable declared
	public char myGrade;//variable declared
	public boolean imOld;//variable declared
	public int yearBorn;//variable declared
	public long lotteryPrize;//variable declared
	public double totalCosts;//variable declared
	public short mySavings; //variable declared

	public  String fullName = "\"Saif U Mahmud\"";
	public String dateOfBirth = "12/1/1989";
	public String address="475 lenox road";
	public byte myAge = 32;
	public float myHeight = 1.79f;
	public  String eyeColor =" brown";
	public boolean usCitizen = false;
	public double totalSavings = 39.87;
	
	
			
			
	public AboutMe() {
		System.out.println(" this is all about me"); //constructor declared 
	}

	public void aboutMe() {
		AboutMe sum =  new AboutMe();
		System.out.println( " my Biodata:  my name is " + fullName + "\t\n my birthday falls on " + dateOfBirth + "\t\n my address is " + address + "\t \n my current age is " + age + " \t\n my height is" +myHeight + "\t \n the color of my eyes are " + eyeColor +" \t\n becoming US citizen was easy:" +usCitizen);
	}
}
