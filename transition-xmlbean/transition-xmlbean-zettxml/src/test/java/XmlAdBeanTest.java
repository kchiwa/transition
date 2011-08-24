import com.abctech.transition.xmladbeans.zettxml.ZettNoDocument;
import org.apache.xmlbeans.XmlException;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class XmlAdBeanTest {
    private final Logger log = LoggerFactory.getLogger(XmlAdBeanTest.class);
    @Test
    public void testZettXmlAdBean() {
        String xmlString = retrieveStringFromFile("zettxmlTestdata1.xml");
        ZettNoDocument zettnoDocument = null;
        try {
            zettnoDocument = ZettNoDocument.Factory.parse(xmlString);
        } catch (XmlException e) {
            e.printStackTrace();
            Assert.fail();
        }
        // Try to read and change some values
        Assert.assertNotNull(zettnoDocument);
    }

    public String retrieveStringFromFile(String path) {
        String string = null;
        try {
            FileInputStream stream;
            File sourceFile = new File(this.getClass().getClassLoader().getResource(path).getFile());
            stream = new FileInputStream(sourceFile);
            FileChannel fc = stream.getChannel();
            MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
            string = Charset.defaultCharset().decode(bb).toString();
        } catch (IOException e) {
           log.error("ERROR: " + e.getMessage());
        }
        return string;
    }
}
