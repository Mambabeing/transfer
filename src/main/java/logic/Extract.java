package logic;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.*;
import java.util.List;
import org.apache.log4j.*;

public class Extract {
    public String name;
    public Document outdoc= DocumentHelper.createDocument(); //输出文档
    public Element outroot=outdoc.addElement("Classes");  //输出根节点
    public Element atts=DocumentHelper.createElement("属性");                                     //类图属性
    public Element methods=DocumentHelper.createElement("方法");                                  //类图方法
    static Logger log=Logger.getLogger(Extract.class);

    @Test
    public void Test1() throws Exception{
//        Element nodes=(Element)document.selectSingleNode("/map/node");
//        System.out.println(nodes);
//        Element student=(Element)document.selectSingleNode("/班级/学生[1]");
//        Element student=(Element)root.elements("学生").get(0);
//
//        String text = "<members></members>";
//        Document document = DocumentHelper.parseText(text);

//        Iterator<Element> iterator=element.elementIterator();
//        while(iterator.hasNext()){
//            Element e=iterator.next();
//            list(e);
//        }
        PropertyConfigurator.configure("src/log4j.properties");

         SAXReader saxReader=new SAXReader();
         Document document=saxReader.read(new File("src/main/java/program.mm"));

         Element root=document.getRootElement();
         Element classlevel=(Element)document.selectSingleNode("/map/node/node/node");
//         System.out.println(classlevel);
         //类级别识别到后，就会识别atts属性、methods方法
         //        System.out.println(classlevel);
         //        log.trace("classlevel");
         Attribute attribute=classlevel.attribute("TEXT");//当前Text属性
         Attribute att2=classlevel.attribute("ID");//当前ID属性
//        classlevel = classlevel.element("node");
//        System.out.println(classlevel);
        log.trace(classlevel);
//         String IDatt=att2.getText();//ID值
//        System.out.println(IDatt);
        while(true)//直到识别到类那一级
        {
            String IDatt=classlevel.attributeValue("ID");
//            System.out.println(classlevel.attributeValue("TEXT"));
            log.trace(classlevel.attributeValue("TEXT"));
            if (IDatt.equals("ID_211111001")) {
                //进入类的操作，字符串匹配
                break;
            }
            else if (!IDatt.equals("ID_211111001")) {
                classlevel = classlevel.element("node");
            }
        }
        String attbute=attribute.getText();
//        System.out.println(attbute);
        //此处进行标识符匹配,类名提取及根节点加入
        //class name属性加入
        Element class1=DocumentHelper.createElement("class1");
//        class1.setText(attbute);
        class1.addAttribute("name",attbute);
        outroot.add(class1);

        class1.add(atts);
        class1.add(methods);

        Element element=classlevel.addElement("name");
//        System.out.println(classlevel.attributeValue("TEXT"));


        //成员属性提取
        while(true)
        {
            String IDatt=classlevel.attributeValue("ID");
            if (IDatt.equals("ID_21111211001")||IDatt.equals("ID_21111311001")) {
                //进入类的操作，字符串匹配
                break;
            }
            else if (!IDatt.equals("ID_21111211001")) {

                    classlevel = classlevel.element("node");

            }
        }
        if(classlevel.attributeValue("ID").equals("ID_21111211001")) {
            List<Element> attss = classlevel.elements("node");
            for (Element e : attss) {
                Element newatt = DocumentHelper.createElement(e.attributeValue("TEXT"));
                atts.add(newatt);
//                System.out.println(e.attributeValue("TEXT"));
                log.trace(e.attributeValue("TEXT"));
            }
        }


        //成员方法提取
        while(true)
        {
            String IDatt=classlevel.attributeValue("ID");
            if (IDatt.equals("ID_21111311001")) {
                //进入类的操作，字符串匹配
                break;
            }
            else if (!IDatt.equals("ID_21111311001")) {

                    classlevel = classlevel.element("node");

            }
        }
        if(classlevel.attributeValue("ID").equals("ID_21111311001")) {
            List<Element> methodss = classlevel.elements("node");
            for (Element e : methodss) {
                Element newmethod = DocumentHelper.createElement(e.attributeValue("TEXT"));
                methods.add(newmethod);
//                System.out.println(e.attributeValue("TEXT"));
                log.trace(e.attributeValue("TEXT"));
            }
        }

//        Attribute attribute1=classlevel.attribute("TEXT");//当前Text属性
//        Attribute att4=classlevel.attribute("ID");//当前ID属性
//        String IDatt=att2.getText();//ID值
//        String attbute1=attribute.getText();
//        System.out.println(attbute);
//        //此处进行标识符匹配,类名提取及根节点加入
//        //class name属性加入
//        Element class1=DocumentHelper.createElement("class1");
//        class1.setText(attbute);
//        class1.addAttribute("name",attbute);
//        outroot.add(class1);
//        Element element=classlevel.addElement("name");

        OutputXML();//输出至文档

//        Element att=root.element("attribute_registry");
//        System.out.println(att.attributeValue("FONT_SIZE"));

    }

//    public void output(Document document) throws IOException {
//        XMLWriter writer=new XMLWriter(new FileWriter("Struct.xml"));
//        writer.write(document);
//        writer.close();
//    }
    public void join(attribute att,String attribute,String name){
        if(attribute=="属性"){

        }else if(attribute=="方法"){

        }
    }
    @Test
    public void OutputXML() throws IOException {
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");
        XMLWriter xmlWriter=new XMLWriter(new FileOutputStream("src/main/java/outXML"),outputFormat);
        xmlWriter.write(outdoc);
        xmlWriter.close();
    }


}
