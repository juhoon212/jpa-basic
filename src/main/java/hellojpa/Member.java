package hellojpa;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
//@SequenceGenerator() => sequence 수동 생성
// @Table(name = "USER") 테이블 이름이 유저이면 @Table 사용
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // @Column(name = "username") 컬럼 이름이 다르면 @Column으로 매핑 가능
    // @Column(unique = true, length = 10) DDL 생성 기능, JPA 로직 실행에 영향 x
    @Column(name = "name", nullable = false)
    private String username;

//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;
//    @Lob
//    private String description;

    //@Transient : DB랑 연관되지 않아야 하는 메모리에서만 사용할 필드(연관 x)
    //private int temp;

    public Member() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
//
//    public BigDecimal getAge() {
//        return age;
//    }
//
//    public void setAge(BigDecimal age) {
//        this.age = age;
//    }
//
//    public RoleType getRoleType() {
//        return roleType;
//    }
//
//    public void setRoleType(RoleType roleType) {
//        this.roleType = roleType;
//    }
//
//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
//
//    public Date getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(Date lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
