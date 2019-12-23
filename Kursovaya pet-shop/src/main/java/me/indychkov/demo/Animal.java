package me.indychkov.demo;

import javax.persistence.*;


@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 64)
    private String name;
    @Column(name= "kind", length = 64)
    private String kind;
    @Column(name="price")
    private int price;

    public Animal() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
