package ch10.collection02.hashmap04;

/*hashmap04 패키지 아래의 클래스들을
 * HashMap 으로 변환된 클래스를
 * 사벙느로 검색/수정/삭제 기능을 추가하세요*/

public class EmployeeMain {
	public static void testInstanceOf() {
		RegularEmployee regEmp = 
				new RegularEmployee("1111", "홍길동", 7000, 3000);
		Employee emp = regEmp;
		
		if(emp instanceof RegularEmployee)
			System.out.println("emp는 RegularEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof TempEmployee)
			System.out.println("emp는 TempEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof PartTimeEmployee)
			System.out.println("emp는 ParTimeEmployee의 객체이거나"
								+ " 자식 객체입니다.");		
	}
	public static void main(String[] args) {
		EmployeeManager em = new EmployeeManager();
		em.run();
		
//		testInstanceOf();
	}
}
