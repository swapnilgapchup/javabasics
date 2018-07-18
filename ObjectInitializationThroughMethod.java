class Student{
	int id;
	String name;
	void insertInfo(int r, String n){
		this.id = r;
		this.name = n;
	}

     void displayInformation(){
		System.out.println(id+" "+name);
	}
}

public class ObjectInitializationThroughMethod{

public static void main(String args[]){
		Student s1 = new Student();
		s1.insertInfo(3,"Swapnil");
		s1.displayInformation();
	     }
}


