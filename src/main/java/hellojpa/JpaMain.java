package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


// JPQL 테이블이 아닌 객체를 대상으로 검색하는 객체 지향 쿼리
public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HELLOJPA");
            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                    .setFirstResult(1) // 페이징
                    .setMaxResults(5)
                    .getResultList(); // JPQL 쿼리 제작

            for (Member member : result) {
                System.out.println("member.name = " + member.getName());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            // code
            em.close();
        }
        emf.close();

    }
}
