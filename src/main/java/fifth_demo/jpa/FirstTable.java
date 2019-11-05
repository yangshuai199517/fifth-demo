package fifth_demo.jpa;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="firsttable1")
@Data
@NoArgsConstructor
public class FirstTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 20)
    private String name;

    @Column(name = "age")
    private Long age;

    public FirstTable(String name,Long age){
        this.age = age;
        this.name=name;
    }

}
