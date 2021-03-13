package net.epam.study.dao;

import net.epam.study.dao.impl.BillDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final BillDAO billDAO = new BillDAOImpl();

    private DAOFactory(){}

    public BillDAO getBillDAO(){
        return billDAO;
    }

    public static DAOFactory getInstance(){
        return instance;
    }
}
