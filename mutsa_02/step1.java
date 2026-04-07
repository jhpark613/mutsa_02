package mutsa_02;

import java.util.Scanner;

public class step1 {
    public static void main(String[] args) {
        System.out.println("\uD83E\uDD81 아기사자 이름을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("\uD83C\uDF93 전공을 입력해주세요.");
        String major = sc.nextLine();

        System.out.println("\uD83D\uDCCC 기수를 입력해주세요.");
        int number = sc.nextInt();

        System.out.println("\uD83D\uDCCC 입력값 검증을 진행합니다.");

        if(name == null || name.isEmpty()) {
            System.out.println("❌ 이름은 비어 있을 수 없습니다.");
            return;
        }
        if(major == null || major.isEmpty() ) {
            System.out.println("❌ 전공은 비어 있을 수 없습니다.");
            return;
        }
        if(number < 1 ){
            System.out.println("❌ 기수는 1 미만일 수 없습니다.");
            return;
        }
        Lion lion = new Lion(name,major,number); //
        lion.verificationOkay();
        lion.print();
        }
        }








