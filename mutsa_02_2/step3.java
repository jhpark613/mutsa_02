package mutsa_02_2;

import mutsa_02.Lion;

import java.util.Scanner;

public class step3 {
    public static void main(String[] args) {
        System.out.println("아기사자 이름을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("전공을 입력해주세요.");
        String major = sc.nextLine();

        System.out.println("기수를 입력해주세요.");
        int number = sc.nextInt();

        Lion lion = new Lion(name,major,number);


        lion.setName("홍길동");
        lion.setMajor("컴퓨터공학과");
        lion.setNumber(14);

        if(lion.verification()){
            lion.publicField();
        }

        /*if(lion.verification()) {
            lion.privateField();
        } */
        //private로 인한 오류 발생






    }


}
