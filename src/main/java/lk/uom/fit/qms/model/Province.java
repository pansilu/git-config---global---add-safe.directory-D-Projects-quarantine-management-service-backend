package lk.uom.fit.qms.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Province extends AbstractEntity {

    private static final long serialVersionUID = 7299432149183634870L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(100)", unique = true, nullable = false)
    private String name;
    @Column(columnDefinition = "varchar(20)")
    private String code;

    @JsonManagedReference
    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private List<District> districts = new ArrayList<>();

    public Province(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Province() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
