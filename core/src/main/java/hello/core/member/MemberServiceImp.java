package hello.core.member;

public class MemberServiceImp implements MemberService{

    private final MemberRepository memberRepository = new MemberMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
