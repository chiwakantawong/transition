/*
 * An XML document type.
 * Localname: BROKER
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.iadifestateforsale.impl;
/**
 * A document containing one BROKER(@) element.
 *
 * This is a complex type.
 */
public class BROKERDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument
{
    private static final long serialVersionUID = 1L;
    
    public BROKERDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROKER$0 = 
        new javax.xml.namespace.QName("", "BROKER");
    
    
    /**
     * Gets the "BROKER" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER getBROKER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BROKER" element
     */
    public void setBROKER(com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER broker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().find_element_user(BROKER$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().add_element_user(BROKER$0);
            }
            target.set(broker);
        }
    }
    
    /**
     * Appends and returns a new empty "BROKER" element
     */
    public com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER addNewBROKER()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER target = null;
            target = (com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER)get_store().add_element_user(BROKER$0);
            return target;
        }
    }
    /**
     * An XML BROKER(@).
     *
     * This is a complex type.
     */
    public static class BROKERImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.iadifestateforsale.BROKERDocument.BROKER
    {
        private static final long serialVersionUID = 1L;
        
        public BROKERImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "NAME");
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("", "TITLE");
        private static final javax.xml.namespace.QName PHONE$4 = 
            new javax.xml.namespace.QName("", "PHONE");
        private static final javax.xml.namespace.QName MOBILE$6 = 
            new javax.xml.namespace.QName("", "MOBILE");
        private static final javax.xml.namespace.QName EMAIL$8 = 
            new javax.xml.namespace.QName("", "EMAIL");
        private static final javax.xml.namespace.QName FAX$10 = 
            new javax.xml.namespace.QName("", "FAX");
        private static final javax.xml.namespace.QName URL$12 = 
            new javax.xml.namespace.QName("", "URL");
        private static final javax.xml.namespace.QName IMAGEREF$14 = 
            new javax.xml.namespace.QName("", "IMAGE_REF");
        
        
        /**
         * Gets the "NAME" element
         */
        public java.lang.String getNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NAME" element
         */
        public org.apache.xmlbeans.XmlString xgetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "NAME" element
         */
        public boolean isSetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0) != 0;
            }
        }
        
        /**
         * Sets the "NAME" element
         */
        public void setNAME(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "NAME" element
         */
        public void xsetNAME(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "NAME" element
         */
        public void unsetNAME()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, 0);
            }
        }
        
        /**
         * Gets the "TITLE" element
         */
        public java.lang.String getTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TITLE" element
         */
        public org.apache.xmlbeans.XmlString xgetTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "TITLE" element
         */
        public boolean isSetTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$2) != 0;
            }
        }
        
        /**
         * Sets the "TITLE" element
         */
        public void setTITLE(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$2);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "TITLE" element
         */
        public void xsetTITLE(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$2);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "TITLE" element
         */
        public void unsetTITLE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$2, 0);
            }
        }
        
        /**
         * Gets the "PHONE" element
         */
        public java.lang.String getPHONE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PHONE" element
         */
        public org.apache.xmlbeans.XmlString xgetPHONE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "PHONE" element
         */
        public boolean isSetPHONE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHONE$4) != 0;
            }
        }
        
        /**
         * Sets the "PHONE" element
         */
        public void setPHONE(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$4);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "PHONE" element
         */
        public void xsetPHONE(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$4);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "PHONE" element
         */
        public void unsetPHONE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHONE$4, 0);
            }
        }
        
        /**
         * Gets the "MOBILE" element
         */
        public java.lang.String getMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MOBILE" element
         */
        public org.apache.xmlbeans.XmlString xgetMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "MOBILE" element
         */
        public boolean isSetMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOBILE$6) != 0;
            }
        }
        
        /**
         * Sets the "MOBILE" element
         */
        public void setMOBILE(java.lang.String mobile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILE$6);
                }
                target.setStringValue(mobile);
            }
        }
        
        /**
         * Sets (as xml) the "MOBILE" element
         */
        public void xsetMOBILE(org.apache.xmlbeans.XmlString mobile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOBILE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOBILE$6);
                }
                target.set(mobile);
            }
        }
        
        /**
         * Unsets the "MOBILE" element
         */
        public void unsetMOBILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOBILE$6, 0);
            }
        }
        
        /**
         * Gets the "EMAIL" element
         */
        public java.lang.String getEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EMAIL" element
         */
        public org.apache.xmlbeans.XmlString xgetEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "EMAIL" element
         */
        public boolean isSetEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$8) != 0;
            }
        }
        
        /**
         * Sets the "EMAIL" element
         */
        public void setEMAIL(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$8);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "EMAIL" element
         */
        public void xsetEMAIL(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$8);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "EMAIL" element
         */
        public void unsetEMAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$8, 0);
            }
        }
        
        /**
         * Gets the "FAX" element
         */
        public java.lang.String getFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FAX" element
         */
        public org.apache.xmlbeans.XmlString xgetFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "FAX" element
         */
        public boolean isSetFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAX$10) != 0;
            }
        }
        
        /**
         * Sets the "FAX" element
         */
        public void setFAX(java.lang.String fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$10);
                }
                target.setStringValue(fax);
            }
        }
        
        /**
         * Sets (as xml) the "FAX" element
         */
        public void xsetFAX(org.apache.xmlbeans.XmlString fax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$10);
                }
                target.set(fax);
            }
        }
        
        /**
         * Unsets the "FAX" element
         */
        public void unsetFAX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAX$10, 0);
            }
        }
        
        /**
         * Gets the "URL" element
         */
        public java.lang.String getURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "URL" element
         */
        public org.apache.xmlbeans.XmlString xgetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "URL" element
         */
        public boolean isSetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$12) != 0;
            }
        }
        
        /**
         * Sets the "URL" element
         */
        public void setURL(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$12);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "URL" element
         */
        public void xsetURL(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$12);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "URL" element
         */
        public void unsetURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$12, 0);
            }
        }
        
        /**
         * Gets the "IMAGE_REF" element
         */
        public java.lang.String getIMAGEREF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEREF$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IMAGE_REF" element
         */
        public org.apache.xmlbeans.XmlString xgetIMAGEREF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEREF$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "IMAGE_REF" element
         */
        public boolean isSetIMAGEREF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMAGEREF$14) != 0;
            }
        }
        
        /**
         * Sets the "IMAGE_REF" element
         */
        public void setIMAGEREF(java.lang.String imageref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGEREF$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGEREF$14);
                }
                target.setStringValue(imageref);
            }
        }
        
        /**
         * Sets (as xml) the "IMAGE_REF" element
         */
        public void xsetIMAGEREF(org.apache.xmlbeans.XmlString imageref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMAGEREF$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMAGEREF$14);
                }
                target.set(imageref);
            }
        }
        
        /**
         * Unsets the "IMAGE_REF" element
         */
        public void unsetIMAGEREF()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMAGEREF$14, 0);
            }
        }
    }
}
