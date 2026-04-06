package mutsa_02;

public interface defaultField {
    default void defaultField(String name, String major, int number) {
        System.out.println("객체 생성이 완료");
        System.out.println("입력값 검증 완");
        System.out.println("아기사자 객체를 생성");
        System.out.println("아기사자 정보를 출력");

        System.out.println("이름:" + name + "전공:" + major + "기수" + number);
    }
}
