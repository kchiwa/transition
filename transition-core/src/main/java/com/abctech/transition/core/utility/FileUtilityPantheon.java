package com.abctech.transition.core.utility;

import com.abctech.transition.core.exception.TransitionRuntimeException;
import no.api.pantheon.io.StreamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

final public class FileUtilityPantheon {

  private static Logger log = LoggerFactory.getLogger(FileUtilityPantheon.class);

    private FileUtilityPantheon() {
        //Hide Utility Class Constructor : Utility classes should not have a public or default constructor.
    }

   /**
     * Copy file from source to destination to solve NSF problem . Cannot use commons-io FileUtility as it uses NIO, which is incompatible with NFS.
     *
     * @param sourceFile      to copy from
     * @param destinationPath to copy to
     */
   public static boolean transferFile(String sourceFile, String destinationPath) throws IOException {
        File source = new File(sourceFile);
        File dest = new File(destinationPath);
        if ( ! source.isFile() ) {
            throw new TransitionRuntimeException("Source file is not a file or does not exist: "+sourceFile);
        }
        ensureSubdirectoriesExist(dest);
        // StreamUtils close the files
        StreamUtils.transfer(new FileInputStream(source), new FileOutputStream(dest), 4096);
        if (dest.exists()) {
            return true;
        }
       return false;
   }

    public static boolean transferFile(InputStream sourceIs, String destinationPath) throws IOException {
         File dest = new File(destinationPath);
         ensureSubdirectoriesExist( dest );
         // StreamUtils close the files
         StreamUtils.transfer(sourceIs, new FileOutputStream(dest), 4096);
         if (dest.exists()) {
             return true;
         }
        return false;
    }

    private static void ensureSubdirectoriesExist(File dest) {
        File dir = dest.getParentFile();
        if ( !dir.exists()) {
            log.debug("Creating directory in order to accommodate "+dest.getAbsolutePath());
            if ( ! dir.mkdirs()) {
                throw new TransitionRuntimeException("Could not create directories in: "+dir.getAbsolutePath());
            }
        }
    }

}
