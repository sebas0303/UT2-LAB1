package ut2.ficheros.ejerciciospracticos;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejercicio10 {

    public static void main(String[] args) {

        try {

            // Creamos la fábrica para construir el documento
            DocumentBuilderFactory fabrica =
                    DocumentBuilderFactory.newInstance();

            // Creamos el constructor del documento
            DocumentBuilder constructor =
                    fabrica.newDocumentBuilder();

            // Creamos el documento XML en memoria
            Document documento = constructor.newDocument();

            // Creamos el elemento principal <instituto>
            Element instituto = documento.createElement("instituto");

            // Lo añadimos al documento
            documento.appendChild(instituto);

            // Creamos el elemento <modulo>
            Element modulo = documento.createElement("modulo");

            // Añadimos el atributo codigo="DAM"
            modulo.setAttribute("codigo", "DAM");

            // Añadimos el texto "Acceso a Datos"
            modulo.setTextContent("Acceso a Datos");

            // Añadimos modulo dentro de instituto
            instituto.appendChild(modulo);

            // Creamos el transformador para guardar el XML
            TransformerFactory fabricaTransformer =
                    TransformerFactory.newInstance();

            Transformer transformer =
                    fabricaTransformer.newTransformer();

            // Indicamos que queremos una salida bonita
            transformer.setOutputProperty(
                    OutputKeys.INDENT, "yes");

            // Indicamos que el XML utiliza UTF-8
            transformer.setOutputProperty(
                    OutputKeys.ENCODING, "UTF-8");

            // Definimos el documento como origen
            DOMSource origen = new DOMSource(documento);

            // Indicamos el archivo de destino
            StreamResult destino =
                    new StreamResult(new File("instituto.xml"));

            // Guardamos el XML
            transformer.transform(origen, destino);

            System.out.println("El archivo instituto.xml se ha creado correctamente.");

        } catch (Exception e) {

            System.out.println("Error al crear el archivo XML.");
            e.printStackTrace();
        }
    }
}