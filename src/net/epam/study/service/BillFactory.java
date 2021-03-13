package net.epam.study.service;

import net.epam.study.service.impl.BillServiceImpl;

public final class BillFactory {
    private static final BillFactory instance = new BillFactory();
    private final BillService billService = new BillServiceImpl();

    private BillFactory(){}

    public BillService getBillService() {
        return billService;
    }

    public static BillFactory getInstance() {
        return instance;
    }
}
