/**
 * Investimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Investimento  implements java.io.Serializable {
    private java.lang.Integer cdInvestimento;

    private java.lang.Integer cdSponsor;

    private java.lang.Integer totaleInvestimento;

    public Investimento() {
    }

    public Investimento(
           java.lang.Integer cdInvestimento,
           java.lang.Integer cdSponsor,
           java.lang.Integer totaleInvestimento) {
           this.cdInvestimento = cdInvestimento;
           this.cdSponsor = cdSponsor;
           this.totaleInvestimento = totaleInvestimento;
    }


    /**
     * Gets the cdInvestimento value for this Investimento.
     * 
     * @return cdInvestimento
     */
    public java.lang.Integer getCdInvestimento() {
        return cdInvestimento;
    }


    /**
     * Sets the cdInvestimento value for this Investimento.
     * 
     * @param cdInvestimento
     */
    public void setCdInvestimento(java.lang.Integer cdInvestimento) {
        this.cdInvestimento = cdInvestimento;
    }


    /**
     * Gets the cdSponsor value for this Investimento.
     * 
     * @return cdSponsor
     */
    public java.lang.Integer getCdSponsor() {
        return cdSponsor;
    }


    /**
     * Sets the cdSponsor value for this Investimento.
     * 
     * @param cdSponsor
     */
    public void setCdSponsor(java.lang.Integer cdSponsor) {
        this.cdSponsor = cdSponsor;
    }


    /**
     * Gets the totaleInvestimento value for this Investimento.
     * 
     * @return totaleInvestimento
     */
    public java.lang.Integer getTotaleInvestimento() {
        return totaleInvestimento;
    }


    /**
     * Sets the totaleInvestimento value for this Investimento.
     * 
     * @param totaleInvestimento
     */
    public void setTotaleInvestimento(java.lang.Integer totaleInvestimento) {
        this.totaleInvestimento = totaleInvestimento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Investimento)) return false;
        Investimento other = (Investimento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdInvestimento==null && other.getCdInvestimento()==null) || 
             (this.cdInvestimento!=null &&
              this.cdInvestimento.equals(other.getCdInvestimento()))) &&
            ((this.cdSponsor==null && other.getCdSponsor()==null) || 
             (this.cdSponsor!=null &&
              this.cdSponsor.equals(other.getCdSponsor()))) &&
            ((this.totaleInvestimento==null && other.getTotaleInvestimento()==null) || 
             (this.totaleInvestimento!=null &&
              this.totaleInvestimento.equals(other.getTotaleInvestimento())));
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
        if (getCdInvestimento() != null) {
            _hashCode += getCdInvestimento().hashCode();
        }
        if (getCdSponsor() != null) {
            _hashCode += getCdSponsor().hashCode();
        }
        if (getTotaleInvestimento() != null) {
            _hashCode += getTotaleInvestimento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Investimento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "investimento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdInvestimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdInvestimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdSponsor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdSponsor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleInvestimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totaleInvestimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
