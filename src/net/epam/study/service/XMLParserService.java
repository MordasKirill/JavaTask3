package net.epam.study.service;

import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;

import java.io.IOException;
import java.util.List;

public interface XMLParserService {
    List<Attributes> getAttributes() throws IOException;
    Node getNodeChildList(Node node) throws  IOException;
}
