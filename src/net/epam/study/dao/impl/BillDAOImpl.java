package net.epam.study.dao.impl;

import net.epam.study.entity.Bill;
import net.epam.study.dao.BillDAO;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BillDAOImpl implements BillDAO {
    private static int id = 0;
    private static BigDecimal price = null;
    private static String name = null;
    public static final List<String> textFromFile = new ArrayList<>();
    private static final Pattern patternId = Pattern.compile("(<.*\"(\\d)\">)");
    private static final Pattern patternItemName = Pattern.compile("(<.*>(.* .*)</.*)");
    private static final Pattern patternItemPrice = Pattern.compile("(<.*>\\$(\\d.*)</.*>)");
    public static final Pattern patternXmlLabel = Pattern.compile("<\\?.* version=\"\\d.*\" encoding=\".*\"\\?>");

    public static void fileReader() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./resources/bill_info");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String strLine;
        while ((strLine = bufferedReader.readLine()) != null)   {
            textFromFile.add(strLine);
        }
    }
    public List<Bill> fileParser(List<String> textFromFile){
        List<Bill> billList = new ArrayList<>();
        for (int i = 0; i<textFromFile.size(); i++) {
            Matcher matcherId = patternId.matcher(textFromFile.get(i));
            Matcher matcherItemName = patternItemName.matcher(textFromFile.get(i));
            Matcher matcherItemPrice = patternItemPrice.matcher(textFromFile.get(i));
            if (matcherId.find()){
                id = Integer.parseInt(matcherId.group(2));
            }
            if (matcherItemName.find()){
                name = matcherItemName.group(2);
            }
            if (matcherItemPrice.find()){
                price = new BigDecimal(matcherItemPrice.group(2));
            }
            if (id>0&&name!=null&&price!=null){
                billList.add(new Bill(id, name, price));
                id = 0;
                name = null;
                price = null;
            }
        }
        return billList;
    }
}
