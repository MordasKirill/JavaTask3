package net.epam.study.main;

import net.epam.study.dao.impl.XMLParserDAOImpl;
import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;
import net.epam.study.service.XMLParserFactory;
import net.epam.study.service.XMLParserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {
        List<Attributes> attributesList;
        Node node;
        XMLParserFactory factory = XMLParserFactory.getInstance();
        XMLParserService service = factory.getXMLParserService();
        node = service.getNodeChildList(XMLParserDAOImpl.getNodeList(XMLParserDAOImpl.fileReader()));
        attributesList = service.getAttributes();
        PrintXMLParserInfo.printFormattedText();
        PrintXMLParserInfo.printNode(node.getChildNodeName(), node.childNode);
        PrintXMLParserInfo.printAttributes(attributesList);
    }
}
