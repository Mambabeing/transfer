package logic;

import java.io.*;
import java.util.*;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.*;

public class XML8 {
    //    public static void main(String[] args) throws Exception{
//        SAXReader saxReader=new SAXReader();
//        Document document=saxReader.read(new File("src/main/java/program.mm"));
//    }
    private static void updateToXML(Document document) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("src/main/java/program.mm"), outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();
    }
    public static void updateAttribute(Document document)throws Exception{
        List<Element> students=document.getRootElement().elements("学生");
        for(Element e:students){
            e.addAttribute("班级编号","C2");
        }
        updateToXML(document);
    }
    public static void updateElement(Document document)throws Exception{
        List<Element> students=document.getRootElement().elements("学生");
        for(Element e:students){
            Element age=e.element("年龄");
            age.setText(Integer.parseInt(age.getTextTrim())+3+"");
        }
        updateToXML(document);
    }
    public static void addByIndex(Document document,int index)throws Exception{
        Element newStu= DocumentHelper.createElement("学生");
        newStu.setText("小花");
        List<Element> students=document.getRootElement().elements("学生");
        students.add(index,newStu);
        updateToXML(document);
    }
    public static void add(Document document)throws Exception{
        Element newStu=DocumentHelper.createElement("学生");
        newStu.addAttribute("学号","n4");
        Element newStuName=DocumentHelper.createElement("名字");
        Element newStuAge=DocumentHelper.createElement("年龄");
        Element newStuIntro=DocumentHelper.createElement("介绍");
        newStu.add(newStuName);
        newStu.add(newStuAge);
        newStu.add(newStuIntro);
        document.getRootElement().add(newStu);
        updateToXML(document);
    }
    public static void readByXPath(Document document)throws Exception{
        Element student=(Element)document.selectSingleNode("/班级/学生[1]");
        System.out.println("姓名："+student.elementText("名字")+"\t年龄："+student.elementText("年龄")+"\t介绍："+student.elementText("介绍")+
                "\t性别:"+student.attributeValue("性别"));
    }
    public static void read(Document document)throws Exception{
        Element root=document.getRootElement();
        Element student=(Element)root.elements("学生").get(0);
        System.out.println("姓名：" + student.elementText("名字") + "\t年龄："
                + student.elementText("年龄") + "\t介绍："
                + student.elementText("介绍") + "\t性别："
                + student.attributeValue("性别"));
    }
    public static void list(Element element){
        System.out.println("元素名称："+element.getName()+"\t元素内容:"+element.getTextTrim());
        Iterator<Element> iterator=element.elementIterator();
        while(iterator.hasNext()){
            Element e=iterator.next();
            list(e);
        }
    }







}
