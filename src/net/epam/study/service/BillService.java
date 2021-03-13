package net.epam.study.service;

import net.epam.study.entity.Bill;

import java.io.IOException;
import java.util.List;

public interface BillService {
    List<Bill> fileParser(List<String> text) throws IOException;
}
