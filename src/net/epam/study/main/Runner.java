package net.epam.study.main;

import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;
import net.epam.study.service.BillFactory;
import net.epam.study.service.BillService;
import net.epam.study.dao.impl.XMLParserDAOImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {
        List<Attributes> node = new ArrayList<>();
        BillFactory factory = BillFactory.getInstance();
        BillService service = factory.getBillService();
        node = service.getAttributes();
        PrintBillInfo.print(node);
    }
}
