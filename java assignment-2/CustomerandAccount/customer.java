package CustomerandAccount;

public class customer {
int id;
String name;
char gender;
public customer(int id, String name, char gender) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}

public char getGender() {
	return gender;
}

public String toString() {
	return "customer [id=" + id + ", name=" + name + ", gender=" + gender + "]";
}


}
