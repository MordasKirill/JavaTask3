package net.epam.study.entity;

import java.util.List;

public class Node {
    public String parentNodeName;
    public String childNodeName;
    public String parentNode;
    public List<String> childNode;

    public Node(){
        super();
    }
    public Node(String parentNodeName, List<String> nodeList){
        this.parentNodeName = parentNodeName;
        this.childNode = nodeList;
    }
    public Node(String parentNodeName, String node) {
        this.parentNodeName = parentNodeName;
        this.parentNode = node;
    }
    public String getChildNodeName(){
        return childNodeName;
    }
    public void setChildNodeName(String string){
        childNodeName = string;
    }
    @Override
    public String toString() {
        return "Node{" +
                "name='" + parentNodeName + '\'' +
                ", content=" + parentNode +
                ", childContent=" + childNode +
                '}';
    }
}
