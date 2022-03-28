
 class Employee {
	 int age=0;
	 String name; 
	 Employee() {
		
	}
	 Employee(int age1) {
		age=age1;
	}
	 Employee(String name) {
		this.name=name;
	}
	public int ageOfEmployee()
	{
		//int age=0;
		//age=age+5;
		System.out.println(this.age);
		return this.age;
	}


}
