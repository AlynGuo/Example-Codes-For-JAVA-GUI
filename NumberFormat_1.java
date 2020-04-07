public class NumberFormat_1
{
	public static void(String args[])
	{
		try
		{
			String s = "onetwothree";
			int i = Integer.parseInt(s);
			i++;
			
			System.out.println("int value = " + i);
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("cannot convert string value to integer");
		}
	}
}