

	import java.util.HashMap;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class MapStudentClass {

		public static void main(String[] args) {
			
			Student E1 = new Student(11, "Yuva", "Raja", "BScCS");
			Student E2 = new Student(12, "Ravi", "Kumar", "BCA");
			Student E3 = new Student(13, "Parthi", "Ban", "BCom");
			Student E4 = new Student(14, "Ranga", "Prabhu", "BBA");
			Student E5 = new Student(15, "Vasanth", "Kumar", "BA");

			HashMap<Integer, Student> Stu = new HashMap<Integer, Student>();

			Stu.put(1, E1);
			Stu.put(2, E2);
			Stu.put(3, E3);
			Stu.put(4, E4);
			Stu.put(5, E5);

			for (HashMap.Entry<Integer, Student> enter : Stu.entrySet()) {
				int key = enter.getKey();
				Student E = enter.getValue();
				System.out.println(key+"Stu Detail:-");
				System.out.println(E.RollNum +  " " + E.FirstName + E.LastName +  " " + E.Department);
				System.out.println();
			}

			File Stufile = new File("C:\\Users\\WELCOME\\Desktop\\Student1file.txt");
				//Stufile.mkdir();
				//System.out.println(Stufile);

			try {
				if (Stufile.exists()==false) {
					Stufile.createNewFile();
					System.out.println("File create successfully");
				} else {
					System.out.println("Already exists");
				}
				// System.out.println(Stufile1.length());

				if (Stufile.canWrite()) {

					FileWriter writting = new FileWriter(Stufile);
					for (HashMap.Entry<Integer, Student> enter : Stu.entrySet()) {
						int key = enter.getKey();
						Student e = enter.getValue();
						writting.write(e.RollNum +  " " +  e.FirstName + e.LastName+ " " + e.Department+"\n");
					}
					writting.close();
				}

			} catch (IOException e) {
				
				e.printStackTrace();
			}

		}
	
	}
	

