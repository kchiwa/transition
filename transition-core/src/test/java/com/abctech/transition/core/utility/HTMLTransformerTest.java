package com.abctech.transition.core.utility;

import com.abctech.transition.core.dao.DatabaseCreator;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.io.File;
import java.net.URL;

public class HTMLTransformerTest  {

    private static final Logger log = LoggerFactory.getLogger(HTMLTransformerTest.class);
    private HTMLTransformer htmlTransformer;

    @Autowired
    private DatabaseCreator initialTestDatabaseCreator;

    @Before
    public void setUp(){
        htmlTransformer = new HTMLTransformer();
    }

    @Test
    public void transformTagSymbolTest(){
        String initialText = "&lt;Test Tag Symbol&gt;";
        Assert.assertEquals("&lt; and &gt; symbol should be transform to '<' or '>'","<Test Tag Symbol>",htmlTransformer.transformTagSymbol(initialText));
    }

    @Test
    public void transformParagraphTest() throws Exception{

        URL url = this.getClass().getClassLoader().getResource("htmltranslator/test/description.txt");
        File file = new File(url.getPath());
        String text = FileUtils.readFileToString(file);

        URL expectedUrl = this.getClass().getClassLoader().getResource("htmltranslator/expected/expecteddescription.txt");
        File expectedFile = new File(expectedUrl.getPath());
        String expectedText = FileUtils.readFileToString(expectedFile);

        Assert.assertEquals("all new line should be replaced by <p> ",expectedText,htmlTransformer.transformParagraph(text));
    }

    @Test
    public void transformBulletTest() throws Exception{

        URL url = this.getClass().getClassLoader().getResource("htmltranslator/test/bullet.txt");
        File file = new File(url.getPath());
        String text = FileUtils.readFileToString(file);

        URL expectedUrl = this.getClass().getClassLoader().getResource("htmltranslator/expected/expectedbullet.txt");
        File expectedFile = new File(expectedUrl.getPath());
        String expectedText = FileUtils.readFileToString(expectedFile);

        Assert.assertEquals("all of bullet symbol and text should be replaced by <li> tag",expectedText,htmlTransformer.transformBullet(text));
    }

    @Test
    public void transformTextTest() throws Exception{

        URL url = this.getClass().getClassLoader().getResource("htmltranslator/test/text2.txt");
        File file = new File(url.getPath());
        String text = FileUtils.readFileToString(file);

        URL expectedUrl = this.getClass().getClassLoader().getResource("htmltranslator/expected/expectedtext2.txt");
        File expectedFile = new File(expectedUrl.getPath());
        String expectedText = FileUtils.readFileToString(expectedFile);

        Assert.assertEquals("all of paragraph and bullet should be replace by <p> and <li>",expectedText,htmlTransformer.transformText(text));
    }

    @Test
    public void transformRettbemanningDescriptionTextTest() throws Exception{
        String text = "Rett Bemanning er en av Nordens største franchisebaserte bemanningsbyrå"
                        +"med hovedkontor i Oslo. Kjernevirksomheten er personalutvelgelse til faste stillinger, og"
                        +"formidling av vikarer til næringsliv og offentlig virksomhet. Vårt mål er å være bransjens beste"
                        +"arbeidsgiver og rekrutteringspartner for våre medarbeidere og kunder. Rett Bemanning har i dag";

        log.debug(htmlTransformer.transformText(text));

    }

}
