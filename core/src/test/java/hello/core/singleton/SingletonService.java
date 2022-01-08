package hello.core.singleton;

public class SingletonService {

    // static 사용
    private static final SingletonService instance = new SingletonService();

    //오직 이 메서드를 통해 인스턴스를 생성, 백번 호출해도 항상 같은 인스턴스를 생성한다.
    public static SingletonService getInstance(){
        return instance;
    }

    // 프라이빗 생성자, 외부에서 new를 사용 못한 -> 싱글톤 패턴임을 의미
    private SingletonService(){};

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
