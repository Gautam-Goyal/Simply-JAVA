class NoMatchException extends Exception
{
	String msg;
	NoMatchException(String s)
	{
		msg=s;
	}
	public String toString()
	{
		return(msg);
	}
}

class MatchException
{
	void matchingString(String str) throws NoMatchException
	{
		if(str.equalsIgnoreCase("well"))
		{
			System.out.println("String matched");
		}
	}
		public static void main(String args[])
			{
				MatchException m=new MatchException();
				try
				{
					m.matchingString("Welcome");
				}
				catch(NoMatchException e)
				{
					System.out.println("In catch block");
					System.out.println(e);
				}
			}
}