
package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.berinle.adapter.CustomAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (com.berinle.adapter.CustomAdapter.printDate(value));
    }

}
