/**
 * CodaFatturazione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class CodaFatturazione  implements java.io.Serializable {
    private java.lang.Integer cdCodaFatturazione;

    private java.lang.Integer cdPagamento;

    private java.lang.Integer cdPersona;

    private java.util.Calendar dataElaborazione;

    public CodaFatturazione() {
    }

    public CodaFatturazione(
           java.lang.Integer cdCodaFatturazione,
           java.lang.Integer cdPagamento,
           java.lang.Integer cdPersona,
           java.util.Calendar dataElaborazione) {
           this.cdCodaFatturazione = cdCodaFatturazione;
           this.cdPagamento = cdPagamento;
           this.cdPersona = cdPersona;
           this.dataElaborazione = dataElaborazione;
    }


    /**
     * Gets the cdCodaFatturazione value for this CodaFatturazione.
     * 
     * @return cdCodaFatturazione
     */
    public java.lang.Integer getCdCodaFatturazione() {
        return cdCodaFatturazione;
    }


    /**
     * Sets the cdCodaFatturazione value for this CodaFatturazione.
     * 
     * @param cdCodaFatturazione
     */
    public void setCdCodaFatturazione(java.lang.Integer cdCodaFatturazione) {
        this.cdCodaFatturazione = cdCodaFatturazione;
    }


    /**
     * Gets the cdPagamento value for this CodaFatturazione.
     * 
     * @return cdPagamento
     */
    public java.lang.Integer getCdPagamento() {
        return cdPagamento;
    }


    /**
     * Sets the cdPagamento value for this CodaFatturazione.
     * 
     * @param cdPagamento
     */
    public void setCdPagamento(java.lang.Integer cdPagamento) {
        this.cdPagamento = cdPagamento;
    }


    /**
     * Gets the cdPersona value for this CodaFatturazione.
     * 
     * @return cdPersona
     */
    public java.lang.Integer getCdPersona() {
        return cdPersona;
    }


    /**
     * Sets the cdPersona value for this CodaFatturazione.
     * 
     * @param cdPersona
     */
    public void setCdPersona(java.lang.Integer cdPersona) {
        this.cdPersona = cdPersona;
    }


    /**
     * Gets the dataElaborazione value for this CodaFatturazione.
     * 
     * @return dataElaborazione
     */
    public java.util.Calendar getDataElaborazione() {
        return dataElaborazione;
    }


    /**
     * Sets the dataElaborazione value for this CodaFatturazione.
     * 
     * @param dataElaborazione
     */
    public void setDataElaborazione(java.util.Calendar dataElaborazione) {
        this.dataElaborazione = dataElaborazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodaFatturazione)) return false;
        CodaFatturazione other = (CodaFatturazione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdCodaFatturazione==null && other.getCdCodaFatturazione()==null) || 
             (this.cdCodaFatturazione!=null &&
              this.cdCodaFatturazione.equals(other.getCdCodaFatturazione()))) &&
            ((this.cdPagamento==null && other.getCdPagamento()==null) || 
             (this.cdPagamento!=null &&
              this.cdPagamento.equals(other.getCdPagamento()))) &&
            ((this.cdPersona==null && other.getCdPersona()==null) || 
             (this.cdPersona!=null &&
              this.cdPersona.equals(other.getCdPersona()))) &&
            ((this.dataElaborazione==null && other.getDataElaborazione()==null) || 
             (this.dataElaborazione!=null &&
              this.dataElaborazione.equals(other.getDataElaborazione())));
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
        if (getCdCodaFatturazione() != null) {
            _hashCode += getCdCodaFatturazione().hashCode();
        }
        if (getCdPagamento() != null) {
            _hashCode += getCdPagamento().hashCode();
        }
        if (getCdPersona() != null) {
            _hashCode += getCdPersona().hashCode();
        }
        if (getDataElaborazione() != null) {
            _hashCode += getDataElaborazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodaFatturazione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "codaFatturazione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdCodaFatturazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdCodaFatturazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataElaborazione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataElaborazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
