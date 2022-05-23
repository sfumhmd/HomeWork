package hw4Q2JavaVariables;

import java.security.Identity;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import hw2JavaBasics.MyCar;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe me = new AboutMe(); //constructor initialized
		me.myName="Alex Rogers";
		me.firstName="Alex ";
		me.lastName="Rogers";
		me.age=32;
		me.myGPA=98f;
		me.myGrade='A';
		me.imOld=true;
		me.yearBorn=1990;
		me.lotteryPrize=4546765757576l;
		me.totalCosts=675.98;
		me.mySavings= 4500;
		System.out.println("\t this is all about \"Alex\" \nalex's full name is "+me.myName+ "\nalex's age is "+me.age+"\nalex's has a high gpa of"+me.myGPA+"\nalex essay was graded"+me.myGrade+ "\nalex think he's old enough" +me.imOld+" \nalex was born on the year" +me.yearBorn);
		
		System.out.println("");
		me.aboutMe(); //method initialized
	}
}
