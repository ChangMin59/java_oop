public class Main {
    public static void main(String[] args) {
        //CRUD (데이터 생성, 호출, 수정, 삭제)
        //클래스를 통해 초기 인스턴스 생성 (Create: 데이터 생성)
        User user1 = new User("David", "abc@naver.com");

        //인스턴스의 정보값을 변경 (Update: 데이터 수정)
        user1.setName("Andy");

        //변경된 인스턴스 정보값 호출 및 출력 (Read: 데이터 호출)
        String userName = user1.getName();
        System.out.println(userName);

    }
}