package dev.credit.creditsystem.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Credit creditInfo;

    @Range(min = 10000000000L,max = 99999999999L)
    private long identityNumber;
    private long phoneNumber;
    @NotBlank
    private String fullName;
    @Range()
    private int salary;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (identityNumber != user.identityNumber) return false;
        if (salary != user.salary) return false;
        if (phoneNumber != user.phoneNumber) return false;
        if (!Objects.equals(id, user.id)) return false;
        if (!Objects.equals(creditInfo, user.creditInfo)) return false;
        return Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (creditInfo != null ? creditInfo.hashCode() : 0);
        result = 31 * result + (int) (identityNumber ^ (identityNumber >>> 32));
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        return result;
    }

}
