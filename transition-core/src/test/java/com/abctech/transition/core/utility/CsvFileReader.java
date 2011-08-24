package com.abctech.transition.core.utility;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.validate.XmlValidatorTest;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CsvFileReader {
    private final Logger log = LoggerFactory.getLogger(CsvFileReader.class);
    private final XmlValidatorTest getStringFromFile = new XmlValidatorTest();
    private final String OPEN_INSERT_STATEMENT = "INSERT INTO valuemap (format, field, lookup, categoryid, zettvalue) VALUES (";
    private final String CLOSE_INSERT_STATEMENT = ");\n";

    // INSERT INTO valuemap (format, field, lookup, categoryid, zettvalue) VALUES ('finnjob', 'categories', 'publicserv/defforpol',1004,'Forsvar');
    @Test
    public void testReadCsvFile() throws IOException {
        String csvFile = getStringFromFile.retrieveStringFromFile("rettbemanning/kategorimapping.csv","UTF-8");
        BufferedReader reader = new BufferedReader(new StringReader(csvFile));
        String line;
        StringBuilder sql = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            if (line.length() > 0) {
                Valuemap valuemap = new Valuemap();
                String[] field = line.split(";");
                valuemap.setFormat("'" + CustomerFormat.RETTBEMANNING.toTextValue() + "'");
                valuemap.setField("'categories'");
                valuemap.setLookup(field[1].replace("\"", "'").replace(" ", "").trim());
                valuemap.setCategoryId(field[2].trim());
                valuemap.setZettvalue(field[3].replace("\"", "'").trim());
                //log.debug(valuemap.toString());
                sql.append(OPEN_INSERT_STATEMENT).append(valuemap.getFormat()).append(",").append(valuemap.getField()).append(",").append(valuemap.getLookup()).append(",").append(valuemap.getCategoryId()).append(",").append(valuemap.getZettvalue()).append(CLOSE_INSERT_STATEMENT);
            }
        }
        log.debug(sql.toString());
    }

    public class Valuemap {
        private String format;
        private String field;
        private String lookup;
        private String categoryId;
        private String zettvalue;

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getLookup() {
            return lookup;
        }

        public void setLookup(String lookup) {
            this.lookup = lookup;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getZettvalue() {
            return zettvalue;
        }

        public void setZettvalue(String zettvalue) {
            this.zettvalue = zettvalue;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this).
                    append("format", format).
                    append("field", field).
                    append("lookup", lookup).
                    append("categoryId", categoryId).
                    append("zettvalue", zettvalue).
                    toString();
        }
    }
}
