import user.User;
import user.UserHobby;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //CRUD (데이터 생성, 호출, 수정, 삭제)
        //클래스를 통해 초기 인스턴스 생성 (Create: 데이터 생성)
        //User 클래스를 통한 사용자 정보 인스턴스 생성
        User user1 = new User("David", "abc@naver.com");

        //인스턴스의 정보값을 변경 (Update: 데이터 수정)
        user1.setName("Andy");

        //변경된 인스턴스 정보값 호출 및 출력 (Read: 데이터 호출)
        String userName = user1.getName();
        System.out.println(userName);


        //취미 리스트 생성
        //Arrays.asList를 이용하면 리스트.add()형식으로 일일이 리스트값을 추가하는 대신 한번에 입력 가능
        //이렇게 설정된 값을 ArrayList타입으로 사용
        ArrayList<String> hobbies =  new ArrayList<>(Arrays.asList("reading","music","drawing"));

        //UserHobby 확장 클래스의 세번째 인자값으로 취미 리스트 전달
        UserHobby user2 = new UserHobby("Emily", "emily@naver.com", hobbies);
        String userNameWidthHobbies = user2.getName();
        System.out.println(userNameWidthHobbies);
    }
}


/*
    객체지향
    - 대단위 프로젝트에서 동일한 품질의 객체(인스턴스)를 대량 생상하기위한 시스템적인 틀
    - instance : 동일한 구조의 객체 (예시 :개별적인 게시글 /강제된 개별적 게시글 데이터 형식)
    - class : 인스턴스 생성하는 시스템적인 틀
    - interface : 클래스의 형식을 강제하는 설계서 (인터페이스에 기술된 메서드가 실 클래스에 없으면 에러 발생)
    - extends : 기존 클래스에 새로운 확장 클래스 연결
    - override : 기존 클래스의 특정 메서드를 덮어쓰기
*/
