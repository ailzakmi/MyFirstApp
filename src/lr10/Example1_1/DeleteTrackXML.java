package lr10.Example1_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DeleteTrackXML {
    private static int k = 0;
    private static NodeList nodeList;
    private static Element bookElement;

    public static void main(String[] args) {
        try {
//            boolean
            File inputFile = new File("src/lr10/Example1_1/Musik.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            System.out.println("Корневой элемент: "+doc.getDocumentElement().getNodeName());
            nodeList = doc.getElementsByTagName("Track");
            Scanner in = new Scanner(System.in);
            String why;
            List<String> search;
            do {
                search = getAuthor(doc, xpath);
                //System.out.println("Книги автора: " + search);
                System.out.println("Эта песня?: " + search);

                System.out.println("yes(y) или no(n), да(д) или нет(н)");
                why = in.nextLine();
                if (why.equals("y") | why.equals("yes") | why.equals("д") | why.equals("да")) {
                    Node parentNode = bookElement.getParentNode();
                    parentNode.removeChild(bookElement);
//                    System.out.println("Эта книга?: " + search + " = " + k);
                    break;
                }
            } while (true);


            System.out.println("Песня удалена!");
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "no");
            DOMSource source = new DOMSource(doc);
            StreamResult result =
                    new StreamResult(new File ("src/lr10/Example1_1/Musik1.xml"));
            transformer.transform(source,result);

            //System.out.println("Удалена первая песня в списке.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static List<String> getAuthor(Document doc, XPath xpath)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите автора");
        String auth = in.nextLine();
        List<String> listA = new ArrayList<>();
        try {
            //создаем объект XPathExpression
            XPathExpression xPathExpression = xpath.compile(
                    "/Music/Track[author='"+auth+"']/title/text()"
            );
            // получаем список всех тегов, которые отвечают условию
            NodeList nodes = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            // проходим по списку и получаем значение с помощью getNodeValue()
            if (nodes.getLength() > 1) {
                for (int i = 0; i < nodes.getLength(); i++) {
                    System.out.println("Книги автора: " + nodes.item(i).getNodeValue());
                    //k = nodes.item(i).getNodeType();
                }
                listA = getTitle(nodes,doc);
            } else {
                //for (int i = 0; i < nodes.getLength(); i++)
                listA.add(nodes.item(0).getNodeValue());
//                k = nodes.item(0).getNodeType();
                NodeList nodeListAuthor = doc.getElementsByTagName("author");
                for (int g = 0; g < nodeListAuthor.getLength(); g++) {
                    if (Objects.equals(nodeListAuthor.item(g).getFirstChild().getNodeValue(), auth)) k = g;
                }
//                k = nodeList.equals(nodes.item(0));
                Node node = nodeList.item(k);
                bookElement = (Element) node;
                bookElement.getElementsByTagName("author").item(0);
            }
            //k = 10;
            //k = nodes.item();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return listA;
    }
    private static List<String> getTitle(NodeList nod, Document doc)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название трека");
        String title = in.nextLine();
        List<String> listT = new ArrayList<>();

        for (int i = 0; i < nod.getLength(); i++) {
            if (Objects.equals(nod.item(i).getNodeValue(), title)) {
                listT.add(nod.item(i).getNodeValue());
            }
        }

        NodeList nodeListAuthor = doc.getElementsByTagName("title");
        for (int g = 0; g < nodeListAuthor.getLength(); g++) {
            if (Objects.equals(nodeListAuthor.item(g).getFirstChild().getNodeValue(), title)) k = g;
        }
        Node node = nodeList.item(k);
        bookElement = (Element) node;
        bookElement.getElementsByTagName("title").item(0);

        return listT;
    }
}
