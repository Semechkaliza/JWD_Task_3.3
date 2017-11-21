package entity;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
@XmlRootElement @XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
        "thema",
        "year",
        "country",
        "author",
        "valuable"})
public class Card {
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID private String status;
    @XmlElement(required = true)
    private String type;
    @XmlAttribute(required = true)
    private String thema;
    @XmlAttribute(required = true)
    private String country;
    @XmlAttribute(required = true)
    private String author;
    @XmlAttribute(required = true)
    private String valuable;
    @XmlElement(required = false)
    private int year;
    public Card() { } // необходим для маршаллизации/демаршалиизации XML
    public Card(String status, String thema, String type, int year,String country,String author,String valuable) {
        this.status = status;
        this.thema = thema;
        this.type = type;
        this.year = year;
        this.country=country;
        this.author=author;
        this.valuable=valuable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getValuable() {
        return valuable;
    }

    public void setValuable(String valuable) {
        this.valuable = valuable;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Card{" +
                "status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", thema='" + thema + '\'' +
                ", country='" + country + '\'' +
                ", author='" + author + '\'' +
                ", valuable='" + valuable + '\'' +
                ", year=" + year +
                '}';
    }
}