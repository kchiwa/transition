/*
 * An XML document type.
 * Localname: finnparametre
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webtemp;


/**
 * A document containing one finnparametre(@) element.
 *
 * This is a complex type.
 */
public interface FinnparametreDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinnparametreDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("finnparametrecef3doctype");
    
    /**
     * Gets the "finnparametre" element
     */
    com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre getFinnparametre();
    
    /**
     * Sets the "finnparametre" element
     */
    void setFinnparametre(com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre finnparametre);
    
    /**
     * Appends and returns a new empty "finnparametre" element
     */
    com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre addNewFinnparametre();
    
    /**
     * An XML finnparametre(@).
     *
     * This is a complex type.
     */
    public interface Finnparametre extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Finnparametre.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4F549605795CEFF236BA01905483D4FA").resolveHandle("finnparametre1c3belemtype");
        
        /**
         * Gets array of all "job_category" elements
         */
        com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory[] getJobCategoryArray();
        
        /**
         * Gets ith "job_category" element
         */
        com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory getJobCategoryArray(int i);
        
        /**
         * Returns number of "job_category" element
         */
        int sizeOfJobCategoryArray();
        
        /**
         * Sets array of all "job_category" element
         */
        void setJobCategoryArray(com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory[] jobCategoryArray);
        
        /**
         * Sets ith "job_category" element
         */
        void setJobCategoryArray(int i, com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory jobCategory);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "job_category" element
         */
        com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory insertNewJobCategory(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "job_category" element
         */
        com.abctech.transition.xmladbeans.webtemp.JobCategoryDocument.JobCategory addNewJobCategory();
        
        /**
         * Removes the ith "job_category" element
         */
        void removeJobCategory(int i);
        
        /**
         * Gets the "duration" element
         */
        java.lang.String getDuration();
        
        /**
         * Gets (as xml) the "duration" element
         */
        org.apache.xmlbeans.XmlString xgetDuration();
        
        /**
         * True if has "duration" element
         */
        boolean isSetDuration();
        
        /**
         * Sets the "duration" element
         */
        void setDuration(java.lang.String duration);
        
        /**
         * Sets (as xml) the "duration" element
         */
        void xsetDuration(org.apache.xmlbeans.XmlString duration);
        
        /**
         * Unsets the "duration" element
         */
        void unsetDuration();
        
        /**
         * Gets the "sector" element
         */
        java.lang.String getSector();
        
        /**
         * Gets (as xml) the "sector" element
         */
        org.apache.xmlbeans.XmlString xgetSector();
        
        /**
         * Sets the "sector" element
         */
        void setSector(java.lang.String sector);
        
        /**
         * Sets (as xml) the "sector" element
         */
        void xsetSector(org.apache.xmlbeans.XmlString sector);
        
        /**
         * Gets the "role" element
         */
        java.lang.String getRole();
        
        /**
         * Gets (as xml) the "role" element
         */
        org.apache.xmlbeans.XmlString xgetRole();
        
        /**
         * True if has "role" element
         */
        boolean isSetRole();
        
        /**
         * Sets the "role" element
         */
        void setRole(java.lang.String role);
        
        /**
         * Sets (as xml) the "role" element
         */
        void xsetRole(org.apache.xmlbeans.XmlString role);
        
        /**
         * Unsets the "role" element
         */
        void unsetRole();
        
        /**
         * Gets the "extent" element
         */
        java.lang.String getExtent();
        
        /**
         * Gets (as xml) the "extent" element
         */
        org.apache.xmlbeans.XmlString xgetExtent();
        
        /**
         * True if has "extent" element
         */
        boolean isSetExtent();
        
        /**
         * Sets the "extent" element
         */
        void setExtent(java.lang.String extent);
        
        /**
         * Sets (as xml) the "extent" element
         */
        void xsetExtent(org.apache.xmlbeans.XmlString extent);
        
        /**
         * Unsets the "extent" element
         */
        void unsetExtent();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre newInstance() {
              return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument.Finnparametre) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument newInstance() {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webtemp.FinnparametreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
