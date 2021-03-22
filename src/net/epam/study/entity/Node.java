package net.epam.study.entity;

import java.util.List;

public class Node {
    public String parentNodeName;
    public String childNodeName;
    public String attributeName;
    public String attributeValue;
    public String parentNode;
    public List<String> childNode;

    public Node(){
        super();
    }
    public Node(String childNodeName, List<String> childNodeList){
        this.childNodeName = childNodeName;
        this.childNode = childNodeList;
    }
    public Node(String parentNodeName, String node) {
        this.parentNodeName = parentNodeName;
        this.parentNode = node;
    }
    public Node(String childNodeName, String attributeName, String attributeValue){
        this.childNodeName = childNodeName;
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public String getParentNodeName() {
        return parentNodeName;
    }

    public void setParentNodeName(String parentNodeName) {
        this.parentNodeName = parentNodeName;
    }

    public String getParentNode() {
        return parentNode;
    }

    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
    }

    public String getChildNodeName(){
        return childNodeName;
    }
    public void setChildNodeName(String childNodeName){
        this.childNodeName = childNodeName;
    }
    @Override
    public String toString() {
        return "Node{" +
                "name='" + parentNodeName + childNodeName + '\'' +
                ", content=" + parentNode +
                ", childContent=" + childNode +
                '}';
    }
}
