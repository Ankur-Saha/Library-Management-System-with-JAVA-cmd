public class TeacherOperations{
	Teacher teachers[]=new Teacher[20];
	public void insertTeacher (Teacher [] t){
		for (int i=0;i<20;i++){
			teachers[i]=t[i];
		}
	}
	public void removeTeacher (int t){
		int n=t-1;
		for (int i=n;i<15;i++){
			teachers[i]=teachers[i+1];
		}
	}
	public void getTeacher (int teacherID){
		teachers[teacherID-1].showInfo();
	}
	public void showAllTeachers (){
		for (int i=0;i<20;i++){
			teachers[i].showInfo();
			System.out.println(" ");
		}
	}	
}