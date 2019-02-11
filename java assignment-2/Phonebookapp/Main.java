package Phonebookapp;
import java.util.ArrayList;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Friend f1=new Friend("raja",997878734,986699763);
	    Friend f2=new Friend("pooja",997878722,986694678);
	    Friend f3=new Friend("sahithi",987655667,87655567);
		ArrayList <Friend> li=new ArrayList<Friend>();
		li.add(f1);
		li.add(f2);
	//	System.out.println(li.get(0));
       
        //System.out.println("enter a name");
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the name to search");
        String sea=s.next();
        //System.out.println();
        for(int i=0;i<li.size();i++) {
         if(sea.equals(li.get(i))) {
          System.out.println("Number1:" +li.get(i)+" Number 2: "+li.get(i));
       
	}
        }
}
}
