/*
 * An XML document type.
 * Localname: Fridge
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.novasol.FridgeDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.novasol;


/**
 * A document containing one Fridge(@) element.
 *
 * This is a complex type.
 */
public interface FridgeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FridgeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6773B5CF247989E1CC9CB9D8F0583EF8").resolveHandle("fridgefbdedoctype");
    
    /**
     * Gets the "Fridge" element
     */
    java.lang.String getFridge();
    
    /**
     * Gets (as xml) the "Fridge" element
     */
    org.apache.xmlbeans.XmlString xgetFridge();
    
    /**
     * Sets the "Fridge" element
     */
    void setFridge(java.lang.String fridge);
    
    /**
     * Sets (as xml) the "Fridge" element
     */
    void xsetFridge(org.apache.xmlbeans.XmlString fridge);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument newInstance() {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.novasol.FridgeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.novasol.FridgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
