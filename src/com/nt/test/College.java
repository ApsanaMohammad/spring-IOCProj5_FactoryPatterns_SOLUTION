package com.nt.test;
import com.nt.comp.Food;
import com.nt.comp.Student;
public class College {
	public static void main(String[] args) {
		//college needs student
		Food food=new Food();
	    Student st=new Student(food);
		st.work();
	}

}
