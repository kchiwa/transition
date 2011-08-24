<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output method="html"/>

<xsl:template match="Forhandler">
           <br />brukerid :<xsl:value-of select="@brukerid"/>
		   <br />passord   :<xsl:value-of select="@passord"/>
		   <br />adresse1   :<xsl:value-of select="@adresse1"/>
		   <br />adresse2   :<xsl:value-of select="@adresse2"/>
       <person>pea</person>
	   <xsl:for-each select="Bil">
	          <hr />
		  <br /> Merkexxxx :  <xsl:apply-templates select="Merke" />
		  <br /> All Picture :
			<xsl:for-each select="Bilder/Bilde">
				 <br /> - <xsl:value-of select="@bilde"/>  md5 = <xsl:value-of select="@md5"/>  desc =<xsl:value-of select="@desc"/>
		      </xsl:for-each>

		      <br />Garanti : <xsl:value-of select="Garanti"/>
         </xsl:for-each>

 </xsl:template>
</xsl:stylesheet>