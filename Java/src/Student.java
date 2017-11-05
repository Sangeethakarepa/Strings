
public class Student {
	int id;
	String name,city; 
	
	public Student(int id, String name, String city){
		
	this.id=id;
	this.name=name;
	this.city=city;
	}

	public String toString(){
		return id+""+name+""+city;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1,"sangi", "Narsapur");
		
		Student s2=new Student(2,"sangeetha", "Narsapur");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
