package SA1Sundus;
import java.util.ArrayList;
public class Bank {
private ArrayList<Profile>users ;
public Bank()
{
	this.users=new ArrayList<>();
	}
public void addUser (Profile user)
{
	users.add(user);
}
public Profile getUser(String Username)
{
	Profile user;
	for(int i=0;i<users.size();i++)
	{
		user=users.get(i);
		if(user.getUsername().equals(Username))
		{
			return user;
		}
	}
	return null;
	
}

public Profile login(String username, String password)
{
	Profile user=getUser(username);
	if(user!=null&&user.getPassword()==password);
	{
		return user;
	}
	
}

}
