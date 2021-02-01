import java.util.Scanner;
public class FlowEx8 {

	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.(예 == 000000-0000000)");
		
		Scanner scanner = new Scanner(System.in); //키보드를 통해 사용자가 데이터 입력
		String regNo = scanner.nextLine(); //받은 내용을 String regNo 에 저장
		
		char gender = regNo.charAt(7); //regNo의 7번째 자리의 값을 gender 값으로 지정
		
		switch(gender) {
		case '1': case '3': //gender 값이 1,3이라면..
			System.out.println("당신은 남자입니다.");
			break;
		case '2': case '4': //gender 값이 2,4라면
			System.out.println("당신은 여자입니다.");
			break;
		default: //유효하지않는값.
			System.out.println("유효하지 않은 주민등록번호 입니다.");
		}
	}	
}
