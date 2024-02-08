package ch12.object01.ch12.sec03.exam01;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
		//
	}
}
//투스트링 컨트롤 에스하면 나옴
