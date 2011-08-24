/*
 * An XML document type.
 * Localname: Role
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.webcruiter.RoleDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.webcruiter.impl;
/**
 * A document containing one Role(@) element.
 *
 * This is a complex type.
 */
public class RoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.RoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("", "Role");
    
    
    /**
     * Gets the "Role" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Role" element
     */
    public void setRole(com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().add_element_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Appends and returns a new empty "Role" element
     */
    public com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role target = null;
            target = (com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    /**
     * An XML Role(@).
     *
     * This is a complex type.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.webcruiter.RoleDocument.Role
    {
        private static final long serialVersionUID = 1L;
        
        public RoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "Name");
        
        
        /**
         * Gets the "Name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "Name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "Name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "Name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
    }
}