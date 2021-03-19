package net.epam.study.main;

import net.epam.study.entity.Attributes;
import net.epam.study.service.XMLParserFactory;
import net.epam.study.service.XMLParserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {
        List<Attributes> node = new ArrayList<>();
        XMLParserFactory factory = XMLParserFactory.getInstance();
        XMLParserService service = factory.getXMLParserService();
        node = service.getAttributes();
        PrintXMLParserInfo.print(node);
    }
}
