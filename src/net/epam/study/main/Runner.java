package net.epam.study.main;

import net.epam.study.service.BillFactory;
import net.epam.study.service.BillService;
import net.epam.study.dao.impl.BillDAOImpl;
import net.epam.study.entity.Bill;

import java.io.IOException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {
        List<Bill> bill;
        BillFactory factory = BillFactory.getInstance();
        BillService service = factory.getBillService();
        bill = service.fileParser(BillDAOImpl.textFromFile);
        PrintBillInfo.print(bill);
    }
}
