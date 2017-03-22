package javaschool.app;

public class Record {
    private static int count = 0;
    private int id;
    private String name;
    private String phone;
    private String eMail;
    private String Address;

    public Record() {
        count++;
        id = count; //++count then count++ not needed
    }

    public int getId() { return id; }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + eMail + " " + Address + "----" + count;
    }
}

