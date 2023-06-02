package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemberMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>();  // HashMap은 동시성 이슈가 있을 수 있음.

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
