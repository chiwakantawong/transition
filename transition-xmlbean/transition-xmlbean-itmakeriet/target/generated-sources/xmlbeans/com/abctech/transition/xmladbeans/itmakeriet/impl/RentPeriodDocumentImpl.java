/*
 * An XML document type.
 * Localname: RentPeriod
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.itmakeriet.impl;
/**
 * A document containing one RentPeriod(@) element.
 *
 * This is a complex type.
 */
public class RentPeriodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public RentPeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENTPERIOD$0 = 
        new javax.xml.namespace.QName("", "RentPeriod");
    
    
    /**
     * Gets the "RentPeriod" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod getRentPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().find_element_user(RENTPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RentPeriod" element
     */
    public void setRentPeriod(com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod rentPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().find_element_user(RENTPERIOD$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().add_element_user(RENTPERIOD$0);
            }
            target.set(rentPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "RentPeriod" element
     */
    public com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod addNewRentPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod target = null;
            target = (com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod)get_store().add_element_user(RENTPERIOD$0);
            return target;
        }
    }
    /**
     * An XML RentPeriod(@).
     *
     * This is a complex type.
     */
    public static class RentPeriodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.itmakeriet.RentPeriodDocument.RentPeriod
    {
        private static final long serialVersionUID = 1L;
        
        public RentPeriodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FROMDATE$0 = 
            new javax.xml.namespace.QName("", "FromDate");
        private static final javax.xml.namespace.QName TODATE$2 = 
            new javax.xml.namespace.QName("", "ToDate");
        
        
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
        
        /**
         * Gets the "ToDate" attribute
         */
        public java.util.Calendar getToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TODATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ToDate" attribute
         */
        public org.apache.xmlbeans.XmlDate xgetToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(TODATE$2);
                return target;
            }
        }
        
        /**
         * True if has "ToDate" attribute
         */
        public boolean isSetToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TODATE$2) != null;
            }
        }
        
        /**
         * Sets the "ToDate" attribute
         */
        public void setToDate(java.util.Calendar toDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TODATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TODATE$2);
                }
                target.setCalendarValue(toDate);
            }
        }
        
        /**
         * Sets (as xml) the "ToDate" attribute
         */
        public void xsetToDate(org.apache.xmlbeans.XmlDate toDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(TODATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(TODATE$2);
                }
                target.set(toDate);
            }
        }
        
        /**
         * Unsets the "ToDate" attribute
         */
        public void unsetToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TODATE$2);
            }
        }
    }
}
