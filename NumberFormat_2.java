public class NumberFormat_2
{
	public static void main(String args[])
	{
		try
		{
			String s = "123";
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