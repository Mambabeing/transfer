import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
public class tiqu {
    public static void main(String[] args) throws Exception{
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read(new File("src/main/java/test.mm"));

        Document outdoc= DocumentHelper.createDocument();
        Element outroot=outdoc.addElement("Class");
        Element atts;
        Element methods;
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
        Element root=document.getRootElement();
        Element classlevel=(Element)document.selectSingleNode("/map/node/node/node");
//        System.out.println(classlevel);
        Attribute attribute=classlevel.attribute("TEXT");
        Attribute att2=classlevel.attribute("ID");
        String IDatt=attribute.getText();
        if(IDatt.equals("ID_211111001")){
            System.out.println("匹配成功");
            //进入类的操作，字符串匹配
        }
        String attbute=attribute.getText();
        System.out.println(attbute);
        //此处进行标识符匹配


//        Element att=root.element("attribute_registry");
//        System.out.println(att.attributeValue("FONT_SIZE"));

    }
    public void output(Document document) throws IOException {
        XMLWriter writer=new XMLWriter(new FileWriter("Struct.xml"));
        writer.write(document);
        writer.close();
    }

}
