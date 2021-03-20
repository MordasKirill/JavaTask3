package net.epam.study.main;

import net.epam.study.dao.impl.XMLParserDAOImpl;
import net.epam.study.entity.Attributes;
import net.epam.study.service.validation.Validator;
import java.util.List;

public class PrintXMLParserInfo {

    public static void print(List<Attributes> attributes){
        if (!Validator.billValidator(XMLParserDAOImpl.XMLContent, XMLParserDAOImpl.patternXmlLabel)) {
            System.out.println("XML file is not correct!");
        }
        if (attributes.size()>0) {
            for (Attributes value : attributes) {
                System.out.println(value);
            }
            System.out.println("Success!");
        }else System.out.println("No match found.");
    }
}
