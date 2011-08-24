package com.abctech.transition.core;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

public class CreateFinnJobSQL {

    private final Logger log = LoggerFactory.getLogger(CreateFinnJobSQL.class);

    @Test
    public void createSQL() throws Exception{
        StringBuffer stringBuffer = new StringBuffer();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("finnjob/output_catid.txt");
        String text = IOUtils.toString(is);
        String[] line = text.split("\n");
        for(String eachLine:line){
            String[] element = eachLine.split("=");
            stringBuffer.append("INSERT INTO valuemap (format, field, lookup, categoryid, zettvalue) VALUES ('finnjob', 'categories', '"+element[0]+"',"+element[1]+",'"+element[2]+"');\n");
        }
        //log.debug(stringBuffer.toString());
    }
}
