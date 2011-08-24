package com.abctech.transition.core.utility;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.*;
import javax.xml.stream.events.XMLEvent;
import java.io.InputStream;
import java.io.StringWriter;

//FIXME why are there no single comments in utility classes?
// CR: 2011-08-15
public class XmlUtility {

    private final Logger log = LoggerFactory.getLogger(XmlUtility.class);

    public String convertCharacterEntity(String xml){
        InputStream inputStream = IOUtils.toInputStream(xml);
        StringWriter stringWriter = new StringWriter();
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlInputFactory.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES,true);
        XMLEventFactory xmlEventFactory = XMLEventFactory.newInstance();
        try{
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(inputStream);
            XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(stringWriter);
            while(reader.hasNext()){
                if(reader.next() instanceof  XMLEvent){
                    XMLEvent event = (XMLEvent)reader.next();
                    if(event.getEventType() == XMLEvent.CHARACTERS){
                        String element = replaceCharacterEntity(event.asCharacters().getData());
                        writer.add(xmlEventFactory.createCharacters(element));
                    }else{
                        writer.add(event);
                    }
                }
            }
            writer.flush();
        }catch (XMLStreamException err){
             log.debug("error");
        }
        return stringWriter.toString();

    }

    public String replaceCharacterEntity(String initialString){

        /*
         replace this character
         < with &lt;
         > with &gt;
         & with &amp;
         " with &quot;
         \t with &#009;
         ! with &#033;
         # with &#035;
         $ with &#036;
         % with &#037;
        ' with &#039;
        ( with &#040;
        ) with &#041;
        * with &#042;
        + with &#043;
        , with &#044;
        - with &#045;
        . with &#046;
        / with &#047;
        : with &#058;
        ; with &#059;
        = with &#061;
        ? with &#063;
        @ with &#064;
        [ with &#091;
        \ with &#092;
        ] with &#093;
        ^ with &#094;
        _ with &#095;
        ` with &#096;
        { with &#123;
        | with &#124;
        } with &#125;
        ~ with &#126;
         */

        String newString;
        //newString = initialString.replace("&","&#38;");
        //newString = newString.replace(";", "&#59;");
        //newString = newString.replace("#", "&#35;");
        newString = initialString.replace("/","&#47;");
        //newString = newString.replace("<", "&lt;");
        //newString = newString.replace(">", "&gt;");
        //newString = newString.replace("\"","&quot;");
        //newString = newString.replace("\t", "&#9;");
        //newString = newString.replace("!", "&#33;");
        //newString = newString.replace("$", "&#36;");
        //newString = newString.replace("%", "&#37;");
        //newString = newString.replace("'", "&#39;");
        //newString = newString.replace("(", "&#40;");
        //newString = newString.replace(")", "&#41;");
        //newString = newString.replace("*","&#42;");
        //newString = newString.replace("+", "&#43;");
        //newString = newString.replace(",", "&#44;");
        //newString = newString.replace("-", "&#45;");
        newString = newString.replace(".","&#46;");
        newString = newString.replace(":", "&#58;");
        //newString = newString.replace("=", "&#61;");
        newString = newString.replace("?","&#63;");
        //newString = newString.replace("@", "&#64;");
        //newString = newString.replace("[", "&#91;");
        //newString = newString.replace("\\","&#92;");
        //newString = newString.replace("]","&#93;");
        //newString = newString.replace("^", "&#94;");
        //newString = newString.replace("_", "&#95;");
        //newString = newString.replace("`", "&#96;");
        //newString = newString.replace("{", "&#123;");
        //newString = newString.replace("|", "&#124;");
        //newString = newString.replace("}", "&#125;");
        //newString = newString.replace("~", "&#126;");
        return newString;
    }
}
