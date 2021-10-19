package one.innovation.digital.collections.parsingfromexternal;

import one.innovation.digital.collections.parsingfromexternal.classes.Employee2;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 *  ParsingXml
 *
 */
public class ParsingXml {
    public static void main(String args[])throws Exception{
        System.out.println("Start processing:..........................................");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Retrieve data from online source
        URL xmlUrl = new URL("https://gist.githubusercontent.com/Franklin-Siqueira/f358e94789382fa4d2694b1d0c65dcc6/raw/05f149afd21ad1cf3b5fc07cdfda6cf80e599102/Employee2.xml");
        InputStream in = xmlUrl.openStream();
        Document document = builder.parse(in);
        // Initialize ArrayList and NodeList
        ArrayList<Employee2> empList = new ArrayList<>();
        //
        // NodeList nodeListTwo = document.getElementsByTagName("employee");
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        // Get info
        /*
        System.out.println("NodeList length is: " + nodeListTwo.getLength());
        System.out.println("NodeList elements class: " + nodeListTwo.getClass());
        System.out.println("NodeList elements: " + nodeListTwo.toString());
        //
        System.out.println("NodeList length is: " + nodeList.getLength());
        System.out.println("NodeList elements class: " + nodeList.getClass());
        System.out.println("NodeList elements: " + nodeList);
        */
        // Go through each node and extract data
        for(int i = 0; i < nodeList.getLength() ; i++){
            // Get employee
            Node node = nodeList.item(i);
            // Node node2 = nodeList.
            // System.out.printf("Node name: %s\n", node.getLocalName());
            if (node.getNodeType() == Node.ELEMENT_NODE){
                // if(node instanceof Element){
                System.out.println("Read node data...");
                //
                Employee2 emp = new Employee2();
                emp.id = node.getAttributes().getNamedItem("id").getNodeValue();
                // System.out.printf("Emp id: %s \n", emp.id);
                NodeList childNodes = node.getChildNodes();
                // System.out.printf("Read node's child length: %s \n", childNodes.getLength());
                // Identify child nodes of employee
                for(int j = 0; j < childNodes.getLength(); j++){
                    // System.out.println("Read node's child data...");
                    Node childNodeElement = childNodes.item(j);
                    // if(childNodeElement instanceof Element){
                    if (childNodeElement.getNodeType() == Node.ELEMENT_NODE) {
                        String content = childNodeElement.getLastChild().getTextContent().trim();
                        //
                        switch(childNodeElement.getNodeName()){
                            case "firstName":
                                emp.firstName =  content;
                            case "lastName":
                                emp.lastName = content;
                            case "location":
                                emp.location = content;
                        }
                    }
                }
                empList.add(emp);
            }
        }
        //Document document= builder.parse(new FileInputStream("https://gist.githubusercontent.com/vajja/dddd83442abdc5e80240/raw/881a55f577ff4e295d625453263c36dfc27c6ace/user.xml"));
        for(Employee2 emp : empList) System.out.println(emp);
        System.out.println(empList);
    }
}