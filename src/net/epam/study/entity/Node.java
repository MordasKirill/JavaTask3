package net.epam.study.entity;

import java.util.List;
import java.util.Objects;

public class Node {
    public String parentNodeName;
    public String parentNode;
    public String childNodeName;
    public List<String> childNode;
    public String attributeName;
    public String attributeValue;

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
        return "Node " +
                "[Parent node name='" + parentNodeName + '\'' +
                ", content=" + parentNode +
                ", childContent=" + childNode + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(getParentNodeName(), node.getParentNodeName()) &&
                Objects.equals(getParentNode(), node.getParentNode()) &&
                Objects.equals(getChildNodeName(), node.getChildNodeName()) &&
                Objects.equals(childNode, node.childNode) &&
                Objects.equals(attributeName, node.attributeName) &&
                Objects.equals(attributeValue, node.attributeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getParentNodeName(), getParentNode(), getChildNodeName(), childNode, attributeName, attributeValue);
    }
}
