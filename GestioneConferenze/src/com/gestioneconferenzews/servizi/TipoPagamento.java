/**
 * TipoPagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class TipoPagamento  implements java.io.Serializable {
    private java.lang.Integer cdTipoPagamento;

    private java.lang.String tipoPagamento;

    public TipoPagamento() {
    }

    public TipoPagamento(
           java.lang.Integer cdTipoPagamento,
           java.lang.String tipoPagamento) {
           this.cdTipoPagamento = cdTipoPagamento;
           this.tipoPagamento = tipoPagamento;
    }


    /**
     * Gets the cdTipoPagamento value for this TipoPagamento.
     * 
     * @return cdTipoPagamento
     */
    public java.lang.Integer getCdTipoPagamento() {
        return cdTipoPagamento;
    }


    /**
     * Sets the cdTipoPagamento value for this TipoPagamento.
     * 
     * @param cdTipoPagamento
     */
    public void setCdTipoPagamento(java.lang.Integer cdTipoPagamento) {
        this.cdTipoPagamento = cdTipoPagamento;
    }


    /**
     * Gets the tipoPagamento value for this TipoPagamento.
     * 
     * @return tipoPagamento
     */
    public java.lang.String getTipoPagamento() {
        return tipoPagamento;
    }


    /**
     * Sets the tipoPagamento value for this TipoPagamento.
     * 
     * @param tipoPagamento
     */
    public void setTipoPagamento(java.lang.String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoPagamento)) return false;
        TipoPagamento other = (TipoPagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdTipoPagamento==null && other.getCdTipoPagamento()==null) || 
             (this.cdTipoPagamento!=null &&
              this.cdTipoPagamento.equals(other.getCdTipoPagamento()))) &&
            ((this.tipoPagamento==null && other.getTipoPagamento()==null) || 
             (this.tipoPagamento!=null &&
              this.tipoPagamento.equals(other.getTipoPagamento())));
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
        if (getCdTipoPagamento() != null) {
            _hashCode += getCdTipoPagamento().hashCode();
        }
        if (getTipoPagamento() != null) {
            _hashCode += getTipoPagamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoPagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "tipoPagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdTipoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdTipoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
