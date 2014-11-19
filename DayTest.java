package Assignment6;

public class DayTest {
	public static void main(String [] args)
	{
		Day d1 = new Day();
		Day d2 = new Day(4);
		
		d1.printDay();
		d2.printDay();
		
		d1.setDay(6);
		d2.setDay(0);
		
		d1.printDay();
		d2.printDay();
		
		System.out.println(d1.getDay());
		System.out.println(d1.getDayofWeek());
		
		System.out.println(d1.nextDay());
		System.out.println(d1.yesterday());
		
		System.out.println(d1.calculateDay(12));
		System.out.println(d2.calculateDay(-9));
		
	}
}
