/*
 * An XML attribute type.
 * Localname: navn
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webmegler.NavnAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webmegler;


/**
 * A document containing one navn(@) attribute.
 *
 * This is a complex type.
 */
public interface NavnAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NavnAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBADB065799051ABAAEC84CCEDD437E16").resolveHandle("navn7856attrtypetype");
    
    /**
     * Gets the "navn" attribute
     */
    java.lang.String getNavn();
    
    /**
     * Gets (as xml) the "navn" attribute
     */
    org.apache.xmlbeans.XmlString xgetNavn();
    
    /**
     * True if has "navn" attribute
     */
    boolean isSetNavn();
    
    /**
     * Sets the "navn" attribute
     */
    void setNavn(java.lang.String navn);
    
    /**
     * Sets (as xml) the "navn" attribute
     */
    void xsetNavn(org.apache.xmlbeans.XmlString navn);
    
    /**
     * Unsets the "navn" attribute
     */
    void unsetNavn();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute newInstance() {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.webmegler.NavnAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.webmegler.NavnAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
