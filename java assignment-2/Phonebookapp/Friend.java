package Phonebookapp;
import java.util.ArrayList;

public class Friend {
	String friendName;
	long Mnumber1;
	long Mnumber2;
	public Friend(String friendName, long mnumber1, long mnumber2) {
		super();
		this.friendName = friendName;
		Mnumber1 = mnumber1;
		Mnumber2 = mnumber2;
	}
	@Override
	public String toString() {
		return "Friend [friendName=" + friendName + ", Mnumber1=" + Mnumber1 + ", Mnumber2=" + Mnumber2 + "]";
	}
	
	
	
}
