package com.abctech.transition.core;

import com.abctech.transition.core.exception.TransitionException;
import org.springframework.core.io.ClassPathResource;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.File;

public final class XmlByXslTransformer {
    //private static final Logger log = LoggerFactory.getLogger(XmlByXslTransformer.class);

    private Transformer transFormer;

    private XmlByXslTransformer() {
        // intentional
    }

    /**
     * ****************************************************************************************************************
     *
     * 
     * ****************************************************************************************************************
     */


    public static XmlByXslTransformer createTransformer(String xslFile) throws TransitionException {
        return new XmlByXslTransformer().prime(xslFile);
    }

    private XmlByXslTransformer prime(String xslFile) throws TransitionException {
        try {
            Source sourceXsl = new StreamSource(new ClassPathResource(xslFile).getInputStream());
            transFormer = TransformerFactory.newInstance().newTransformer(sourceXsl);
        } catch (Exception e) { // NOSONAR Erlend says that it is OK to catch broad exceptions here
            throw new TransitionException("Cannot continue. Got a serious problem with reading the xsl file and make into a transformer", e);
        }
        return this;
    }
     /**
     * ****************************************************************************************************************
     *
     *
     * ****************************************************************************************************************
     */
    /**
     * Sets parameters in the transformer.
     */
    public void setParameter(String parameterName, String parameterValue) {
        transFormer.setParameter(parameterName, parameterValue);
        //log.debug("Parameter " + parameterName + " set to " + parameterValue);
    }
      /**
     * ****************************************************************************************************************
     *
     *
     * ****************************************************************************************************************
     */

    public XmlByXsdTransformationResult performTransformationOn(File filename) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Result destination = new StreamResult(baos);
        XmlByXsdTransformationResult result = new XmlByXsdTransformationResult();
        try {
            StreamSource sourceXml = new StreamSource(filename);
            transFormer.transform(sourceXml, destination);
            result.setTransformedContents(baos.toString());
        } catch (Exception e) { // NOSONAR Erlend says that it is OK to catch broad exceptions here
            result.setTransformedContents(null);
            result.setErrorOccurred(true);
            result.setErrorMessage(e.getMessage());
        }
        return result;
    }
}
