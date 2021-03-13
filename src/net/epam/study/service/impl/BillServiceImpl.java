package net.epam.study.service.impl;

import java.io.IOException;
import java.util.List;
import net.epam.study.service.validation.Validator;
import net.epam.study.dao.BillDAO;
import net.epam.study.dao.DAOFactory;
import net.epam.study.dao.impl.BillDAOImpl;
import net.epam.study.entity.Bill;
import net.epam.study.service.BillService;

public class BillServiceImpl implements BillService {
    @Override
    public List<Bill> fileParser(List<String> text) throws IOException {
        DAOFactory factory = DAOFactory.getInstance();
        BillDAO billDAO = factory.getBillDAO();
        BillDAOImpl.fileReader();
        if (!Validator.billValidator(text, BillDAOImpl.patternXmlLabel)) {
            return null;
        }
        List<Bill> bill =  billDAO.fileParser(text);
        return bill;
    }
}
