/**
 * StrutturaConvenzionata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gestioneconferenzews.servizi;

public class StrutturaConvenzionata  implements java.io.Serializable {
    private java.lang.Integer cdStrutturaConvenzionata;

    private java.lang.String codiceConvenzione;

    private java.lang.String comune;

    private java.lang.String coordinate;

    private java.lang.String descrizione;

    private java.lang.String indirizzo;

    private java.lang.String nome;

    private java.lang.String tipoServizio;

    private java.lang.Integer tipoStruttura;

    private java.lang.String urlServizio;

    public StrutturaConvenzionata() {
    }

    public StrutturaConvenzionata(
           java.lang.Integer cdStrutturaConvenzionata,
           java.lang.String codiceConvenzione,
           java.lang.String comune,
           java.lang.String coordinate,
           java.lang.String descrizione,
           java.lang.String indirizzo,
           java.lang.String nome,
           java.lang.String tipoServizio,
           java.lang.Integer tipoStruttura,
           java.lang.String urlServizio) {
           this.cdStrutturaConvenzionata = cdStrutturaConvenzionata;
           this.codiceConvenzione = codiceConvenzione;
           this.comune = comune;
           this.coordinate = coordinate;
           this.descrizione = descrizione;
           this.indirizzo = indirizzo;
           this.nome = nome;
           this.tipoServizio = tipoServizio;
           this.tipoStruttura = tipoStruttura;
           this.urlServizio = urlServizio;
    }


    /**
     * Gets the cdStrutturaConvenzionata value for this StrutturaConvenzionata.
     * 
     * @return cdStrutturaConvenzionata
     */
    public java.lang.Integer getCdStrutturaConvenzionata() {
        return cdStrutturaConvenzionata;
    }


    /**
     * Sets the cdStrutturaConvenzionata value for this StrutturaConvenzionata.
     * 
     * @param cdStrutturaConvenzionata
     */
    public void setCdStrutturaConvenzionata(java.lang.Integer cdStrutturaConvenzionata) {
        this.cdStrutturaConvenzionata = cdStrutturaConvenzionata;
    }


    /**
     * Gets the codiceConvenzione value for this StrutturaConvenzionata.
     * 
     * @return codiceConvenzione
     */
    public java.lang.String getCodiceConvenzione() {
        return codiceConvenzione;
    }


    /**
     * Sets the codiceConvenzione value for this StrutturaConvenzionata.
     * 
     * @param codiceConvenzione
     */
    public void setCodiceConvenzione(java.lang.String codiceConvenzione) {
        this.codiceConvenzione = codiceConvenzione;
    }


    /**
     * Gets the comune value for this StrutturaConvenzionata.
     * 
     * @return comune
     */
    public java.lang.String getComune() {
        return comune;
    }


    /**
     * Sets the comune value for this StrutturaConvenzionata.
     * 
     * @param comune
     */
    public void setComune(java.lang.String comune) {
        this.comune = comune;
    }


    /**
     * Gets the coordinate value for this StrutturaConvenzionata.
     * 
     * @return coordinate
     */
    public java.lang.String getCoordinate() {
        return coordinate;
    }


    /**
     * Sets the coordinate value for this StrutturaConvenzionata.
     * 
     * @param coordinate
     */
    public void setCoordinate(java.lang.String coordinate) {
        this.coordinate = coordinate;
    }


    /**
     * Gets the descrizione value for this StrutturaConvenzionata.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this StrutturaConvenzionata.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the indirizzo value for this StrutturaConvenzionata.
     * 
     * @return indirizzo
     */
    public java.lang.String getIndirizzo() {
        return indirizzo;
    }


    /**
     * Sets the indirizzo value for this StrutturaConvenzionata.
     * 
     * @param indirizzo
     */
    public void setIndirizzo(java.lang.String indirizzo) {
        this.indirizzo = indirizzo;
    }


    /**
     * Gets the nome value for this StrutturaConvenzionata.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this StrutturaConvenzionata.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the tipoServizio value for this StrutturaConvenzionata.
     * 
     * @return tipoServizio
     */
    public java.lang.String getTipoServizio() {
        return tipoServizio;
    }


    /**
     * Sets the tipoServizio value for this StrutturaConvenzionata.
     * 
     * @param tipoServizio
     */
    public void setTipoServizio(java.lang.String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }


    /**
     * Gets the tipoStruttura value for this StrutturaConvenzionata.
     * 
     * @return tipoStruttura
     */
    public java.lang.Integer getTipoStruttura() {
        return tipoStruttura;
    }


    /**
     * Sets the tipoStruttura value for this StrutturaConvenzionata.
     * 
     * @param tipoStruttura
     */
    public void setTipoStruttura(java.lang.Integer tipoStruttura) {
        this.tipoStruttura = tipoStruttura;
    }


    /**
     * Gets the urlServizio value for this StrutturaConvenzionata.
     * 
     * @return urlServizio
     */
    public java.lang.String getUrlServizio() {
        return urlServizio;
    }


    /**
     * Sets the urlServizio value for this StrutturaConvenzionata.
     * 
     * @param urlServizio
     */
    public void setUrlServizio(java.lang.String urlServizio) {
        this.urlServizio = urlServizio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StrutturaConvenzionata)) return false;
        StrutturaConvenzionata other = (StrutturaConvenzionata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdStrutturaConvenzionata==null && other.getCdStrutturaConvenzionata()==null) || 
             (this.cdStrutturaConvenzionata!=null &&
              this.cdStrutturaConvenzionata.equals(other.getCdStrutturaConvenzionata()))) &&
            ((this.codiceConvenzione==null && other.getCodiceConvenzione()==null) || 
             (this.codiceConvenzione!=null &&
              this.codiceConvenzione.equals(other.getCodiceConvenzione()))) &&
            ((this.comune==null && other.getComune()==null) || 
             (this.comune!=null &&
              this.comune.equals(other.getComune()))) &&
            ((this.coordinate==null && other.getCoordinate()==null) || 
             (this.coordinate!=null &&
              this.coordinate.equals(other.getCoordinate()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.indirizzo==null && other.getIndirizzo()==null) || 
             (this.indirizzo!=null &&
              this.indirizzo.equals(other.getIndirizzo()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.tipoServizio==null && other.getTipoServizio()==null) || 
             (this.tipoServizio!=null &&
              this.tipoServizio.equals(other.getTipoServizio()))) &&
            ((this.tipoStruttura==null && other.getTipoStruttura()==null) || 
             (this.tipoStruttura!=null &&
              this.tipoStruttura.equals(other.getTipoStruttura()))) &&
            ((this.urlServizio==null && other.getUrlServizio()==null) || 
             (this.urlServizio!=null &&
              this.urlServizio.equals(other.getUrlServizio())));
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
        if (getCdStrutturaConvenzionata() != null) {
            _hashCode += getCdStrutturaConvenzionata().hashCode();
        }
        if (getCodiceConvenzione() != null) {
            _hashCode += getCodiceConvenzione().hashCode();
        }
        if (getComune() != null) {
            _hashCode += getComune().hashCode();
        }
        if (getCoordinate() != null) {
            _hashCode += getCoordinate().hashCode();
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getIndirizzo() != null) {
            _hashCode += getIndirizzo().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getTipoServizio() != null) {
            _hashCode += getTipoServizio().hashCode();
        }
        if (getTipoStruttura() != null) {
            _hashCode += getTipoStruttura().hashCode();
        }
        if (getUrlServizio() != null) {
            _hashCode += getUrlServizio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StrutturaConvenzionata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servizi.gestioneconferenzews.com/", "strutturaConvenzionata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdStrutturaConvenzionata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdStrutturaConvenzionata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceConvenzione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiceConvenzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comune");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coordinate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tipoServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlServizio"));
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
