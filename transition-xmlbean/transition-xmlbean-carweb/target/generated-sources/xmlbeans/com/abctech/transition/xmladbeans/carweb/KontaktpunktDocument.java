/*
 * An XML document type.
 * Localname: Kontaktpunkt
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.carweb;


/**
 * A document containing one Kontaktpunkt(@) element.
 *
 * This is a complex type.
 */
public interface KontaktpunktDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KontaktpunktDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9373557F8D6FA65C8CFB65539838B1CE").resolveHandle("kontaktpunkt062bdoctype");
    
    /**
     * Gets the "Kontaktpunkt" element
     */
    com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt getKontaktpunkt();
    
    /**
     * Sets the "Kontaktpunkt" element
     */
    void setKontaktpunkt(com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt kontaktpunkt);
    
    /**
     * Appends and returns a new empty "Kontaktpunkt" element
     */
    com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt addNewKontaktpunkt();
    
    /**
     * An XML Kontaktpunkt(@).
     *
     * This is a complex type.
     */
    public interface Kontaktpunkt extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Kontaktpunkt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9373557F8D6FA65C8CFB65539838B1CE").resolveHandle("kontaktpunkt28adelemtype");
        
        /**
         * Gets the "Navn" element
         */
        java.lang.String getNavn();
        
        /**
         * Gets (as xml) the "Navn" element
         */
        org.apache.xmlbeans.XmlString xgetNavn();
        
        /**
         * Sets the "Navn" element
         */
        void setNavn(java.lang.String navn);
        
        /**
         * Sets (as xml) the "Navn" element
         */
        void xsetNavn(org.apache.xmlbeans.XmlString navn);
        
        /**
         * Gets the "Telefon" element
         */
        java.lang.String getTelefon();
        
        /**
         * Gets (as xml) the "Telefon" element
         */
        org.apache.xmlbeans.XmlString xgetTelefon();
        
        /**
         * Sets the "Telefon" element
         */
        void setTelefon(java.lang.String telefon);
        
        /**
         * Sets (as xml) the "Telefon" element
         */
        void xsetTelefon(org.apache.xmlbeans.XmlString telefon);
        
        /**
         * Gets the "Mobil" element
         */
        java.lang.String getMobil();
        
        /**
         * Gets (as xml) the "Mobil" element
         */
        org.apache.xmlbeans.XmlString xgetMobil();
        
        /**
         * Sets the "Mobil" element
         */
        void setMobil(java.lang.String mobil);
        
        /**
         * Sets (as xml) the "Mobil" element
         */
        void xsetMobil(org.apache.xmlbeans.XmlString mobil);
        
        /**
         * Gets the "Email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "Email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * Sets the "Email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "Email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Gets the "Beskrivelse" element
         */
        java.lang.String getBeskrivelse();
        
        /**
         * Gets (as xml) the "Beskrivelse" element
         */
        org.apache.xmlbeans.XmlString xgetBeskrivelse();
        
        /**
         * Sets the "Beskrivelse" element
         */
        void setBeskrivelse(java.lang.String beskrivelse);
        
        /**
         * Sets (as xml) the "Beskrivelse" element
         */
        void xsetBeskrivelse(org.apache.xmlbeans.XmlString beskrivelse);
        
        /**
         * Gets the "Javascript" element
         */
        java.lang.String getJavascript();
        
        /**
         * Gets (as xml) the "Javascript" element
         */
        org.apache.xmlbeans.XmlString xgetJavascript();
        
        /**
         * Sets the "Javascript" element
         */
        void setJavascript(java.lang.String javascript);
        
        /**
         * Sets (as xml) the "Javascript" element
         */
        void xsetJavascript(org.apache.xmlbeans.XmlString javascript);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt newInstance() {
              return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument.Kontaktpunkt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument newInstance() {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.abctech.transition.xmladbeans.carweb.KontaktpunktDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
