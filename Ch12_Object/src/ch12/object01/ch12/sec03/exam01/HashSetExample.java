package ch12.object01.ch12.sec03.exam01;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
		Student s2 = new Student(1,"홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수: " + hashSet.size());
		//해쉬코드랑 이퀄스를 오버라이드해서 같은 내용이라고 판단해서 저장된 객체수가 증가하지 않음
		
		Student s3 = new Student(2,"홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: " + hashSet.size());
	}
}
