package net.epam.study.dao.impl;

import net.epam.study.entity.Attributes;
import net.epam.study.entity.Node;
import net.epam.study.dao.XMLParserDAO;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLParserDAOImpl implements XMLParserDAO {
    public static final List<String> XMLContent = new ArrayList<>();
    public static List<String> childNode = new ArrayList<>();
    public static final Pattern patternXmlLabel = Pattern.compile("<\\?.* version=\"\\d.*\" encoding=\".*\"\\?>");
    public static String nodeName = null;

    public static StringBuilder fileReader() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./resources/bill_info");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder splintedText = new StringBuilder();
        String strLine;
        while ((strLine = bufferedReader.readLine()) != null) {
            Pattern patternForAttr = Pattern.compile("\\s*(.*<.*>.*|\\w*)");
            Matcher matcherForAttr = patternForAttr.matcher(strLine);
            if (matcherForAttr.find()){
                splintedText.append(" ").append(matcherForAttr.group(1));
                XMLContent.add(strLine);
            }
        }
        return splintedText;
    }
    public static Node getNodeList(StringBuilder text){
        String nodeList = null;
        String name = null;
        Pattern patternNodeName = Pattern.compile("<(\\w*-\\w*)>(.*)</(\\w*-\\w*)>");
        Matcher matcherNodeName = patternNodeName.matcher(text);
        if (matcherNodeName.find()){
            nodeList = matcherNodeName.group(2);
            name = matcherNodeName.group(1);
        }
        return new Node(name, nodeList);
    }
    public static Node getNodeChildList(Node node){
        List<String> content;
        String formattedNode;

        Pattern patternNodeName = Pattern.compile("<(\\w*) \\w*=\"\\d+\">");
        Matcher matcher = patternNodeName.matcher(node.parentNode);
        if (matcher.find()){
            nodeName = matcher.group(1);
            node.setChildNodeName(nodeName);
        }
        formattedNode = node.parentNode.replaceAll("<\\w* \\w*=\"\\d+\">", "");
        content = Collections.singletonList(formattedNode.replaceAll("</"+ nodeName +">", ""));
        childNode = content;
        return new Node(nodeName, content);
    }
    
    @Override
    public List<Attributes> getAttributes(){
        List<Attributes> namesAndValues = new ArrayList<>();
        Pattern patternAttributeName = Pattern.compile("<name>(\\w*|(?:(?:\\w* ){1,6}\\w*))</name>");
        Pattern patternAttributeValue = Pattern.compile("(<\\w*>\\$(\\d*\\.\\d*)</\\w*>)");
        for (int i = 0; i< childNode.size(); i++){
            Matcher matcherAttributeName = patternAttributeName.matcher(childNode.get(i));
            Matcher matcherAttributeValue = patternAttributeValue.matcher(childNode.get(i));
            while (matcherAttributeName.find()&&matcherAttributeValue.find()){
                namesAndValues.add(new Attributes(nodeName, matcherAttributeName.group(1), matcherAttributeValue.group(2)));
            }
        }
        return namesAndValues;
    }
}
