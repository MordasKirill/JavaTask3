package net.epam.study.main;

import net.epam.study.dao.impl.XMLParserDAOImpl;
import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;
import net.epam.study.service.validation.Validator;
import java.util.List;

public class PrintXMLParserInfo {

    public static void printAttributes(List<Attributes> attributesList){
        if (!Validator.billValidator(XMLParserDAOImpl.XMLContent, XMLParserDAOImpl.patternXmlLabel)) {
            System.out.println("XML file is not correct!");
        }
        if (attributesList.size()>0) {
            for (Attributes value : attributesList) {
                System.out.println(value);
            }
            System.out.println("Success!");
        }else System.out.println("No match found.");
    }
    public static void printNode(String parentNodeName, String parentNode, String childName, List<String> childNode){
        System.out.println("Parent node name: " + parentNodeName);
        System.out.println("Parent node: " + parentNode);
        System.out.println("Child node name: " + childName);
        System.out.println("Child node list: ");
        for (String element : childNode) {
            System.out.println(element);
        }
    }
}
