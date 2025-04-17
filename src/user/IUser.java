package user;

//User클래스가 사용할 전용 틀 (클래스 전용 커스텀 타입)
//쓰는 목적 : 특정 클래스안에 약속된 메서드만 등록하기 위함
//인터페이스에는 보통 getter 메서드만 등록
//모든 getter 메서드를 등록할 필요는 없고 필요한 메서드만 등록 가능
//setter는 등록가능하지만 등록하지 않는것이 권장사항 (정보변경 가능한 메서드이기 떄문에 보안상 노출금지)
public interface IUser {
    String getName();
    String getEmail();
}
