package mutsa_02;

import java.util.Scanner;

public class step2 {
    static void main(String[] args) {
        System.out.println("\uD83E\uDD81 아기사자 이름을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("\uD83C\uDF93 전공을 입력해주세요.");
        String major = sc.nextLine();

        System.out.println("\uD83D\uDCCC 기수를 입력해주세요.");
        int number = sc.nextInt();

        Lion lion = new Lion(name, major,number); //lion 객체 생성, 매개변수에 값 초기화를 위해

        if(lion.verification()){ //조건확인하면서 실행
            lion.verificationPrint();
        }


    }
}



