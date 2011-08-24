package com.abctech.transition.core;

public class XmlByXsdTransformationResult {
    // TODO CR Erlend 08042011 This is a bean which should be in the beans package.
    private String transformedContents;
    private boolean errorOccurred;
    private String errorMessage;

    public String getTransformedContents() {
        return transformedContents;
    }

    public boolean isErrorOccurred() {
        return errorOccurred;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setTransformedContents(String transformedContents) {
        this.transformedContents = transformedContents;
    }

    public void setErrorOccurred(boolean errorOccurred) {
        this.errorOccurred = errorOccurred;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
