<?xml version="1.0" encoding="iso-8859-1"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version='2.0' xmlns:xalan="http://xml.apache.org/xalan"
xmlns:XSLTFunction="http://xml.apache.org/xalan/java/com.abctech.transition.XSLTFunction"
extension-element-prefixes="XSLTFunction"
xmlns:java="http://xml.apache.org/xalan/java"
exclude-result-prefixes="XSLTFunction java">
<xsl:script implements-prefix="XSLTFunction" language="java" src="java:com.abctech.transition.XSLTFunction"/>

    <!-- $Id: carweb.xsl,v 1.5 2009/08/19 08:42:41 tuan Exp $ -->

    <!-- General output settings -->
    <xsl:output method="xml" encoding="UTF-8" indent="yes" standalone="yes"/>

 
    <!--require to send to Java Code -->
    <xsl:param name="xml-file"/>
    

    <xsl:param name="system"/>
    <xsl:param name="version"/>
    <xsl:param name="image-path"/>
    <xsl:param name="source-file"/>


    <xsl:param name="contact-name"/>
    <xsl:param name="contact-email"/>
    <xsl:param name="contact-phone"/>
    <xsl:param name="contact-fax"/>
    <xsl:param name="contact-address"/>
    <xsl:param name="contact-postcode"/>
    <xsl:param name="contact-postlocation"/>


    <xsl:param name="company"/>
    <xsl:param name="created-timestamp"/>
    <xsl:param name="now-timestamp"/>
    <xsl:param name="zett-id"/>
    <xsl:param name="zett-code"/>
    
	 <xsl:template match="Rec">
         <xsl:for-each select="Bil">
	 	<zett.no>
            <Ad>
                <!-- Start Ad attributes -->
                <xsl:attribute name="Company">
                   <xsl:value-of select="$company"/>
                </xsl:attribute>

                <xsl:attribute name="ContactPrivacyStatus">
                    <xsl:text>SHOW_ALL</xsl:text>
                </xsl:attribute>

                <xsl:attribute name="TransactionStatus">
                    <xsl:choose>
                        <xsl:when test="Solgt > 0">
                            <xsl:text>CLOSED</xsl:text>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:text>OPEN</xsl:text>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:attribute>

                <xsl:attribute name="DataType">
                    <xsl:text>CAR_FOR_SALE</xsl:text>
                </xsl:attribute>

                <xsl:attribute name="TransactionType">
                    <xsl:text>FOR_SALE</xsl:text>
                </xsl:attribute>

                <xsl:attribute name="CreatedBy">
                    <xsl:value-of select="$system"/>
                    <xsl:text> </xsl:text>
                    <xsl:value-of select="$version"/>
                </xsl:attribute>

                <xsl:attribute name="CreatedTime">
                   <xsl:value-of select="$created-timestamp"/>
                 </xsl:attribute>

                <xsl:if test="$zett-id != ''">
                   <xsl:attribute name="Id">
                        <xsl:value-of select="$zett-id"/>
                    </xsl:attribute>
                </xsl:if>

                <xsl:if test="$zett-code != ''">
                   <xsl:attribute name="ZettCode">
                        <xsl:value-of select="$zett-code"/>
                    </xsl:attribute>
                </xsl:if>

                <xsl:if test="$now-timestamp != ''">

                    <xsl:attribute name="ModifiedBy">
                        <xsl:value-of select="$system"/>
                        <xsl:text> </xsl:text>
                        <xsl:value-of select="$version"/>
                    </xsl:attribute>

                    <xsl:attribute name="ModifiedTime">
                       <xsl:value-of select="$now-timestamp"/>
                     </xsl:attribute>

                </xsl:if>

                <xsl:attribute name="PublishFromTime">
                   <xsl:value-of select="$created-timestamp"/>
                 </xsl:attribute>
                <!-- End Ad attributes -->

                <Title>
                   <xsl:value-of select="Merke"/>
                   <xsl:text> </xsl:text>
                   <xsl:value-of select="Modell"/>
                   <xsl:text> </xsl:text>
                   <xsl:value-of select="Variant"/>
                   <xsl:text> (</xsl:text>
                   <xsl:value-of select="Arsmodell"/>
                   <xsl:text>)</xsl:text>
                </Title>

                <ShortDescription>
                    <xsl:value-of select="Kommentar"/>
                </ShortDescription>

            	<Address>
                    <xsl:if test="$contact-address != ''">
                        <StreetAddress1>
                         <xsl:value-of select="$contact-address"/>
                        </StreetAddress1>
                    </xsl:if>
                    <xsl:if test="$contact-postcode != ''">
                        <PostCode>
                         <xsl:value-of select="$contact-postcode"/>
                        </PostCode>
                    </xsl:if>
                    <xsl:if test="$contact-postlocation != ''">
                        <PostLocation>
                        <xsl:value-of select="$contact-postlocation"/>
                        </PostLocation>
                    </xsl:if>
                    <Geography>
                        <xsl:text>Norge</xsl:text>
                   </Geography>
            	</Address>

                <ExternalReferences>
                    <Reference>
                        <xsl:attribute name="Source">
                            <xsl:value-of select="$company"/>
                        </xsl:attribute>

                        <xsl:attribute name="System">
                            <xsl:value-of select="$system"/>
                        </xsl:attribute>

                        <xsl:attribute name="SystemVersion">
                            <xsl:value-of select="$version"/>
                        </xsl:attribute>

                        <xsl:attribute name="Type">
                            <xsl:text>COMPANY_REFERENCE</xsl:text>
                        </xsl:attribute>

                        <xsl:value-of select="@unikid"/>
                    </Reference>
                </ExternalReferences>

				<!-- Try the contact point list first -->
				<xsl:apply-templates select="Kontaktpersoner[Kontaktperson]"/>

				<!-- Or else ve revert to the old way -->
				<xsl:if test="not(Kontaktpersoner[Kontaktperson])">
			        <Contacts>
			        <Contact>
			            <xsl:attribute name="Name">
			                <xsl:value-of select="$contact-name"/>
			            </xsl:attribute>
			            <xsl:attribute name="Email">
			                <xsl:value-of select="$contact-email"/>
			            </xsl:attribute>

			            <xsl:if test="$contact-phone != '' or $contact-fax != '' or
			           				  $contact-address != '' or $contact-postcode != '' or 	$contact-postlocation != ''">
			                <ContactAttributes>
			            	<ContactAttributeSection Name="DEFAULT">
			                    <xsl:if test="$contact-phone != ''">
				                    <ContactAttribute Order="" Type="PHONE">
				                       <xsl:value-of select="$contact-phone"/>
				                    </ContactAttribute>
			                    </xsl:if>
			                    <xsl:if test="$contact-fax != ''">
				                    <ContactAttribute Order="" Type="FAX">
				                       <xsl:value-of select="$contact-fax"/>
				                    </ContactAttribute>
			                    </xsl:if>
			                    <xsl:if test="$contact-address != ''">
				                    <ContactAttribute Order="" Type="ADDRESS">
				                       <xsl:value-of select="$contact-address"/>
				                    </ContactAttribute>
			                    </xsl:if>
			                    <xsl:if test="$contact-postcode != ''">
				                    <ContactAttribute Order="" Type="POSTCODE">
				                       <xsl:value-of select="$contact-postcode"/>
				                    </ContactAttribute>
			                    </xsl:if>
			                    <xsl:if test="$contact-postlocation != ''">
				                    <ContactAttribute Order="" Type="POSTLOCATION">
				                       <xsl:value-of select="$contact-postlocation"/>
				                    </ContactAttribute>
			                    </xsl:if>
			                </ContactAttributeSection>
			                </ContactAttributes>
			            </xsl:if>
			        </Contact>
			        </Contacts>
				</xsl:if>

                <Attributes>
                    <!--<xsl:apply-templates select="Kommentar" />-->
                    <xsl:apply-templates select="Kommentar|Pris|Merke|Modell|Kjoretoygruppe|Karosserifasong|Variant|
                                                 Arsmodell|Farge|RegNr|AntSeter|Effekt|InklOmreg|InklArsavg|Kmstand|
                                                 OmregAvgift|Motorstorrelse|Girtype|Drivstoff|Drivhjul|Garanti"/>

                    <!-- Hardcoded saletype-->
                    <Attribute Label="Selgertype" Name="saletype" Order="" Type="STRING">
                        <xsl:text>Forhandler</xsl:text>
                    </Attribute>

                    <xsl:apply-templates select="Ekstrautstyr" />

                    <!-- Sourcefile ID -->
                    <Attribute Label="Kildefil" Name="_importsourcefile" Order="" Type="STRING">
                        <xsl:value-of select="$source-file"/>
                    </Attribute>
                </Attributes>

                <!-- We dont add carweb-pictures at this stage -->
                <xsl:apply-templates select="Bilder" />

            </Ad>
	 	</zett.no>
         </xsl:for-each>
	 </xsl:template>



     <!-- Default template, skips content -->
	 <xsl:template match="*">
	 </xsl:template>

	 <!-- Contacts -->
	 <xsl:template match="Kontaktpersoner">
	     <Contacts>
	     	<xsl:apply-templates select="Kontaktperson"/>
         </Contacts>

	 </xsl:template>



 <!--
	 <xsl:template match="Kontaktperson">
       TODO <xsl:value-of select="php:function('XSLT_Contact',string(.))" disable-output-escaping="yes"/>
	 </xsl:template>
    -->

    <xsl:template match="Kontaktperson">
              <xsl:value-of select="XSLTFunction:contact(string(.),$xml-file)" disable-output-escaping="yes"/>
	 </xsl:template>


     <!-- Mics. attribute templates -->
	 <xsl:template match="Kommentar[string-length(.) > 0]">
        <Attribute Label="Beskrivelse" Name="text" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Pris[string-length(.) > 0]">
        <Attribute Label="Pris" Name="price" Order="" Type="PRICE_NOK">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Merke[string-length(.) > 0]">
        <Attribute Label="Merke" Name="make" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Modell[string-length(.) > 0]">
        <Attribute Label="Modell" Name="model" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Karosserifasong[ . > 0]">
        <Attribute Label="Type" Name="type" Order="" Type="STRING">
            <!-- TODO <xsl:value-of select="php:function('XSLT_ValueMapLookup',name(.),string(.))"/>-->
            <xsl:value-of select="XSLTFunction:valueMapLookup('carweb',name(.),string(.))" disable-output-escaping="yes"/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Kjoretoygruppe[. > 0]">
        <Attribute Label="Kjøretøy" Name="vehicletype" Order="" Type="STRING">
            <!-- TODO <xsl:value-of select="php:function('XSLT_ValueMapLookup',name(.),string(.))"/>-->
            <xsl:value-of select="XSLTFunction:valueMapLookup('carweb',name(.),string(.))" disable-output-escaping="yes"/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Variant[string-length(.) > 0]">
        <Attribute Label="Variant" Name="variant" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Arsmodell[string-length(.) > 0]">
        <Attribute Label="Årsmodell" Name="modelyear" Order="" Type="INTEGER">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Kmstand[. > 0]">
        <Attribute Label="Kilometerstand" Name="mileage" Order="" Type="INTEGER">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Farge[string-length(.) > 0]">
        <Attribute Label="Farge" Name="color" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Motorstorrelse[. > 0]">
        <Attribute Label="Motorvolum" Name="enginevolume" Order="" Type="INTEGER">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Effekt[. > 0]">
        <Attribute Label="Hestekrefter" Name="enginehp" Order="" Type="INTEGER">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="RegNr[string-length(.) > 0]">
        <Attribute Label="Registreringsnummer" Name="registrationnumber" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Girtype[string-length(.) > 0]">
        <Attribute Label="Girtype" Name="geartype" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

	 <xsl:template match="Drivstoff[string-length(.) > 0]">
        <Attribute Label="Drivstoff" Name="fueltype" Order="" Type="STRING">
            <!-- TODO <xsl:value-of select="php:function('XSLT_ValueMapLookup',name(.),string(.))"/>-->
            <xsl:value-of select="XSLTFunction:valueMapLookup('carweb',name(.),string(.))" disable-output-escaping="yes"/>
        </Attribute>
	 </xsl:template>

     <xsl:template match="Drivhjul[string-length(.) > 0]">
        <Attribute Label="Drivhjul" Name="wheeldrive" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

     <xsl:template match="AntSeter[. > 0]">
        <Attribute Label="Antall seter" Name="seats" Order="" Type="INTEGER">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

     <xsl:template match="Garanti[string-length(.) > 0]">
        <Attribute Label="Garanti" Name="guarantee" Order="" Type="STRING">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

     <xsl:template match="InklOmreg[string-length(.) > 0]">
        <Attribute Label="Omreg. inklusiv" Name="reregistrationfeepaid" Order="" Type="STRING">
            <xsl:choose>
                <xsl:when test=". = 1">
                    <xsl:text>Ja</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:text>Nei</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </Attribute>
	 </xsl:template>

     <xsl:template match="InklArsavg[string-length(.) > 0]">
        <Attribute Label="Årsavgift inklusiv" Name="yearlyfeepaid" Order="" Type="STRING">
            <xsl:choose>
                <xsl:when test=". = 1">
                    <xsl:text>Ja</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:text>Nei</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </Attribute>
	 </xsl:template>

     <xsl:template match="OmregAvgift[. > 0]">
        <Attribute Label="Omreg. avgift" Name="reregistrationfee" Order="" Type="PRICE_NOK">
            <xsl:value-of select="."/>
        </Attribute>
	 </xsl:template>

     <!-- Additional feature list -->
	 <xsl:template match="Ekstrautstyr">
        <!-- TODO <xsl:value-of select="php:function('XSLT_FeatureList',string(.))" disable-output-escaping="yes"/>-->
	 </xsl:template>

    <!-- Images -->
	 <xsl:template match="Bilder">
	 	<Media>
            <xsl:apply-templates select="Bilde" />
	 	</Media>
	 </xsl:template>

	 <xsl:template match="Bilde">
	 	<MediaElement>

            <!-- Start MediaElement attributes -->
            <xsl:attribute name="Order">
                <xsl:value-of select="@prioritet"/>
            </xsl:attribute>

            <xsl:attribute name="Reference">
               <xsl:value-of select="$image-path"/>
               <!-- TODO <xsl:value-of select="php:function('strtoupper',string(@bilde))"/>-->
            </xsl:attribute>

            <xsl:attribute name="Type">
                <xsl:text>IMAGE</xsl:text>
            </xsl:attribute>
            <!-- End MediaElement attributes -->

            <ElementTitle>
                <xsl:choose>
                    <xsl:when test="@desc != ''">
                        <xsl:value-of select="@desc"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:text>Ekstrabilde</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </ElementTitle>

	 	</MediaElement>

	 </xsl:template>


</xsl:stylesheet>
