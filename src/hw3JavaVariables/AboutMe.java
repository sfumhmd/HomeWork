package hw3JavaVariables;

public class AboutMe {
	public String myName; // variable declared
	public String firstName = "Saif ";
	public String lastName= "Mahmud";
	public byte age = 31;
	public float myGPA = 3.88f;
	public char myGrade = 'A';
	public boolean imOld = false;
	public int yearBorn = 1987;
	public long lotteryPrize = 69999990000000l;
	public double totalCosts = 45.99;
	public short mySavings = 31000;

	public static void main(String[] args) {
		AboutMe sm = new AboutMe();
		System.out.println(sm.myGPA); // variable initialized
		System.out.println(sm.myGrade);
		System.out.println(sm.yearBorn);
		System.out.println(sm.lotteryPrize);
		System.out.println("my full name: " +sm.firstName + sm.lastName+ " \nmy age: " + sm.age);
       
	}
}
