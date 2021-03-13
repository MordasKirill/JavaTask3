package net.epam.study.dao;

import net.epam.study.entity.Bill;

import java.util.List;

public interface BillDAO {
    List<Bill> fileParser(List<String> text);
}
