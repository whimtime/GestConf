/**
 * Pagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Pagamento  implements java.io.Serializable {
    private java.lang.Integer cdConferenza;

    private java.lang.Integer cdMetodoPagamento;

    private java.lang.Integer cdPagamento;

    private java.lang.Integer cdPersona;

    private java.util.Calendar dataPagamento;

    private java.lang.String tipoMovimento;

    private java.lang.Integer totaleEuro;

    public Pagamento() {
    }

    public Pagamento(
           java.lang.Integer cdConferenza,
           java.lang.Integer cdMetodoPagamento,
           java.lang.Integer cdPagamento,
           java.lang.Integer cdPersona,
           java.util.Calendar dataPagamento,
           java.lang.String tipoMovimento,
           java.lang.Integer totaleEuro) {
           this.cdConferenza = cdConferenza;
           this.cdMetodoPagamento = cdMetodoPagamento;
           this.cdPagamento = cdPagamento;
           this.cdPersona = cdPersona;
           this.dataPagamento = dataPagamento;
           this.tipoMovimento = tipoMovimento;
           this.totaleEuro = totaleEuro;
    }


    /**
     * Gets the cdConferenza value for this Pagamento.
     * 
     * @return cdConferenza
     */
    public java.lang.Integer getCdConferenza() {
        return cdConferenza;
    }


    /**
     * Sets the cdConferenza value for this Pagamento.
     * 
     * @param cdConferenza
     */
    public void setCdConferenza(java.lang.Integer cdConferenza) {
        this.cdConferenza = cdConferenza;
    }


    /**
     * Gets the cdMetodoPagamento value for this Pagamento.
     * 
     * @return cdMetodoPagamento
     */
    public java.lang.Integer getCdMetodoPagamento() {
        return cdMetodoPagamento;
    }


    /**
     * Sets the cdMetodoPagamento value for this Pagamento.
     * 
     * @param cdMetodoPagamento
     */
    public void setCdMetodoPagamento(java.lang.Integer cdMetodoPagamento) {
        this.cdMetodoPagamento = cdMetodoPagamento;
    }


    /**
     * Gets the cdPagamento value for this Pagamento.
     * 
     * @return cdPagamento
     */
    public java.lang.Integer getCdPagamento() {
        return cdPagamento;
    }


    /**
     * Sets the cdPagamento value for this Pagamento.
     * 
     * @param cdPagamento
     */
    public void setCdPagamento(java.lang.Integer cdPagamento) {
        this.cdPagamento = cdPagamento;
    }


    /**
     * Gets the cdPersona value for this Pagamento.
     * 
     * @return cdPersona
     */
    public java.lang.Integer getCdPersona() {
        return cdPersona;
    }


    /**
     * Sets the cdPersona value for this Pagamento.
     * 
     * @param cdPersona
     */
    public void setCdPersona(java.lang.Integer cdPersona) {
        this.cdPersona = cdPersona;
    }


    /**
     * Gets the dataPagamento value for this Pagamento.
     * 
     * @return dataPagamento
     */
    public java.util.Calendar getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this Pagamento.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.util.Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the tipoMovimento value for this Pagamento.
     * 
     * @return tipoMovimento
     */
    public java.lang.String getTipoMovimento() {
        return tipoMovimento;
    }


    /**
     * Sets the tipoMovimento value for this Pagamento.
     * 
     * @param tipoMovimento
     */
    public void setTipoMovimento(java.lang.String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }


    /**
     * Gets the totaleEuro value for this Pagamento.
     * 
     * @return totaleEuro
     */
    public java.lang.Integer getTotaleEuro() {
        return totaleEuro;
    }


    /**
     * Sets the totaleEuro value for this Pagamento.
     * 
     * @param totaleEuro
     */
    public void setTotaleEuro(java.lang.Integer totaleEuro) {
        this.totaleEuro = totaleEuro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pagamento)) return false;
        Pagamento other = (Pagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdConferenza==null && other.getCdConferenza()==null) || 
             (this.cdConferenza!=null &&
              this.cdConferenza.equals(other.getCdConferenza()))) &&
            ((this.cdMetodoPagamento==null && other.getCdMetodoPagamento()==null) || 
             (this.cdMetodoPagamento!=null &&
              this.cdMetodoPagamento.equals(other.getCdMetodoPagamento()))) &&
            ((this.cdPagamento==null && other.getCdPagamento()==null) || 
             (this.cdPagamento!=null &&
              this.cdPagamento.equals(other.getCdPagamento()))) &&
            ((this.cdPersona==null && other.getCdPersona()==null) || 
             (this.cdPersona!=null &&
              this.cdPersona.equals(other.getCdPersona()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.tipoMovimento==null && other.getTipoMovimento()==null) || 
             (this.tipoMovimento!=null &&
              this.tipoMovimento.equals(other.getTipoMovimento()))) &&
            ((this.totaleEuro==null && other.getTotaleEuro()==null) || 
             (this.totaleEuro!=null &&
              this.totaleEuro.equals(other.getTotaleEuro())));
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
        if (getCdConferenza() != null) {
            _hashCode += getCdConferenza().hashCode();
        }
        if (getCdMetodoPagamento() != null) {
            _hashCode += getCdMetodoPagamento().hashCode();
        }
        if (getCdPagamento() != null) {
            _hashCode += getCdPagamento().hashCode();
        }
        if (getCdPersona() != null) {
            _hashCode += getCdPersona().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getTipoMovimento() != null) {
            _hashCode += getTipoMovimento().hashCode();
        }
        if (getTotaleEuro() != null) {
            _hashCode += getTotaleEuro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "pagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdConferenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdConferenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdMetodoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdMetodoPagamento"));
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
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMovimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoMovimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaleEuro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totaleEuro"));
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
