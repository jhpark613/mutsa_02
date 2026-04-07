package mutsa_02;

public class Lion { // 생성자는 public이므로 메인함수에서 값 전달가능
    private String name;
    private String major;
    private int number;

    public Lion( //다른 패키지에서도 생성자 호출을 위해서 public    //객체를 생성하고 초기값 설정을 동시에 하기 위해
                 String name,
                 String major,
                 int number
    ) {
        this.name = name;    //this.name은 객체안의 변수, name은 외부에서 들어온값
        this.major = major;  //객체에 값 저장
        this.number = number; // this.number = 객체 필드 ,number = 매개변수
    }
    //public Lion(){}  //빈생성자 필요할때 1.빈 객체를 만들때 2.값 setter로 넣을때

    public void verificationOkay() {//인스턴스 메서드 객체의 상태를 출력
        System.out.println("\uD83D\uDCCC 입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
        System.out.println("⏩\uFE0F 객체 생성이 완료되었습니다.아기사자 객체의 상태를 확인합니다.");
        System.out.println("✅ 아기사자 객체를 성공적으로 생성하였습니다");
    }

    public void print() {
        System.out.println("\uD83E\uDD81 아기사자 정보를 출력합니다.");
        System.out.println("\uD83D\uDC64 이름: " + name + " | " + "\uD83C\uDF93 전공: " + major+ " | " + "\uD83D\uDCCC 기수: " + number);
    }

    public boolean verification() {
        System.out.println("✅ 객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");
        if (name == null || name.isEmpty()) {
            System.out.println("❌ 이름이 비어있습니다.");
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
            return false;
        }
        if (major == null || major.isEmpty()) {    // null값이거나 문자열이 비어있는지 확인
            System.out.println("❌ 전공이 비어있습니다");
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
            return false;
        }

        if (number < 1) {
            System.out.println("❌ 기수는 1 미만일 수 없습니다.");
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
            return false;
        }
        return true;


    }

    public void verificationPrint() {
        System.out.println("✅ 아기사자 객체가 자신의 상태를 정상으로 판단하였습니다.");

        System.out.println("\uD83D\uDC64 이름: " + name + " | " + "\uD83C\uDF93 전공: " + major + " | " + "\uD83D\uDCCC 기수: " + number);
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void publicField() {
        System.out.println("\uD83D\uDCCC Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("\uD83D\uDCCC name 필드 값을 변경합니다.");
        System.out.println("✅ public 필드 접근 성공");


    }

    private void privateField() {
        System.out.println("\uD83D\uDCCC Step 3-1. private 필드 접근을 시도합니다.");
        System.out.println("\uD83D\uDCCC name 필드 값을 변경합니다.");
        System.out.println("✅ public 필드 접근 성공");
    }
}



