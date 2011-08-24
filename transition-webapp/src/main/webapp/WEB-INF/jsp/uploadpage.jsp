<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

<style>
    .txtwidth{width:600px;}
    .responsemsg{color:red;}
</style>

<script type="text/javascript">

    function submitToZett(){
        var clientName = document.getElementById("txtzettclientname").value;
        var clientId = document.getElementById("txtzettclientid").value;
        var clientRef = document.getElementById("txtzettclientref").value;

        if(clientName != "" || clientId != "" || clientRef !=""){
            var url = "rest/zettxml/"+clientName+"/"+clientId+"/"+clientRef+".xml";
            document.frmpostzettxml.action = url;
            document.frmpostzettxml.submit();
        }else{
            alert("please input the information for send data to via REST Webservice");
        }

    }

    function submitToIadIfJob(){
        var clientName = document.getElementById("txtiadifjobclientname").value;
        var clientId = document.getElementById("txtiadifjobclientid").value;
        var clientRef = document.getElementById("txtiadifjobclientref").value;

        if(clientName != "" || clientId != "" || clientRef !=""){
            var url = "rest/iadifjob/"+clientName+"/"+clientId+"/"+clientRef+".xml";
            document.frmpostiadifjob.action = url;
            document.frmpostiadifjob.submit();
        }else{
            alert("please input the information for send data to via REST Webservice");
        }
    }

</script>

