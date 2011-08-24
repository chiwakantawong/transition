/*
 * An XML document type.
 * Localname: OBJECT_HEAD
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifstop;


/**
 * A document containing one OBJECT_HEAD(@) element.
 *
 * This is a complex type.
 */
public interface OBJECTHEADDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTHEADDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD1D82FC9AAFF0AB7CDA2E15ABDC89E2").resolveHandle("objectheadb8c7doctype");
    
    /**
     * Gets the "OBJECT_HEAD" element
     */
    com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD getOBJECTHEAD();
    
    /**
     * Sets the "OBJECT_HEAD" element
     */
    void setOBJECTHEAD(com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD objecthead);
    
    /**
     * Appends and returns a new empty "OBJECT_HEAD" element
     */
    com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD addNewOBJECTHEAD();
    
    /**
     * An XML OBJECT_HEAD(@).
     *
     * This is a complex type.
     */
    public interface OBJECTHEAD extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OBJECTHEAD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDD1D82FC9AAFF0AB7CDA2E15ABDC89E2").resolveHandle("objectheadcf23elemtype");
        
        /**
         * Gets the "ORDERNO" element
         */
        java.lang.String getORDERNO();
        
        /**
         * Gets (as xml) the "ORDERNO" element
         */
        org.apache.xmlbeans.XmlString xgetORDERNO();
        
        /**
         * True if has "ORDERNO" element
         */
        boolean isSetORDERNO();
        
        /**
         * Sets the "ORDERNO" element
         */
        void setORDERNO(java.lang.String orderno);
        
        /**
         * Sets (as xml) the "ORDERNO" element
         */
        void xsetORDERNO(org.apache.xmlbeans.XmlString orderno);
        
        /**
         * Unsets the "ORDERNO" element
         */
        void unsetORDERNO();
        
        /**
         * Gets the "PROVIDER_REFERENCE" element
         */
        java.lang.String getPROVIDERREFERENCE();
        
        /**
         * Gets (as xml) the "PROVIDER_REFERENCE" element
         */
        org.apache.xmlbeans.XmlString xgetPROVIDERREFERENCE();
        
        /**
         * True if has "PROVIDER_REFERENCE" element
         */
        boolean isSetPROVIDERREFERENCE();
        
        /**
         * Sets the "PROVIDER_REFERENCE" element
         */
        void setPROVIDERREFERENCE(java.lang.String providerreference);
        
        /**
         * Sets (as xml) the "PROVIDER_REFERENCE" element
         */
        void xsetPROVIDERREFERENCE(org.apache.xmlbeans.XmlString providerreference);
        
        /**
         * Unsets the "PROVIDER_REFERENCE" element
         */
        void unsetPROVIDERREFERENCE();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD newInstance() {
              return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument.OBJECTHEAD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument newInstance() {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.iadifstop.OBJECTHEADDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}