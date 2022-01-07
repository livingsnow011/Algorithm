package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    //static을 안 붙이면 save, find 인스턴스가 달라 널 에러남
    private static Map<Long,Member> store = new HashMap<>();

    @Override
    public void save(Member member){
        store.put(member.getId(),member);
    };

    @Override
    public Member findById(Long memberId){
        return store.get(memberId);
    };
}
