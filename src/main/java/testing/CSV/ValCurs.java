package testing.CSV;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("ValCurs")
public class ValCurs {
    @XStreamAlias("Date")
    @XStreamAsAttribute
    private String date;

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;

    @XStreamImplicit(itemFieldName = "Valute")
    private List<Valute> list;


    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }


    public List<Valute> getList() {
        return list;
    }

    @Override
    public String toString() {
        return ("ValCurs \nDate " + date + "\nName " + name);
    }
}
