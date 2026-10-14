package demo;
import java.util.*;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
	}
	class Mark{
		int mark;
		int average;
		Mark(int mark,int average){
			this.mark=mark;
			this.average=average;
		}
		void disp(int mark,int average) {
			System.out.println("Mark:"+mark);
			System.out.println("average:"+average);

		}
	}
}
public class ex12 {
public static void main(String[] args) {
	Student s=new Student(5,"sam");
	Student.Mark m=s.new Mark(68,55);
	m.disp(68,55);
}
}
