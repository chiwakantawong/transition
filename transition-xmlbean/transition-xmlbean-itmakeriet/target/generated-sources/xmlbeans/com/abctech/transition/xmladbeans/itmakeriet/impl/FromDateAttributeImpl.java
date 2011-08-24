/*
 * An XML attribute type.
 * Localname: FromDate
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.FromDateAttribute
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one FromDate(@) attribute.
 *
 * This is a complex type.
 */
public class FromDateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.FromDateAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FromDateAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FROMDATE$0 = 
        new javax.xml.namespace.QName("", "FromDate");
    
    
    /**
     * Gets the "FromDate" attribute
     */
    public java.util.Calendar getFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMDATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromDate" attribute
     */
    public org.apache.xmlbeans.XmlDate xgetFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(FROMDATE$0);
            return target;
        }
    }
    
    /**
     * True if has "FromDate" attribute
     */
    public boolean isSetFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FROMDATE$0) != null;
        }
    }
    
    /**
     * Sets the "FromDate" attribute
     */
    public void setFromDate(java.util.Calendar fromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROMDATE$0);
            }
            target.setCalendarValue(fromDate);
        }
    }
    
    /**
     * Sets (as xml) the "FromDate" attribute
     */
    public void xsetFromDate(org.apache.xmlbeans.XmlDate fromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(FROMDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(FROMDATE$0);
            }
            target.set(fromDate);
        }
    }
    
    /**
     * Unsets the "FromDate" attribute
     */
    public void unsetFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FROMDATE$0);
        }
    }
}
