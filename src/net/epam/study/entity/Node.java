package net.epam.study.entity;

import java.math.BigDecimal;
import java.util.List;

public class Node {
    public String name;
    public String parentNode;
    public List<String> childNode;

    public Node(){
        super();
    }
    public Node(String name, List<String> nodeList){
        this.name = name;
        this.childNode = nodeList;
    }
    public Node(String name, String node) {
        this.name = name;
        this.parentNode = node;
    }
    public String getName(){
        return name;
    }
    public void setName(String string){
        name = string;
    }
    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", content=" + parentNode +
                ", childContent=" + childNode +
                '}';
    }
}
