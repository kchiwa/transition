<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="template/admin_header.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
        <h3 class="grey">Advertisement Information</h3><hr />
        </div>

        <div class="span-17 colborder" id="content">
          <dl class="grey">
              <dt>File state ID</dt>
              <dd>987153</dd>
              <dt>Status</dt>
              <dd><span class="err">ERROR</span></dd>
              <dt>Zett advertisement object ID</dt>
              <dd>23f548</dd>
              <dt>Zett client ID</dt>
              <dd>ffkjg88</dd>
              <dt>SHA-hash</dt>
              <dd>-</dd>
              <dt>Modified time</dt>
              <dd>1 January 1900 00:00:00</dd>
              <dt>Created time</dt>
              <dd>1 January 1900 00:00:00</dd>
              <dt>Advertisement external reference</dt>
              <dd>fefi270</dd>
          </dl>
          <p><a href="./admin_main.html">back</a></p>


        </div>


        <div class="span-5 last" id="sidebar">
          <dl class="grey">
              <dt>Media list</dt>
              <dd>-</dd>
          </dl>
          <p class="small">
            <span class="ok">Green</span> = Media OK <br/>
            <span class="warning">Orange</span> = Media missing
          </p>
        </div>


        <div class="span-24 last" id="header">
        <hr/><h3 class="grey">Error Details</h3><hr />
        </div>


        <div class="span-24 last" id="error">
             <dl class="grey">
              <dt>Reason</dt>
              <dd><span class="err">Validation failed</span></dd>
              <dt>Details</dt>
              <dd>Expected &lt;Bilder&gt; but found &lt;Bilde&gt;</dd>

             </dl>
              <p>
                  <form action="#">
                     <label for="xml">XML</label>
                     <textarea class="width100 medium" rows="50" name="xml" id="xml">
