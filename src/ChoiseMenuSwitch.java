import java.util.*;
public class ChoiseMenuSwitch {

	public static void main(String[] args) {

		int menu=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1. 피자");
		System.out.println("2. 햄버거");
		System.out.println("3. 치킨");
		System.out.println("4. 볶음밥");
		System.out.print("번호를 입력하세요: ");
		menu=sc.nextInt();
		switch(menu)
		{
		case 1: System.out.println("당신은 피자를 고르셨습니다.");
				break;
		case 2: System.out.println("당신은 햄버거를 고르셨습니다.");
		break;
		case 3: System.out.println("당신은 치킨를 고르셨습니다.");
		break;
		case 4: System.out.println("당신은 볶음밥를 고르셨습니다.");
		break;
		
		default:
				System.out.println("잘못 누르셨습니다.");
		}
		
		
	}

}
