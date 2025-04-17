public class User {
    private String name = "david";
    private int age = 20;

    // 생성자 constructor : new 연산자로 인스턴스 생서시 자동으로 실행되는 생성자 안쪽의 함수
    // 클래스에서 인스턴스 생성시 전달되는 인자가 생성자함수 내부로 전달
    public User() {
        //System.out.println(name);
        //System.out.println(age);
    }

    //getter(클래스 내부정보 가져오기), setter(내부 정보 수정)
    //내부 정보값을 가져오는 getter
    public int getAge(){
        return age;
    }

    //내부 정보값을 변경하는 setter
    public void setAge(int num){
        age = num;
    }
}