<Bildata>
    <Forhandler brukerid="32017" passord="ramb894" navn="Toyota Ramstad Bil AS avd Askim" adresse1="Sagveien 1" adresse2="" adresse3="" postnr="1814" poststed="ASKIM" url="www.ramstadbil.no" tlf="69 84 44 00" fax="69 84 44 01" epost="post.askim@toyota.no" fullupdate="1">
        <Bil unikid="1_375" kontroll="9" kommando="update">
            <Kjoretoygruppe>1</Kjoretoygruppe>
            <Merke>Peugeot</Merke>
            <Modell>307</Modell>
            <Karosserifasong>2</Karosserifasong>
            <Pris>109000</Pris>
            <Arsmodell>2005</Arsmodell>
            <Kmstand>108200</Kmstand>
            <Motorstorrelse>1.6</Motorstorrelse>
            <Variant>XS klimaanlegg</Variant>
            <ChassisNr/>
            <Solgt>0</Solgt>
            <Farge>bl&#229;/gr&#229; Metallic</Farge>
            <Effekt>109</Effekt>

                <Bilde bilde="1_375L.JPG" prioritet="0" md5="4A009865D1A8283BB68317114C741D72" desc="Hovedbilde"/>
                <Bilde bilde="1_375L_1.JPG" prioritet="1" md5="83D1032632417AE89417FF1B41D57ABF" desc="Bilde 2"/>
                <Bilde bilde="1_375L_2.JPG" prioritet="2" md5="7389CC574A818D3B1A575C32552B8468" desc="Bilde 3"/>
                <Bilde bilde="1_375L_3.JPG" prioritet="3" md5="0399594917E2F695285AB6947E1D270B" desc="Bilde 4"/>
                <Bilde bilde="1_375L_4.JPG" prioritet="4" md5="A95DED4B35C79D525BD130312A48B9F2" desc="Bilde 5"/>
                <Bilde bilde="1_375L_5.JPG" prioritet="5" md5="747D67756844A4E36100CBCF114C995D" desc="Bilde 6"/>
                <Bilde bilde="1_375L_6.JPG" prioritet="6" md5="32244C0C1166FF7E7271900CCB4DD9A0" desc="Bilde 7"/>
                <Bilde bilde="1_375L_7.JPG" prioritet="7" md5="281445963BC0C4A6B46B66E66CBC762D" desc="Bilde 8"/>
                <Bilde bilde="1_375L_8.JPG" prioritet="8" md5="DED64797AB354F6E976AB5BF070555F3" desc="Bilde 9"/>
                <Bilde bilde="1_375L_9.JPG" prioritet="9" md5="7FAFD13B40A93495828C5CAE21FB10E7" desc="Bilde 10"/>
                <Bilde bilde="1_375L_10.JPG" prioritet="10" md5="3551C3D54C5AE8C17F971B5224515F94" desc="Bilde 11"/>
            </Bilder>
            <InklOmreg>0</InklOmreg>
            <InklArsavg>1</InklArsavg>
            <Ekstrautstyr>;Antiskrens,ESP;ABS-bremser,ABS-bremser;Air Condition,Air Condition;CD-spiller,CD-spiller;El.vinduer,El.vinduer;Hengerfeste,Hengerfeste;Klimaanlegg,Klimaanlegg;Metallic lakk,Metallic lakk;Servostyring,Servostyring;Sommerhjul,Sommerhjul;Vinterhjul,Vinterhjul</Ekstrautstyr>
            <Reservert>0</Reservert>
            <KommerInn/>
            <SomForevist>0</SomForevist>
            <Drivstoff>B</Drivstoff>
            <Lastevolum/>
            <AntEiere>1</AntEiere>
            <AntSeter>5</AntSeter>
            <Kommentar>Hel og pen 307 Selges,Bilen har tidligere kun hatt 1 EIER!  Bilen er bra utstyrt med Feks Automatisk klimaanegg.Ta kontakt for pr&#248;vekj&#248;ring!                 Forbehold om feil i annonse.</Kommentar>
            <Vekt/>
            <Garanti>Bruktbilgaranti</Garanti>
            <RegNr>AJ59160</RegNr>
            <Demobil>0</Demobil>
            <Kommisjonsbil>0</Kommisjonsbil>
            <Basisfarge>5</Basisfarge>
            <Drivhjul>Forhjulsdrift</Drivhjul>
            <Girtype>Manuell</Girtype>
            <Slepevekt>1200</Slepevekt>
            <FargeInnvendig>Sort stoff</FargeInnvendig>
            <OmregAvgift>4767</OmregAvgift>
            <Kontaktpersoner>
                <Kontaktperson>1_2</Kontaktperson>
            </Kontaktpersoner>
        </Bil>
        <Bil unikid="1_384" kontroll="6" kommando="update">
            <Kjoretoygruppe>1</Kjoretoygruppe>
            <Merke>Opel</Merke>
            <Modell>Astra</Modell>
            <Karosserifasong>2</Karosserifasong>
            <Pris>134233</Pris>
            <Arsmodell>2004</Arsmodell>
            <Kmstand>66500</Kmstand>
            <Motorstorrelse>1.6</Motorstorrelse>
            <Variant>Twinport Automat!</Variant>
            <ChassisNr/>
            <Solgt>0</Solgt>
            <Farge>Lys bl&#229; Metallic</Farge>
            <Effekt>105</Effekt>
            <Bilder>
                <Bilde bilde="1_384L.JPG" prioritet="0" md5="D3D295CB924CAF0F10CDE7C638CEDEC2" desc="Hovedbilde"/>
                <Bilde bilde="1_384L_1.JPG" prioritet="1" md5="C597C3A5680B23AFCB950E7A07AB257B" desc="Bilde 2"/>
                <Bilde bilde="1_384L_2.JPG" prioritet="2" md5="9AED1ACF5A251EDC4644E488FD62EE11" desc="Bilde 3"/>
                <Bilde bilde="1_384L_3.JPG" prioritet="3" md5="D2497FA64334616E2161366DED8AC00B" desc="Bilde 4"/>
                <Bilde bilde="1_384L_4.JPG" prioritet="4" md5="519551D8672AD536A0F4D13C068D2420" desc="Bilde 5"/>
                <Bilde bilde="1_384L_5.JPG" prioritet="5" md5="D73AF37B938FC441F8AF8CBEBE9A0590" desc="Bilde 6"/>
                <Bilde bilde="1_384L_6.JPG" prioritet="6" md5="E0ECC3A37BE4F8BB9993FDBDEBE53F76" desc="Bilde 7"/>
                <Bilde bilde="1_384L_7.JPG" prioritet="7" md5="B0C85D4E5AFA46B47E5C7EB694A5620A" desc="Bilde 8"/>
                <Bilde bilde="1_384L_8.JPG" prioritet="8" md5="3832DB2DF9CB1346531DFEAB16AEDF46" desc="Bilde 9"/>
                <Bilde bilde="1_384L_9.JPG" prioritet="9" md5="D42663EF4CC31D2B4A7007478E4506C9" desc="Bilde 10"/>
                <Bilde bilde="1_384L_10.JPG" prioritet="10" md5="C352C15DC44953FF87D7BBCBCCEC3EE8" desc="Bilde 11"/>
                <Bilde bilde="1_384L_11.JPG" prioritet="11" md5="43A3B8DF96BACA546ED426797C07C51C" desc="Bilde 12"/>
                <Bilde bilde="1_384L_12.JPG" prioritet="12" md5="F1B41A3F3B6E4FFEAD909BB99750D7A1" desc="Bilde 13"/>
                <Bilde bilde="1_384L_13.JPG" prioritet="13" md5="456AFAAF58083CC562D3A2C98232108B" desc="Bilde 14"/>
                <Bilde bilde="1_384L_14.JPG" prioritet="14" md5="02E6AF5331453D1A0F98FE2238C830A1" desc="Bilde 15"/>
            </Bilder>
            <InklOmreg>0</InklOmreg>
            <InklArsavg>0</InklArsavg>
            <Ekstrautstyr>;Automat,Automat;ABS-bremser,ABS-bremser;Air Condition,Air Condition;Airbag foran,Airbag foran;Automatgir,Automatgir;CD-spiller,CD-spiller;El.vinduer,El.vinduer;Lettmet. felg sommer,Lettmet. felg sommer;Metallic lakk,Metallic lakk;Oppvarmede seter,Oppvarmede seter;Radio/CD,Radio/CD;Sentrall&#229;s,Sentrall&#229;s;Servostyring,Servostyring;Sommerhjul,Sommerhjul;Vinterhjul,Vinterhjul</Ekstrautstyr>
            <Reservert>0</Reservert>
            <KommerInn/>
            <SomForevist>0</SomForevist>
            <Drivstoff>B</Drivstoff>
            <Lastevolum/>
            <AntEiere>1</AntEiere>
            <AntSeter>5</AntSeter>
            <Kommentar>Meget vellholdt Opel Astra Automat selges! Bilen har Alu felger p&#229; sommer hjul og fremst&#229;r som meget godt behandlet!  Ta kontakt for pr&#248;vekj&#248;ring!                 Forbehold om feil i annonse.</Kommentar>
            <Vekt>1190</Vekt>
            <Garanti>Bruktbilgaranti</Garanti>
            <RegNr>AJ57879</RegNr>
            <Demobil>0</Demobil>
            <Kommisjonsbil>0</Kommisjonsbil>
            <Basisfarge>2</Basisfarge>
            <Drivhjul>Forhjulsdrift</Drivhjul>
            <Girtype>Automat</Girtype>
            <Slepevekt/>
            <FargeInnvendig>sort/gr&#229;tt Stoff</FargeInnvendig>
            <OmregAvgift>4767</OmregAvgift>
            <Kontaktpersoner>
                <Kontaktperson>1_2</Kontaktperson>
            </Kontaktpersoner>
        </Bil>

<Kontaktpunktliste>
            <Kontaktpunkt id="1_2">
                <Navn>Avd Askim bilmeglingsansvarlig</Navn>
                <Telefon/>
                <Mobil/>
                <Email/>
                <Beskrivelse>Daglig leder/bilmeglingsansvar</Beskrivelse>
                <Javascript></Javascript>
            </Kontaktpunkt>
        </Kontaktpunktliste>
    </Forhandler>
</Bildata>

                     </textarea><br/>
                     <button type="submit" class="button">Resubmit</button>
              </form>





              </p>

          </div>

<%@ include file="template/admin_footer.jsp" %>