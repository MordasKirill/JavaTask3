package net.epam.study.main;

import net.epam.study.dao.impl.BillDAOImpl;
import net.epam.study.entity.Bill;
import net.epam.study.service.validation.Validator;
import java.util.List;

public class PrintBillInfo {

    public static void print(List<Bill> bill){
        if (!Validator.billValidator(BillDAOImpl.textFromFile, BillDAOImpl.patternXmlLabel)) {
            System.out.println("XML file is not correct!");
        }
        if (bill != null) {
            for (Bill value : bill) {
                System.out.println(value);
            }
            System.out.println("Success!");
        }else System.out.println("No match found.");
    }
}
