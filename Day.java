

public class Day {
	
	private int day;
	String [] days = {"sun","mon","tue","wed","thu","fri","sat"};
	
	public Day()
	{
		day = 0;
	}
	public Day(int day)
	{
		this.day = day;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	public int getDay()
	{
		return day;
	}
	public String getDayofWeek()
	{
		return days[day];
	}
	
	public String nextDay()
	{
		if(day == 6)
		{
			return days[0];
		}
		return days[day+1];
	}
	public String yesterday()
	{
		if(day == 0)
		{
			return days[6];
		}
		return days[day-1];
	}
	public void printDay()
	{
		System.out.println(days[day]);
	}
	
	public String calculateDay(int change)
	{
		if(change < 0)
		{
			int numDays = change/-7 + 1;
			change = change + numDays*7-1;
		}
		return days[(day + change) % 7];
	}
}
