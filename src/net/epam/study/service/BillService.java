package net.epam.study.service;

import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;

import java.io.IOException;
import java.util.List;

public interface BillService {
    List<Attributes> getAttributes() throws IOException;
}
