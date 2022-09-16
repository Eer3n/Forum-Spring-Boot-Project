package com.be.forum.User.Entity;

import com.be.forum.Common.Entity.BaseEntity;
import com.be.forum.User.Enum.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "spring_user", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Long Id;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "MAILADDRESS")
    private String mailAddress;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "LEVEL")
    private Long level;

    @Column(name = "INS_DATE")
    private Date insDate;

    @Column(name = "IS_REGISTERED")
    private Boolean isRegistered;

    @Column(name = "USER_TYPE")
    private UserType userType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return Id != null && Objects.equals(Id, user.Id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}