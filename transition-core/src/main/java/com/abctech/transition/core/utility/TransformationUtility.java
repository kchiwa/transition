package com.abctech.transition.core.utility;

final public class TransformationUtility {
    //private final static Logger log = LoggerFactory.getLogger(TransformationUtility.class);

    private TransformationUtility() {
        //
    }
    public static String removeNorwegianCharactersWithUnderLine(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("[^A-Za-z]", "_");
    }


} //class
