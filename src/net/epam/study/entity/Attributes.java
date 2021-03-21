package net.epam.study.entity;

import java.math.BigDecimal;
import java.util.List;

public class Attributes {
    String nodeName;
    String attributeName;
    String attributeValue;

    public Attributes(){
        super();
    }
    public Attributes(String nodeName, String attributeName, String attributeValue){
        this.nodeName = nodeName;
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "Attributes of node '" + nodeName + '\'' + " [" +
                "attributeName='" + attributeName + '\'' +
                ", attributeValue='" + attributeValue + '\'' + ']';
    }
}
