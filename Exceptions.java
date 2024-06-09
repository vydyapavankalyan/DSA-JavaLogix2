class UserException extends Exception
{
	String name;
	public  UserException(String name)
	{
		this.name=name;
	}
	public String getMessage()
	{
		return this.name;
	}
}
class Exceptions
{
	public static void main(String args[])
	{
		try
		{
			UserException ue=new UserException("Error");
			throw ue;
		}
		catch(UserException u)
		{
			System.out.println(u.getMessage());
		}
	}
}