package dev.credit.creditsystem.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;


@Entity
@AllArgsConstructor //constructor all fields
@NoArgsConstructor //constructor without fields
@Getter
@Setter
@ToString
public class Credit {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;

    public int creditLimitMultiplier = 4;   // this value set as default multiplier number
    private int creditScore;
    private int creditLimit;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    @JsonIgnore
    private User user;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private State state;
}
