/**
 * DatiGeografici.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class DatiGeografici  implements java.io.Serializable {
    private com.gestioneconferenzews.servizi.ComuneIstat[] comuni;

    private com.gestioneconferenzews.servizi.Provincia[] province;

    private com.gestioneconferenzews.servizi.Regione[] regioni;

    public DatiGeografici() {
    }

    public DatiGeografici(
           com.gestioneconferenzews.servizi.ComuneIstat[] comuni,
           com.gestioneconferenzews.servizi.Provincia[] province,
           com.gestioneconferenzews.servizi.Regione[] regioni) {
           this.comuni = comuni;
           this.province = province;
           this.regioni = regioni;
    }


    /**
     * Gets the comuni value for this DatiGeografici.
     * 
     * @return comuni
     */
    public com.gestioneconferenzews.servizi.ComuneIstat[] getComuni() {
        return comuni;
    }


    /**
     * Sets the comuni value for this DatiGeografici.
     * 
     * @param comuni
     */
    public void setComuni(com.gestioneconferenzews.servizi.ComuneIstat[] comuni) {
        this.comuni = comuni;
    }

    public com.gestioneconferenzews.servizi.ComuneIstat getComuni(int i) {
        return this.comuni[i];
    }

    public void setComuni(int i, com.gestioneconferenzews.servizi.ComuneIstat _value) {
        this.comuni[i] = _value;
    }


    /**
     * Gets the province value for this DatiGeografici.
     * 
     * @return province
     */
    public com.gestioneconferenzews.servizi.Provincia[] getProvince() {
        return province;
    }


    /**
     * Sets the province value for this DatiGeografici.
     * 
     * @param province
     */
    public void setProvince(com.gestioneconferenzews.servizi.Provincia[] province) {
        this.province = province;
    }

    public com.gestioneconferenzews.servizi.Provincia getProvince(int i) {
        return this.province[i];
    }

    public void setProvince(int i, com.gestioneconferenzews.servizi.Provincia _value) {
        this.province[i] = _value;
    }


    /**
     * Gets the regioni value for this DatiGeografici.
     * 
     * @return regioni
     */
    public com.gestioneconferenzews.servizi.Regione[] getRegioni() {
        return regioni;
    }


    /**
     * Sets the regioni value for this DatiGeografici.
     * 
     * @param regioni
     */
    public void setRegioni(com.gestioneconferenzews.servizi.Regione[] regioni) {
        this.regioni = regioni;
    }

    public com.gestioneconferenzews.servizi.Regione getRegioni(int i) {
        return this.regioni[i];
    }

    public void setRegioni(int i, com.gestioneconferenzews.servizi.Regione _value) {
        this.regioni[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatiGeografici)) return false;
        DatiGeografici other = (DatiGeografici) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comuni==null && other.getComuni()==null) || 
             (this.comuni!=null &&
              java.util.Arrays.equals(this.comuni, other.getComuni()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              java.util.Arrays.equals(this.province, other.getProvince()))) &&
            ((this.regioni==null && other.getRegioni()==null) || 
             (this.regioni!=null &&
              java.util.Arrays.equals(this.regioni, other.getRegioni())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getComuni() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComuni());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComuni(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvince() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProvince());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProvince(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegioni() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegioni());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegioni(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatiGeografici.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "datiGeografici"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuni");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comuni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "comuneIstat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("", "province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "provincia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regioni");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regioni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "regione"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