<%@ include file="template/admin_main_nav.jsp" %>
<hr/>
<div class="span-24 last grey" id="content">
    <div><a href="testlink.html" target="_blank">Download test files here!</a> <br/><br/></div>

    <!-- zett webservice -->
    <div>
        <fieldset>
            <legend>Zett</legend>
            <fieldset>
                <legend>Zett FTP</legend>
                <form name="frmiadiFjob" enctype="multipart/form-data" action="test-zett.html" method="post">
                    <label for="clientName">Client Name/Folder Name</label>
                    <input type="text" name="clientName" id="clientName" value="triolink" />
                    <span class="responsemsg"> ${zettMsg}</span>
                    <br/>
                    <input type="file" name="zettFile" id="zettFile" />
                    <br/>
                    <input type="submit" name="btnZett" id="btnZett" value="import"/>
                </form>
            </fieldset>


            <!-- url example http://asoke.dev.abctech-thailand.com/transition/zettxml/triolink/794668/000085.xml -->
            <fieldset>
                <legend>Zett POST</legend>
                <form enctype="multipart/form-data" name="frmpostzettxml" target="_blank" action="" method="post">

                    <label for="txtzettclientname">Client Name</label>
                    <input type="text" name="txtzettclientname" id="txtzettclientname" value="triolink" /><br/>

                    <label for="txtzettclientid">Client ID</label>
                    <input type="text" name="txtzettclientid" id="txtzettclientid" value="794668" /><br/>

                    <label for="txtzettclientref">Client Ref</label>
                    <input type="text" name="txtzettclientref" id="txtzettclientref" value="000085" /><br/>

                    <label for="filezett">zett xml file</label>
                    <input type="file" name="file" id="file" /><br/>

                    <input type="button" name="btn" id="bin" value="send to webservice" onclick="submitToZett()"/>

                    <!--<input type="submit" name="btnzettxml" id="btnzettxml" value="send to webservice"/>-->

                </form>
            </fieldset>

            <fieldset>
                <legend>Zett PUT</legend>
                <form enctype="multipart/form-data" name="frmputzettxml" target="_blank" action="test-zett-put-process.html" method="post">

                    <label for="txtzetthost">Host</label>
                    <input type="text" class="txtwidth" name="txtzetthost" id="txtzetthost" value="http://asoke.dev.abctech-thailand.com/transition"/><br/>

                    <label for="txtzettclientname">Client Name</label>
                    <input type="text" name="txtzettclientname" id="txtzettclientname" value="triolink" /><br/>

                    <label for="txtzettclientid">Client Name</label>
                    <input type="text" name="txtzettclientid" id="txtzettclientid" value="794668" /><br/>

                    <label for="txtzettexternalref">External Ref</label>
                    <input type="text" name="txtzettexternalref" id="txtzettexternalref" value="000085" /><br/>

                    <label for="filezett">Image Zip file</label>
                    <input type="file" name="filezett" id="filezett" /><br/>
                    <input type="submit" name="btnzettxml" id="btnzettxml" value="send to webservice"/>

                </form>
            </fieldset>
        </fieldset>
    </div>



    <!-- carweb -->
    <div>
        <fieldset>
            <legend>Carweb</legend>
            <fieldset>
                <legend>Upload Cars</legend>
                <form method="POST" name="frmcarwebuploadcar" enctype="multipart/form-data" action="carweb/upload-cars.php" target="_blank">
                    <label for="txtcarwebid">Client ID</label>
                    <input type="text" name="user" id="txtcarwebid" value="32017" /><br/>
                    <input type="file" name="filename" id="filecarweb" /><br/>
                    <input type="submit" name="btncarweb" id="btncarweb" value="import"/>
                </form>
            </fieldset>
            <fieldset>
                <legend>Upload Image</legend>
                <form name="frmcarwebuploadimage" enctype="multipart/form-data" action="carweb/upload-images.php" target="_blank" method="post">
                    <label for="txtcarwebid">Client ID</label>
                    <input type="text" name="user" id="txtcarwebid" value="32017"/><br/>
                    <input type="file" name="filename" id="filecarweb" /><br/>
                    <input type="submit" name="btncarweb" id="btncarweb" value="import"/>
                </form>
            </fieldset>
            <fieldset>
                <legend>Download Image Data</legend>
                <form name="frmcarweb" enctype="multipart/form-data" action="carweb/downloadimagedata.php" target="_blank" method="post">
                    <label for="txtcarwebid">Client ID</label>
                    <input type="text" name="user" id="txtcarwebid" value="32017" /><br/>
                    <input type="submit" name="btncarweb" id="btncarweb" value="import"/>
                </form>
            </fieldset>
        </fieldset>
    </div>

    <!-- emprof -->
    <div>
        <fieldset>

            <!-- client id = 21913 -->
            <legend>Emprof</legend>
            <form name="frmemprof" enctype="multipart/form-data" target="_blank" action="emprof-fetcher.html" method="get">

                <!-- example : http://service.emprof.no/Temp/Zett.no/501277__71522781_urlescaped_71522796.xml -->

                <label for="slemprofurl">URL</label>
                <input type="text" class="txtwidth" name="url" id="url" value="http://asoke.dev.abctech-thailand.com/transition/test/emprof/happyday/emprof_happyday"/>
                <br/>
                <input type="submit" name="btnemprof" id="btnemprof" value="fetch"/>

            </form>

        </fieldset>
    </div>


    <!--itmakariet -->
    <div>
        <a name="itmakeriet"></a>
        <fieldset>
            <legend>Itmakeriet</legend>
            <form name="frmitmakariet" enctype="multipart/form-data" action="test-itmakariet-process.html" method="post">
                <label for="txtitmakarietname">Client Name/Folder Name</label>
                <input type="text" name="txtitmakarietname" id="txtitmakarietname" value="zemaja" />
                <span class="responsemsg"> ${itmakarietmessage}</span>
                <br/>
                <input type="file" name="fileitmakariet" id="fileitmakariet" />
                <br/>
                <input type="submit" name="btnitmakariet" id="btnitmakariet" value="import"/>
            </form>
        </fieldset>
    </div>

    <!--finnjob -->
    <div>
        <a name="finnjob"></a>
        <fieldset>
            <legend>Finnjob</legend>
            <form name="frmfinnjob" enctype="multipart/form-data" action="test-finnjob-process.html" method="post">
                <label for="txtfinnjobname">Client Name/Folder Name</label>
                <input type="text" name="txtfinnjobname" id="txtfinnjobname" value="rcconsas" />
                <span class="responsemsg"> ${finjobmessage}</span>
                <br/>
                <input type="file" name="filefinnjob" id="filefinnjob" />
                <br/>
                <input type="submit" name="btnfinnjob" id="btnfinnjob" value="import"/>
            </form>
        </fieldset>
    </div>

    <!--IadiFjob -->
    <div>
        <a name="iadifjob"></a>
        <fieldset>
            <legend>IadiFjob</legend>
            <form name="frmiadiFjob" enctype="multipart/form-data" action="test-iadiFjob-process.html" method="post">
                <label for="txttxtfinnjobname">Client Name/Folder Name</label>
                <input type="text" name="txtfinnjobname" id="txtfinnjobname" value="" />
                jobzone or adecco
                <span class="responsemsg"> ${iadifjobmsg}</span>
                <br/>
                <input type="file" name="fileIadiFjob" id="fileIadiFjob" />
                <br/>
                <input type="submit" name="btnfinnjob" id="btnfinnjob" value="import"/>
            </form>
        </fieldset>

        <fieldset>
                <legend>IadIFjob REST</legend>
                <form enctype="multipart/form-data" name="frmpostiadifjob" target="_blank" action="" method="post">

                    <label for="txtiadifjoblientname">Client Name</label>
                    <input type="text" name="txtiadifjobclientname" id="txtiadifjobclientname" value="jobzone" /><br/>

                    <label for="txtiadifjobclientid">Client ID</label>
                    <input type="text" name="txtiadifjobclientid" id="txtiadifjobclientid" value="680803" /><br/>

                    <label for="txtiadifjobclientref">Client Ref</label>
                    <input type="text" name="txtiadifjobclientref" id="txtiadifjobclientref" value="46933" /><br/>

                    <label for="fileiadifjob">iadifjob xml file</label>
                    <input type="file" name="file" id="file" /><br/>

                    <input type="button" name="btn" id="bin" value="send to webservice" onclick="submitToIadIfJob()"/>

                </form>
        </fieldset>

    </div>

    <!--Rettbemanning -->
    <div>
        <a name="rettbemanning"></a>
        <fieldset>
            <legend>Rettbamanning</legend>
            <form name="frmiadiFjob" enctype="multipart/form-data" action="test-rettbemanning.html" method="post">
                <label for="clientName">Client Name/Folder Name</label>
                <input type="text" name="clientName" id="clientName" value="rettbemanning" />
                <span class="responsemsg"> ${rettbemanningMsg}</span>
                <br/>
                <input type="file" name="rettbemanningFile" id="rettbemanningFile" />
                <br/>
                <input type="submit" name="btnRettbemanning" id="btnRettbemanning" value="import"/>
            </form>
        </fieldset>
    </div>

    <!-- Webmegler -->
    <div>
        <a name="webmegler"></a>
        <fieldset>
            <legend>Webmegler</legend>
            <form name="frmwebmegler" enctype="multipart/form-data" action="test-webmegler-process.html" method="post">
                <label for="clientName">Client Name/Folder Name</label>
                <input type="text" name="txtwebmegler" id="txtwebmegler" value="Stavlund AS" />
                <span class="responsemsg"> ${webmeglerMsg}</span>
                <br/>
                <input type="file" name="filewebmegler" id="filewebmegler" />
                <br/>
                <input type="submit" name="btnwebmegler" id="btnwebmegler" value="import"/>
            </form>
        </fieldset>
    </div>

    <!-- Webtemp -->
    <div>
        <a name="webtemp"></a>
        <fieldset>
            <legend>Webtemp</legend>
            <form name="frmwebtemp" enctype="multipart/form-data" action="test-webtemp-process.html" method="post">
                <label for="clientName">Client Name/Folder Name :</label> 
                <input type="text" name="txtwebtemp" id="txtwebtemp" value="" />
                personalhuset or people4you
                <span class="responsemsg"> ${webtempMsg}</span>
                <br/>
                <input type="file" name="filewebtemp" id="filetemp" />
                <br/>
                <input type="submit" name="btnwebtemp" id="btnwebtemp" value="import"/>
            </form>
        </fieldset>
    </div>

    <!-- Webcruiter -->
    <div>
        <a name="webcruiter"></a>
        <fieldset>
            <legend>Webcruiter</legend>
            <form name="frmwebcruiter" enctype="multipart/form-data" action="test-webcruiter-process.html" method="post">
                <label for="clientName">Client Name/Folder Name</label>
                <input type="text" name="txtwebcruiter" id="txtwebcruiter" value="zrcruit" />
                <span class="responsemsg"> ${webcruiterMsg}</span>
                <br/>
                <input type="file" name="filewebcruiter" id="filewebcruiter" />
                <br/>
                <input type="submit" name="btnwebcruiter" id="btnwebcruiter" value="import"/>
            </form>
        </fieldset>
    </div>
                
    <!-- Sologstrand -->
    <div>
        <a name="sologstrand"></a>
        <fieldset>
            <legend>Sologstrand</legend>
            <form name="frmwebtemp" enctype="multipart/form-data" action="test-sologstrand-process.html" method="post">
                <label for="clientName">Client Name/Folder Name :</label> 
                <input type="text" name="txtsologstrand" id="txtsologstrand" value="sologstrand" />
                <span class="responsemsg"> ${sologstrandMsg}</span>
                <br/>
                <input type="file" name="filesologstrand" id="filetemp" />
                <br/>
                <input type="submit" name="btnsologstrand" id="btnsologstrand" value="import"/>
            </form>
        </fieldset>
    </div>

    <!-- oldonlinebooking -->
    <div>
        <a name="oldonlinebooking"></a>
        <fieldset>
            <legend>Oldonlinebooking</legend>
            <form name="frmoldonlinebooking" enctype="multipart/form-data" action="test-oldonlinebooking-process.html" method="post">
                <label for="clientName">Client Name/Folder Name :</label>
                <input type="text" name="txtoldonlinebooking" id="txtoldonlinebooking" value="Sogn Avis" />
                <span class="responsemsg"> ${oldonlinebookingMsg}</span>
                <br/>
                <input type="file" name="fileoldonlinebooking" id="fileoldonlinebooking" />
                <br/>
                <input type="submit" name="btnoldonlinebooking" id="btnoldonlinebooking" value="import"/>
            </form>
        </fieldset>
    </div>

     <!-- novasol -->
    <div>
        <a name="novasol"></a>
        <fieldset>
            <legend>Novasol</legend>
            <form name="frmnovasol" enctype="multipart/form-data" action="test-novasol-process.html" method="post">
                <label for="clientName">Client Name/Folder Name :</label>
                <input type="text" name="clientId" id="clientId" value="novasol" />
                <br/>
                <input type="radio" name="testtype" value="happy" checked="true"> Happy Day. &nbsp; <input type="radio" name="testtype" value="bad"> Bad day.
                <span class="responsemsg"> ${novasolMsg}</span>
                <br/>
                <input type="submit" name="btnnovasol" id="btnnovasol" value="import"/>
            </form>
        </fieldset>
    </div>

