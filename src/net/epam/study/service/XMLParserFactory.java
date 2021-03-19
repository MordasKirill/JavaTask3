package net.epam.study.service;

import net.epam.study.service.impl.XMLParserServiceImpl;

public final class XMLParserFactory {
    private static final XMLParserFactory instance = new XMLParserFactory();
    private final XMLParserService XMLParserService = new XMLParserServiceImpl();

    private XMLParserFactory(){}

    public XMLParserService getXMLParserService() {
        return XMLParserService;
    }

    public static XMLParserFactory getInstance() {
        return instance;
    }
}
