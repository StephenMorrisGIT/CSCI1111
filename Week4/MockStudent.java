import java.util.*;

public class MockStudent
{
	public static void main(String[] args)
	{
		String Major = new String("Philosophy");
	
		String Class1 = new String("Astronomy");
		int Astronomy = 90;

		String Class2 = new String("British Literature");
		int britishLiterature = 72;
	
		String Class3 = new String("Meditation");
		int meditation = 98;
		meditation = setGrades(90);
		
		String Class4 = new String("Origin of Gangster Rap");
		int originOfGangsterRap = 94;
	
		int finalGradeAverage = calculateGrades(Astronomy, britishLiterature, meditation, originOfGangsterRap);
		System.out.println(finalGradeAverage); 
		System.out.println(""); 

		
		printGrades(Class1, britishLiterature);
		System.out.println("");
		
		printSchedule();
		System.out.println("");
		
		String finalMajor = printMajor(Major);
		System.out.println("MAJOR:   " + finalMajor);
	}
	
	public static int setGrades(int Meditation)
	{
	int newGrade = Meditation;
	newGrade = 90;
	return newGrade;

	}
	
	public static void printGrades(String Class1, int Astronomy)
	{
	String printClass1 = Class1;
	int printAstronomy = Astronomy;
	System.out.println("Class: " + printClass1 + "  Grade: " + printAstronomy);
	}
	
	/* Code for future reference
	Scanning input instead of hardcoding
	
	public static void printGrades()
	{
		System.out.println("What class would you like to edit?");
		Scanner sc = new Scanner(System.in);
		String chosenClass = sc.nextLine();
		System.out.println("Enter a grade.");
		int newGrade = sc.nextInt();
		System.out.println("Class: " + chosenClass + "    Grade: " + newGrade);
	}
	*/
	
	public static int calculateGrades(int Astronomy, int britishLiterature, int Meditation, int originOfGangsterRap)
	{
	int astronomyGrade = Astronomy;
	int britishLiteratureGrade = britishLiterature;
	int meditationGrade = Meditation;
	int originOfGangsterRapGrade = originOfGangsterRap;
	int averageGrade = (astronomyGrade + britishLiteratureGrade + meditationGrade + originOfGangsterRapGrade)/4;
	
	return averageGrade;
	}
	
	public static void printSchedule()
	{
		String Astronomy = new String("Monday and Wednesday: 11:00AM - 1:00PM");
		String britishLiterature = new String("Monday and Wednesday: 2:45PM - 5:00PM");
		String Meditation = new String("Thursday and Friday: 9:00AM - 11:00AM");
		String originOfGangsterRap = new String("Tuesday and Friday: 11:30AM - 2:30PM");
		System.out.println("ASTRONOMY -   " + Astronomy);
		System.out.println("BRITISH LITERATURE -   " + britishLiterature);
		System.out.println("MEDITATION -   " + Meditation);
		System.out.println("ORIGIN OF GANGSTER RAP -   " + originOfGangsterRap);

	}
	public static String printMajor(String Major)
	{
		String getMajor = Major;
		return getMajor;
	}
}