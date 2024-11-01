package ejercicio8;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class TransformarXML {
    public static void main(String[] args) {
        try {
            // Definir el archivo XML de entrada y el archivo XSL
            File xmlFile = new File("alumnos.xml");
            File xslFile = new File("alumnos.xsl");

            // Definir el archivo HTML de salida
            File htmlFile = new File("alumnos.html");

            // Crear el Transformer a partir del XSL
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(xslFile));

            // Aplicar la transformación al XML y generar el HTML
            transformer.transform(new StreamSource(xmlFile), new StreamResult(htmlFile));

            System.out.println("Transformación completa. Se ha generado el archivo alumnos.html");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

