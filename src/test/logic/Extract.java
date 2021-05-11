package logic;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Extract {
    public static String name;
    public static Document outdoc= DocumentHelper.createDocument();
    public static Element outroot=outdoc.addElement("Class");
    public static Element atts;
    public static Element methods;


    public static void main(String[] args) throws Exception{
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
         SAXReader saxReader=new SAXReader();
        Document document=saxReader.read(new File("src/main/java/program.mm"));


         Element root=document.getRootElement();
         Element classlevel=(Element)document.selectSingleNode("/map/node/node/node");
        //        System.out.println(classlevel);
         Attribute attribute=classlevel.attribute("TEXT");
         Attribute att2=classlevel.attribute("ID");
         String IDatt=att2.getText();
//        System.out.println(IDatt);
        while(true)
        {
            if (IDatt.equals("ID_211111001")) {
                //进入类的操作，字符串匹配
                break;
            }
            else if (!IDatt.equals("ID_211111001")) {
                classlevel = classlevel.element("node");
            }
        }
        String attbute=attribute.getText();
        System.out.println(attbute);
        //此处进行标识符匹配,类名提取及根节点加入
        //class name属性加入

        name=match();

        Element element=classlevel.addElement("name");



        //成员属性提取

        while(true)
        {
            if (IDatt.equals("ID_21111211001")) {
                //进入类的操作，字符串匹配
                break;
            }
            else if (!IDatt.equals("ID_21111211001")) {
                classlevel = classlevel.element("node");
            }
        }

        //成员方法提取
        while(true)
        {
            if (IDatt.equals("ID_21111311001")) {
                //进入类的操作，字符串匹配
                break;
            }
            else if (!IDatt.equals("ID_21111311001")) {
                classlevel = classlevel.element("node");
            }
        }




//        Element att=root.element("attribute_registry");
//        System.out.println(att.attributeValue("FONT_SIZE"));

    }

    public void output(Document document) throws IOException {
        XMLWriter writer=new XMLWriter(new FileWriter("Struct.xml"));
        writer.write(document);
        writer.close();
    }
    public static String match(){


        return name;
    }
    public void join(attribute att,String attribute,String name){
        if(attribute=="属性"){

        }else if(attribute=="方法"){

        }
    }



}
