package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookVG {
    private List<Record> recordList = new ArrayList<>();

    @Command
    public void create(String name, String phone, String eMail, String Address) {
        Record r = new Record();
        r.setName(name);
        r.setPhone(phone);
        r.seteMail(eMail);
        r.setAddress(Address);

        recordList.add(r);
    }

    @Command
    public List<Record> list() {
        return recordList;
    }
}
