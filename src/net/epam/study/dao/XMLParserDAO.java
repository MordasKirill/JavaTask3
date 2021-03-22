package net.epam.study.dao;

import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;

import java.util.List;

public interface XMLParserDAO {
    Node getNodeChildList(Node node);
    List<Attributes> getAttributes();

}
