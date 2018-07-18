class CopyConstructor{
	int id;
	String name;
	int age;

	CopyConstructor(){
                this.id=1;
                this.name="Not Set";
                this.age=1;
        }

	CopyConstructor(int id, String name){
                this.id=id;
                this.name=name;
        }

	CopyConstructor(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	CopyConstructor(CopyConstructor cc){
		this.id = cc.id;
		this.name = cc.name;
		this.age = cc.age;
	}

	public static void main(String args[]){
	
	
		
		
		  CopyConstructor cpp = new CopyConstructor(32,"name Constructor overloading type2",24);
		  CopyConstructor cp = new CopyConstructor(cpp);
		  CopyConstructor cp1 = new CopyConstructor();
		  CopyConstructor cp2 = new CopyConstructor(3,"constructor overloading t1");

		System.out.println(cp.id);
		System.out.println(cpp.id);
		System.out.println(cp1.id);	
		System.out.println("Success");
	}
}
