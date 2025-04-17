public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        //System.out.println(user1.name); //직접적인 접근 불가


        //setter메서드로 내부 정보 변경처리
        user1.setAge(21);

        //변경된 값을 getter메서드로 가져옴
        int userAge = user1.getAge();
        System.out.println(userAge);

        //getter, setter를 통해서 사전에 약속된 방식으로만 중요한 정보값 변경처리
    }
}