<<<<<<< HEAD
     <!-- iadifmmo -->
    <div>
        <a name="iadifmmo"></a>
        <fieldset>
            <legend>iadifmmo</legend>
            <br/>
            It's must be upload after iadifestateforsale persisted ads.
            <form name="frmiadifmmo" enctype="multipart/form-data" action="test-iadifmmo-process.html" method="post">
                <label for="clientName">Client Name/Folder Name :</label>
                <input type="text" name="clientName" id="clientName" value="dnbnor" />
                <br/>
                <br/>
                <input type="file" name="fileiadifmmo" id="fileiadifmmo" />
                <span class="responsemsg"> ${iadifmmoMsg}</span>
                <br/>
                <input type="submit" name="btniadifmmo" id="btniadifmmo" value="import"/>
                <br>
=======
    <!-- iadifestateforsale -->
    <div>
        <a name="iadifestateforsale"></a>
        <fieldset>
            <legend>Iadifestateforsale</legend>
            <form name="frmiadifestateforsale" enctype="multipart/form-data" action="test-iadifestateforsale-process.html" method="post">
                <label for="clientName">Client Name/Folder Name :</label>
                <input type="text" name="txtiadifestateforsale" id="txtiadifestateforsale" value="Dbnnor" />
                <span class="responsemsg"> ${iadifestateforsaleMsg}</span>
                <br/>
                <input type="file" name="fileiadifestateforsale" id="fileiadifestateforsale" />
                <br/>
                <input type="submit" name="btniadifestateforsale" id="btniadifestateforsale" value="import"/>
>>>>>>> dbe97031ec34b720823dca0d6ea7ce81ba5504b6
            </form>
        </fieldset>
    </div>
                
</div>

<%@ include file="template/admin_footer.jsp" %>
