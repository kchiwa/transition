/*
 * An XML document type.
 * Localname: dkk
 * Namespace: 
 * Java type: com.abctech.transition.xmladbeans.sologstrand.DkkDocument
 *
 * Automatically generated - do not modify.
 */
package com.abctech.transition.xmladbeans.sologstrand.impl;
/**
 * A document containing one dkk(@) element.
 *
 * This is a complex type.
 */
public class DkkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.DkkDocument
{
    private static final long serialVersionUID = 1L;
    
    public DkkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DKK$0 = 
        new javax.xml.namespace.QName("", "dkk");
    
    
    /**
     * Gets the "dkk" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk getDkk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().find_element_user(DKK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dkk" element
     */
    public void setDkk(com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk dkk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().find_element_user(DKK$0, 0);
            if (target == null)
            {
                target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().add_element_user(DKK$0);
            }
            target.set(dkk);
        }
    }
    
    /**
     * Appends and returns a new empty "dkk" element
     */
    public com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk addNewDkk()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk target = null;
            target = (com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk)get_store().add_element_user(DKK$0);
            return target;
        }
    }
    /**
     * An XML dkk(@).
     *
     * This is a complex type.
     */
    public static class DkkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.abctech.transition.xmladbeans.sologstrand.DkkDocument.Dkk
    {
        private static final long serialVersionUID = 1L;
        
        public DkkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ELECTRICITY$0 = 
            new javax.xml.namespace.QName("", "electricity");
        private static final javax.xml.namespace.QName OIL$2 = 
            new javax.xml.namespace.QName("", "oil");
        private static final javax.xml.namespace.QName PHONE$4 = 
            new javax.xml.namespace.QName("", "phone");
        private static final javax.xml.namespace.QName GAS$6 = 
            new javax.xml.namespace.QName("", "gas");
        private static final javax.xml.namespace.QName WATER$8 = 
            new javax.xml.namespace.QName("", "water");
        private static final javax.xml.namespace.QName YEAR$10 = 
            new javax.xml.namespace.QName("", "year");
        
        
        /**
         * Gets array of all "electricity" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity[] getElectricityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELECTRICITY$0, targetList);
                com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity[] result = new com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "electricity" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity getElectricityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity)get_store().find_element_user(ELECTRICITY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "electricity" element
         */
        public int sizeOfElectricityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTRICITY$0);
            }
        }
        
        /**
         * Sets array of all "electricity" element
         */
        public void setElectricityArray(com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity[] electricityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(electricityArray, ELECTRICITY$0);
            }
        }
        
        /**
         * Sets ith "electricity" element
         */
        public void setElectricityArray(int i, com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity electricity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity)get_store().find_element_user(ELECTRICITY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(electricity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "electricity" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity insertNewElectricity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity)get_store().insert_element_user(ELECTRICITY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "electricity" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity addNewElectricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.ElectricityDocument.Electricity)get_store().add_element_user(ELECTRICITY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "electricity" element
         */
        public void removeElectricity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTRICITY$0, i);
            }
        }
        
        /**
         * Gets array of all "oil" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil[] getOilArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OIL$2, targetList);
                com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil[] result = new com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "oil" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil getOilArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().find_element_user(OIL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "oil" element
         */
        public int sizeOfOilArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OIL$2);
            }
        }
        
        /**
         * Sets array of all "oil" element
         */
        public void setOilArray(com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil[] oilArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(oilArray, OIL$2);
            }
        }
        
        /**
         * Sets ith "oil" element
         */
        public void setOilArray(int i, com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil oil)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().find_element_user(OIL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(oil);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "oil" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil insertNewOil(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().insert_element_user(OIL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "oil" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil addNewOil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.OilDocument.Oil)get_store().add_element_user(OIL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "oil" element
         */
        public void removeOil(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OIL$2, i);
            }
        }
        
        /**
         * Gets array of all "phone" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone[] getPhoneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PHONE$4, targetList);
                com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone[] result = new com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "phone" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone getPhoneArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone)get_store().find_element_user(PHONE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "phone" element
         */
        public int sizeOfPhoneArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHONE$4);
            }
        }
        
        /**
         * Sets array of all "phone" element
         */
        public void setPhoneArray(com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone[] phoneArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(phoneArray, PHONE$4);
            }
        }
        
        /**
         * Sets ith "phone" element
         */
        public void setPhoneArray(int i, com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone)get_store().find_element_user(PHONE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(phone);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "phone" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone insertNewPhone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone)get_store().insert_element_user(PHONE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "phone" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone addNewPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.PhoneDocument.Phone)get_store().add_element_user(PHONE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "phone" element
         */
        public void removePhone(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHONE$4, i);
            }
        }
        
        /**
         * Gets array of all "gas" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas[] getGasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GAS$6, targetList);
                com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas[] result = new com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "gas" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas getGasArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas)get_store().find_element_user(GAS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "gas" element
         */
        public int sizeOfGasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GAS$6);
            }
        }
        
        /**
         * Sets array of all "gas" element
         */
        public void setGasArray(com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas[] gasArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gasArray, GAS$6);
            }
        }
        
        /**
         * Sets ith "gas" element
         */
        public void setGasArray(int i, com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas gas)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas)get_store().find_element_user(GAS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gas);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gas" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas insertNewGas(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas)get_store().insert_element_user(GAS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gas" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas addNewGas()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.GasDocument.Gas)get_store().add_element_user(GAS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "gas" element
         */
        public void removeGas(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GAS$6, i);
            }
        }
        
        /**
         * Gets array of all "water" elements
         */
        public com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water[] getWaterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WATER$8, targetList);
                com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water[] result = new com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "water" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water getWaterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water)get_store().find_element_user(WATER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "water" element
         */
        public int sizeOfWaterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WATER$8);
            }
        }
        
        /**
         * Sets array of all "water" element
         */
        public void setWaterArray(com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water[] waterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(waterArray, WATER$8);
            }
        }
        
        /**
         * Sets ith "water" element
         */
        public void setWaterArray(int i, com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water water)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water)get_store().find_element_user(WATER$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(water);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "water" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water insertNewWater(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water)get_store().insert_element_user(WATER$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "water" element
         */
        public com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water addNewWater()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water target = null;
                target = (com.abctech.transition.xmladbeans.sologstrand.WaterDocument.Water)get_store().add_element_user(WATER$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "water" element
         */
        public void removeWater(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WATER$8, i);
            }
        }
        
        /**
         * Gets the "year" attribute
         */
        public java.math.BigInteger getYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$10);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "year" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(YEAR$10);
                return target;
            }
        }
        
        /**
         * True if has "year" attribute
         */
        public boolean isSetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(YEAR$10) != null;
            }
        }
        
        /**
         * Sets the "year" attribute
         */
        public void setYear(java.math.BigInteger year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(YEAR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(YEAR$10);
                }
                target.setBigIntegerValue(year);
            }
        }
        
        /**
         * Sets (as xml) the "year" attribute
         */
        public void xsetYear(org.apache.xmlbeans.XmlInteger year)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(YEAR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(YEAR$10);
                }
                target.set(year);
            }
        }
        
        /**
         * Unsets the "year" attribute
         */
        public void unsetYear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(YEAR$10);
            }
        }
    }
}
