package net.epam.study.main;

import net.epam.study.dao.impl.XMLParserDAOImpl;
import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;
import net.epam.study.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class PrintXMLParserInfo {
    public static void printFormattedText() throws IOException {
        if (!Validator.billValidator(XMLParserDAOImpl.XMLContent, XMLParserDAOImpl.patternXmlLabel)) {
            System.out.println("XML file is not correct or empty!");
        }
        System.out.println("Formatted text: ");
        System.out.println(XMLParserDAOImpl.fileReader());
    }
    public static void printNode(String childName, List<String> childNode) throws IOException {
        if (!Validator.billValidator(XMLParserDAOImpl.XMLContent, XMLParserDAOImpl.patternXmlLabel)) {
            System.out.println("XML file is not correct or empty!");
        }
        System.out.println("Parent node: ");
        System.out.println(XMLParserDAOImpl.getNodeList(XMLParserDAOImpl.fileReader()));
        System.out.println("Child node name: " + childName);
        System.out.println("Child node list: ");
        for (String element : childNode) {
            System.out.println(element);
        }
    }
    public static void printAttributes(List<Attributes> attributesList){
        if (!Validator.billValidator(XMLParserDAOImpl.XMLContent, XMLParserDAOImpl.patternXmlLabel)) {
            System.out.println("XML file is not correct or empty!");
        }
        if (attributesList.size()>0) {
            for (Attributes value : attributesList) {
                System.out.println(value);
            }
            System.out.println("Success!");
        }else System.out.println("No match found.");
    }

}
