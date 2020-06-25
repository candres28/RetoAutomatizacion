package models;

public class Data {

    private String firstname;
    private  String valuefirst;
    private String lastname;
    private String valuelastname;
    private String gender;
    private String valuegender;
    private String email;
    private String valueemail;
    private String phone;
    private String valuephone;

    public Data(String firstname, String valuefirst, String lastname, String valuelastname, String gender, String valuegender, String email, String valueemail, String phone, String valuephone) {
        this.firstname = firstname;
        this.valuefirst = valuefirst;
        this.lastname = lastname;
        this.valuelastname = valuelastname;
        this.gender = gender;
        this.valuegender = valuegender;
        this.email = email;
        this.valueemail = valueemail;
        this.phone = phone;
        this.valuephone = valuephone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getValuefirst() {
        return valuefirst;
    }

    public String getLastname() {
        return lastname;
    }

    public String getValuelastname() {
        return valuelastname;
    }

    public String getGender() {
        return gender;
    }

    public String getValuegender() {
        return valuegender;
    }

    public String getEmail() {
        return email;
    }

    public String getValueemail() {
        return valueemail;
    }

    public String getPhone() {
        return phone;
    }

    public String getValuephone() {
        return valuephone;
    }
}
