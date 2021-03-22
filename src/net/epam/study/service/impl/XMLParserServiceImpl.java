package net.epam.study.service.impl;

import java.io.IOException;
import java.util.List;

import net.epam.study.dao.impl.XMLParserDAOImpl;
import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;
import net.epam.study.service.validation.Validator;
import net.epam.study.dao.XMLParserDAO;
import net.epam.study.dao.DAOFactory;
import net.epam.study.service.XMLParserService;

public class XMLParserServiceImpl implements XMLParserService {
    @Override
    public Node getNodeChildList(Node node) throws IOException {
        DAOFactory factory = DAOFactory.getInstance();
        XMLParserDAO XMLParserDAO = factory.getXMLParserDAO();
        XMLParserDAOImpl.fileReader();
        XMLParserDAOImpl.getNodeList(XMLParserDAOImpl.fileReader());
        return XMLParserDAO.getNodeChildList(XMLParserDAOImpl.getNodeList(XMLParserDAOImpl.fileReader()));
    }
    @Override
    public List<Attributes> getAttributes() throws IOException {
        DAOFactory factory = DAOFactory.getInstance();
        XMLParserDAO XMLParserDAO = factory.getXMLParserDAO();
        XMLParserDAOImpl.fileReader();
        XMLParserDAOImpl.getNodeList(XMLParserDAOImpl.fileReader());
        //XMLParserDAOImpl.getNodeChildList(XMLParserDAOImpl.getNodeList(XMLParserDAOImpl.fileReader()));
        if (!Validator.billValidator((XMLParserDAOImpl.XMLContent), XMLParserDAOImpl.patternXmlLabel)) {
            return null;
        }
        return XMLParserDAO.getAttributes();
    }
}
