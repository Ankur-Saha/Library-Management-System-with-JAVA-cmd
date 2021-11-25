public class StudentOperations{
	Student students[]=new Student[20];

	public void insertStudent (Student [] s){
		for (int i=0;i<19;i++){
			students[i]=s[i];
		}
	}
	public void removeStudent (int s){
		int n=s-1;
		for (int i=n;i<19;i++){
			students[i]=students[i+1];
		}
	}
	public void getStudent (int studentID){
		students[studentID-1].showInfo();
	}
	public void showAllStudents (){
		for (int i=0;i<19;i++){
			students[i].showInfo();
			System.out.println(" ");
		}
	}
}