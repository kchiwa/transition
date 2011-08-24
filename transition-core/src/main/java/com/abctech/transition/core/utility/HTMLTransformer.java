package com.abctech.transition.core.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLTransformer {

    //private static final Logger log = LoggerFactory.getLogger(HTMLTransformer.class);
    //ascii code of • = \u2022

    public String transformTagSymbol(String initialText){
        String completeTag;
        completeTag = initialText.replaceAll("&lt;","<");
        completeTag = completeTag.replaceAll("&gt;",">");
        return completeTag;
    }

    public String transformParagraph(String initialText){

        String[] line = initialText.split("\\n");
        StringBuffer newText = new StringBuffer();
        StringBuffer buffer = new StringBuffer();
        boolean start = true;
        for(int i = 0;i<line.length;i++){
            String temp = line[i].trim();
            temp = temp.replace("\t","");
            if(!temp.startsWith("<")){
                if(!temp.equals("")){
                    if(start){
                        buffer.append("<p>\n");
                    }
                    start = false;
                }else{
                    if(!start){
                        buffer.append("</p>\n");
                        start = true;
                    }
                }

                if(!start){
                    buffer.append("\t");
                    buffer.append(line[i]);
                    //buffer.append("<br />");
                    buffer.append("\n");

                    if(i == line.length-1){
                        buffer.append("</p>");
                        newText.append(buffer);
                    }

                }else{
                    newText.append(buffer);
                    buffer = new StringBuffer();
                }

            }else{
                newText.append(line[i]);
                newText.append("\n");
            }


        }

        return newText.toString();
    }

    public String transformBullet(String initialText){

        String transformedText;

        //pattern for add <li> tag
        StringBuffer buffer = new StringBuffer();
        Pattern pattern = Pattern.compile("^?[*-[\\u2022]]{1}[\\p{Space}]?[\\p{Print}\\p{L}$?]+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(initialText);
        while(matcher.find()){
            String token = matcher.group().substring(1,matcher.group().length()).trim();
            matcher.appendReplacement(buffer, "\t<li>"+token+"</li>");
        }
        matcher.appendTail(buffer);
        transformedText = buffer.toString();

        buffer = new StringBuffer();
        Pattern lhPattern = Pattern.compile("^?[\\p{Print}\\p{L}]+[:?]{1}\\n+\\t{1}<li>{1}$?");
        Matcher lhMatcher = lhPattern.matcher(transformedText);
        while(lhMatcher.find()){
            String lh = lhMatcher.group().replaceAll("<li>","");
            lh = lh.replaceAll("\n","");
            lhMatcher.appendReplacement(buffer, "\t<lh>"+lh.trim()+"</lh>\n\t<li>");
        }
        lhMatcher.appendTail(buffer);
        transformedText = buffer.toString();

        //pattern for add <ul> of <li> that be in the beginning of the file.
        Pattern ulTopPattern = Pattern.compile("\\A[\\p{Space}]?<li>");
        Matcher ulTopMatcher = ulTopPattern.matcher(transformedText);
        transformedText = ulTopMatcher.replaceAll("\n<ul>\n\t<li>");

        //pattern for add <ul>
        Pattern ulPattern = Pattern.compile("</p>[\\p{Space}]+<li>");
        Matcher ulMatcher = ulPattern.matcher(transformedText);
        transformedText = ulMatcher.replaceAll("</p>\n<ul>\n\t<li>");

        //pattern for add <ul>
        Pattern ulPattern1 = Pattern.compile("\\t<lh>");
        Matcher ulMatcher1 = ulPattern1.matcher(transformedText);
        transformedText = ulMatcher1.replaceAll("<ul>\n\t<lh>");

        //pattern for add </ul>
        Pattern closeUlPattern = Pattern.compile("</li>[\\n]+<p>");
        Matcher closeUlMatcher = closeUlPattern.matcher(transformedText);
        transformedText = closeUlMatcher.replaceAll("</li>\n</ul>\n<p>");

        Pattern closeUlPattern2 = Pattern.compile("</li>[\\n]{2,}+");
        Matcher closeUlMatcher2 = closeUlPattern2.matcher(transformedText);
        transformedText = closeUlMatcher2.replaceAll("</li>\n</ul>\n");

        //pattern for add </ul> in the end of the file
        Pattern closeUlBottomPattern = Pattern.compile("</li>\\Z");
        Matcher closeUlBottomMatcher = closeUlBottomPattern.matcher(transformedText);
        transformedText = closeUlBottomMatcher.replaceAll("</li>\n</ul>");

        return transformedText.trim();
    }

    public String transformText(String initialText) {
        String completedText;
        completedText = transformBullet(initialText);
        completedText = transformParagraph(completedText);
        completedText = transformTagSymbol(completedText);
        return completedText;
    }
}
