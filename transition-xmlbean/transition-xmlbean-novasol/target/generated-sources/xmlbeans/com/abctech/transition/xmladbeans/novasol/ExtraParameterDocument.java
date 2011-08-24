/*
 * An XML document type.
 * Localname: ExtraParameter
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol;


/**
 * A document containing one ExtraParameter(@) element.
 *
 * This is a complex type.
 */
public interface ExtraParameterDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtraParameterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("extraparameterde52doctype");
    
    /**
     * Gets the "ExtraParameter" element
     */
    com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter getExtraParameter();
    
    /**
     * Sets the "ExtraParameter" element
     */
    void setExtraParameter(com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter extraParameter);
    
    /**
     * Appends and returns a new empty "ExtraParameter" element
     */
    com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter addNewExtraParameter();
    
    /**
     * An XML ExtraParameter(@).
     *
     * This is a complex type.
     */
    public interface ExtraParameter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtraParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("extraparameter32cdelemtype");
        
        /**
         * Gets the "ExtraDescription" element
         */
        java.lang.String getExtraDescription();
        
        /**
         * Gets (as xml) the "ExtraDescription" element
         */
        org.apache.xmlbeans.XmlString xgetExtraDescription();
        
        /**
         * Sets the "ExtraDescription" element
         */
        void setExtraDescription(java.lang.String extraDescription);
        
        /**
         * Sets (as xml) the "ExtraDescription" element
         */
        void xsetExtraDescription(org.apache.xmlbeans.XmlString extraDescription);
        
        /**
         * Gets the "ExtraUnitValue" element
         */
        java.lang.String getExtraUnitValue();
        
        /**
         * Gets (as xml) the "ExtraUnitValue" element
         */
        org.apache.xmlbeans.XmlString xgetExtraUnitValue();
        
        /**
         * Sets the "ExtraUnitValue" element
         */
        void setExtraUnitValue(java.lang.String extraUnitValue);
        
        /**
         * Sets (as xml) the "ExtraUnitValue" element
         */
        void xsetExtraUnitValue(org.apache.xmlbeans.XmlString extraUnitValue);
        
        /**
         * Gets the "ExtraUnit" element
         */
        java.lang.String getExtraUnit();
        
        /**
         * Gets (as xml) the "ExtraUnit" element
         */
        org.apache.xmlbeans.XmlString xgetExtraUnit();
        
        /**
         * Sets the "ExtraUnit" element
         */
        void setExtraUnit(java.lang.String extraUnit);
        
        /**
         * Sets (as xml) the "ExtraUnit" element
         */
        void xsetExtraUnit(org.apache.xmlbeans.XmlString extraUnit);
        
        /**
         * Gets the "ExtraUnitDescription" element
         */
        java.lang.String getExtraUnitDescription();
        
        /**
         * Gets (as xml) the "ExtraUnitDescription" element
         */
        org.apache.xmlbeans.XmlString xgetExtraUnitDescription();
        
        /**
         * Sets the "ExtraUnitDescription" element
         */
        void setExtraUnitDescription(java.lang.String extraUnitDescription);
        
        /**
         * Sets (as xml) the "ExtraUnitDescription" element
         */
        void xsetExtraUnitDescription(org.apache.xmlbeans.XmlString extraUnitDescription);
        
        /**
         * Gets the "id" attribute
         */
        java.math.BigInteger getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.math.BigInteger id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlInteger id);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter newInstance() {
              return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument.ExtraParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument newInstance() {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.ExtraParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
