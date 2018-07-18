//Default constructor is used to provide the default values to the object like 0, null etc. depending on the type.

class DefaultConstructor{
int id;
String name;
void display(){
	System.out.println(id+" "+name);
	}
public static void main (String args[]){
		DefaultConstructor dc = new DefaultConstructor();
		dc.display();
	}
}
