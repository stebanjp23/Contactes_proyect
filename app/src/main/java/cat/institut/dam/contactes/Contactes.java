package cat.institut.dam.contactes;

public class Contactes {
    private int id = 0;
    private String name;
    private String username;
    private String mail;
    private String phone;
    private String website;
    private String address_street ;
    private String address_city;
    private String address_zipcode;
    private String address_geo_lat ;
    private String address_geo_ing;


    public Contactes(int id, String name, String username, String phone, String mail, String website, String address_street, String address_city, String address_zipcode, String address_geo_lat, String address_geo_ing) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.phone = phone;
        this.mail = mail;
        this.website = website;
        this.address_street = address_street;
        this.address_city = address_city;
        this.address_zipcode = address_zipcode;
        this.address_geo_lat = address_geo_lat;
        this.address_geo_ing = address_geo_ing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getAddress_zipcode() {
        return address_zipcode;
    }

    public void setAddress_zipcode(String address_zipcode) {
        this.address_zipcode = address_zipcode;
    }

    public String getAddress_geo_lat() {
        return address_geo_lat;
    }

    public void setAddress_geo_lat(String address_geo_lat) {
        this.address_geo_lat = address_geo_lat;
    }

    public String getAddress_geo_ing() {
        return address_geo_ing;
    }

    public void setAddress_geo_ing(String address_geo_ing) {
        this.address_geo_ing = address_geo_ing;
    }
}
