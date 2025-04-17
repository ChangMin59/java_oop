package user;
import java.util.List;

public class UserHobby extends User {
    // 새로운 취미 리스트가 담길 맴버 변수
    private List<String> hobbies;

    // 생성자 함수 : 초기 인스턴스 생성
    public UserHobby( String userid, String email, List<String> hobbies){
        //상위 클래스인 User를 호출해서 자동으로 1,2번째 인자값을 넘겨줌
        super(userid, email);
        //추가적인 List값만 인스턴스에 추가로 넘겨줌
        this.hobbies = hobbies;
    }
    //getter
    public List<String> getHobbies(){
        return this.hobbies;
    }
    //setter : 취미 리스트를 통채로 변경할때
    public void setHobbies(List<String> hobbies){
        this.hobbies = hobbies;
    }
    //setter : 기존 리스트 정보를 유지하면서 새로운 아이템 추가할때
    public void addHobby(String hobby){
        this.hobbies.add(hobby);
    }

    @Override
    public String getName(){
        // Sring.join("문자", List) -> 리스트를 반복돌며 "문자"로 연결해 하나의 문자열 반환
        return super.getName()+"["+String.join(",",hobbies)+"]";
    }
}