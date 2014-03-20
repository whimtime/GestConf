/**
 * Conferenza.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class Conferenza  implements java.io.Serializable {
    private java.lang.String cdComuneIstat;

    private java.lang.Integer cdConferenza;

    private java.util.Calendar dataFine;

    private java.util.Calendar dataInizio;

    private java.lang.String indirizzo;

    private java.lang.String nome;

    private java.lang.String sottotitolo;

    public Conferenza() {
    }

    public Conferenza(
           java.lang.String cdComuneIstat,
           java.lang.Integer cdConferenza,
           java.util.Calendar dataFine,
           java.util.Calendar dataInizio,
           java.lang.String indirizzo,
           java.lang.String nome,
           java.lang.String sottotitolo) {
           this.cdComuneIstat = cdComuneIstat;
           this.cdConferenza = cdConferenza;
           this.dataFine = dataFine;
           this.dataInizio = dataInizio;
           this.indirizzo = indirizzo;
           this.nome = nome;
           this.sottotitolo = sottotitolo;
    }


    /**
     * Gets the cdComuneIstat value for this Conferenza.
     * 
     * @return cdComuneIstat
     */
    public java.lang.String getCdComuneIstat() {
        return cdComuneIstat;
    }


    /**
     * Sets the cdComuneIstat value for this Conferenza.
     * 
     * @param cdComuneIstat
     */
    public void setCdComuneIstat(java.lang.String cdComuneIstat) {
        this.cdComuneIstat = cdComuneIstat;
    }


    /**
     * Gets the cdConferenza value for this Conferenza.
     * 
     * @return cdConferenza
     */
    public java.lang.Integer getCdConferenza() {
        return cdConferenza;
    }


    /**
     * Sets the cdConferenza value for this Conferenza.
     * 
     * @param cdConferenza
     */
    public void setCdConferenza(java.lang.Integer cdConferenza) {
        this.cdConferenza = cdConferenza;
    }


    /**
     * Gets the dataFine value for this Conferenza.
     * 
     * @return dataFine
     */
    public java.util.Calendar getDataFine() {
        return dataFine;
    }


    /**
     * Sets the dataFine value for this Conferenza.
     * 
     * @param dataFine
     */
    public void setDataFine(java.util.Calendar dataFine) {
        this.dataFine = dataFine;
    }


    /**
     * Gets the dataInizio value for this Conferenza.
     * 
     * @return dataInizio
     */
    public java.util.Calendar getDataInizio() {
        return dataInizio;
    }


    /**
     * Sets the dataInizio value for this Conferenza.
     * 
     * @param dataInizio
     */
    public void setDataInizio(java.util.Calendar dataInizio) {
        this.dataInizio = dataInizio;
    }


    /**
     * Gets the indirizzo value for this Conferenza.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this Conferenza.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the nome value for this Conferenza.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Conferenza.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the sottotitolo value for this Conferenza.
     * 
     * @return sottotitolo
     */
    public java.lang.String getSottotitolo() {
        return sottotitolo;
    }


    /**
     * Sets the sottotitolo value for this Conferenza.
     * 
     * @param sottotitolo
     */
    public void setSottotitolo(java.lang.String sottotitolo) {
        this.sottotitolo = sottotitolo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Conferenza)) return false;
        Conferenza other = (Conferenza) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdComuneIstat==null && other.getCdComuneIstat()==null) || 
             (this.cdComuneIstat!=null &&
              this.cdComuneIstat.equals(other.getCdComuneIstat()))) &&
            ((this.cdConferenza==null && other.getCdConferenza()==null) || 
             (this.cdConferenza!=null &&
              this.cdConferenza.equals(other.getCdConferenza()))) &&
            ((this.dataFine==null && other.getDataFine()==null) || 
             (this.dataFine!=null &&
              this.dataFine.equals(other.getDataFine()))) &&
            ((this.dataInizio==null && other.getDataInizio()==null) || 
             (this.dataInizio!=null &&
              this.dataInizio.equals(other.getDataInizio()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.sottotitolo==null && other.getSottotitolo()==null) || 
             (this.sottotitolo!=null &&
              this.sottotitolo.equals(other.getSottotitolo())));
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
        if (getCdComuneIstat() != null) {
            _hashCode += getCdComuneIstat().hashCode();
        }
        if (getCdConferenza() != null) {
            _hashCode += getCdConferenza().hashCode();
        }
        if (getDataFine() != null) {
            _hashCode += getDataFine().hashCode();
        }
        if (getDataInizio() != null) {
            _hashCode += getDataInizio().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getSottotitolo() != null) {
            _hashCode += getSottotitolo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Conferenza.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "conferenza"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdComuneIstat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdComuneIstat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdConferenza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdConferenza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indirizzo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sottotitolo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sottotitolo"));
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
