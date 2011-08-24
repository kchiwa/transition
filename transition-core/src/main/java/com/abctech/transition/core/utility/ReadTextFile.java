package com.abctech.transition.core.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class ReadTextFile {
    private static final Logger log = LoggerFactory.getLogger(ReadTextFile.class);

    private ReadTextFile() {
        // intentional
    }

    // TODO CR Erlend 08042011 readTextFile is a better name.
    public static String readTextFile(File file) {
       // File file = new File(fileName);
        StringBuffer contents = new StringBuffer();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = reader.readLine();
            // repeat until all lines is read
            while (text != null) {

                contents.append(text)
                        .append(System.getProperty(
                                "line.separator"));
               text = reader.readLine();
            }
        } catch (IOException e) {
            // TODO CR Erlend 08042011 This is not good. When an error occurres, an empty string is returned. Wrap and throw.
            log.error(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
        return contents.toString();
    }
}
