package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cardNumber;
    private String embossName;
    private String customerName;
    private Integer documentNumber;
    private String motherName;
    private String address;
    private String city;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public String getEmbossName() {
        return embossName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
