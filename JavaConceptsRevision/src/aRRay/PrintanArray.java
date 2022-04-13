package aRRay;

import java.util.Arrays;

public class PrintanArray {

	public static void main(String[] args) {
		
		   
		        Student[] students = {new Student("John"), new Student("Doe")};
		        
		        System.out.println(Arrays.toString(students));
		        // output: [Student{name='John'}, Student{name='Doe'}]
		    }
		}

		class Student {
		    private String name;

		    public Student(String name){
		        this.name = name;
		    }

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    @Override
		    public String toString() {
		        return "Student{" + "name='" + name + '\'' + '}';
		    }
		

	}


