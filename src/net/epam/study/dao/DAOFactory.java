package net.epam.study.dao;

import net.epam.study.dao.impl.XMLParserDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final XMLParserDAO XMLParserDAO = new XMLParserDAOImpl();

    private DAOFactory(){}

    public XMLParserDAO getXMLParserDAO(){
        return XMLParserDAO;
    }

    public static DAOFactory getInstance(){
        return instance;
    }
}
