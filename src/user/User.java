package user;

public class User {

    //맴버변수는 정보의 틀구조 생성
    private String userid;
    private String email;

    //생성자 : 실제 인스턴스 복사 함수
    //역할 : 외부에서 전달된 인자값으로 초기 인스턴스 생성
    public User(String userid, String email) {
        this.userid = userid;
        this.email = email;
    }

    //getter : 이미 생성된 인스턴스에 접근해서 해당 정보값 확인
    public String getName(){
        return this.userid;

    }
    public String getEmail(){
        return this.email;
    }

    //setter : 이미 생성된 인스턴스의 정보값을 변경
    public void setName(String userid){
        this.userid = userid;
    }
    public void setEmail(String email){
        this.userid = email;
    }
}