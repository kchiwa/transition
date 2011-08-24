<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

<script language="javascript" type="text/javascript">
/* <![CDATA[ */

function selectClientName() {
    document.rettbemanningRunSchedulerForm.action = "<%=request.getContextPath( )%>/scheduler_admin_selectClient.html";
    document.rettbemanningRunSchedulerForm.submit();
}

function save(formName) {
    var aForm = document.getElementsByName(formName);
    document.forms[formName].cronTrigger.value =  generateCronStr(formName);
    document.forms[formName].submit();
}

function enableSelect(formName, listName) {
    var aForm = document.getElementsByName(formName);
    //alert(aForm.item('minute').elements['minute'].value);
    aForm.item(listName).elements[listName].disabled = false;
}

function disableSelect(formName, listName) {
    var aForm = document.getElementsByName(formName);
    aForm.item(listName).elements[listName].disabled = true;
}

function generateCronStr(formName) {

    var cronStr = '';
    var minute, hour, day, month, weekday;
    seconds = '0';
    minute	= getSelect('minute', formName);
    hour	= getSelect('hour', formName);
	day		= getSelect('day', formName);
	month	= getSelect('month', formName);
	weekday	= getSelect('weekday', formName);

	if(weekday == "*" && day == "*") {
	    day = "?";
	} else

	if(day == "*" && month == "*") {
	    day = "?";
	} else

	if(weekday == "*" && month == "*") {
	    weekday = "?";
	}

	cronStr = seconds + " " + minute + " " + hour + " " + day + " " + month + " " + weekday;
	return cronStr;
}

function getSelect(type, formName) {

    var result = '';
    var aForm = document.getElementsByName(formName);
    var aList = aForm.item(type).elements[type];

    if(aForm.item(type).elements[type].disabled) {
        return '*';
    }
    for (i=0; i<aList.options.length; i++) {
        if (aList.options[i].selected) {
            result = result + ','+ aList.options[i].value;
        }
    }
    return result.substring(1,result.length);
}

function runRSSFetch(customer ,client) {
    document.runSchedulerForm.clientName.value =  client;
    document.runSchedulerForm.customerFormat.value =  customer;
    document.runSchedulerForm.submit();
}

/* ]]> */
</script>

<style type="text/css">
/* <![CDATA[ */
h3 {
	margin:0;
}
// not use
select_bak {
	height:100px;
	width:120px;
}
br {
	clear:both;
}
.box {
	width:146px;
	float:left;
}
/* ]]> */
</style>

<style>
    .txtwidth{width:600px;}
    .responsemsg{color:red;}
</style>
<%@ include file="template/admin_main_nav.jsp" %>
<hr/>
<div class="span-24 last grey" id="content">
    <h3 class="grey">Task Scheduler Status</h3><hr />


    <!--Rettbemanning -->
    <div>
        <fieldset>
            <legend>Scheduler setting</legend>

                <c:if test="${!empty message}">
                        <c:if test="${status == 'OK'}">
                            <div ><span class='ok'>${message}<span></div>
                        </c:if>
                        <c:if test="${status == 'ERROR'}">
                            <div ><span class='err'>${message}<span></div>
                        </c:if>
                 </c:if>

            <form:form name="rettbemanningRunSchedulerForm" action="./saveScheduler.html" commandName="schedulerForm" method="post">
                            <form:input type="hidden" id="id" name="id" path="id" value="${HttpFecthSchedulerModel.id}" />
                            <!-- <form:input type="hidden" id="clientName" name="clientName" path="clientName" value="${HttpFecthSchedulerModel.clientName}" /> -->
                            <form:input type="hidden" id="customerFormat" name="customerFormat" path="customerFormat" value="${HttpFecthSchedulerModel.customerFormat}" />
                            <form:input type="hidden" id="cronTrigger" name="cronTrigger" path="cronTrigger" value="" />
                            <form:input type="hidden" id="active" name="active" path="active" value="${HttpFecthSchedulerModel.active}"  />
                            <div>
                                <label>Client Name : </label>
                               <!--
                                <form:select id="clientName" name="clientName" path="clientName" onChange="selectClientName();">
                                    <option value="">Please select</option>
                                    <option value="rettbemanning" ${rettbemanning} >rettbemanning</option>
                                    <option value="Stavlund AS" ${StavlundAS} >stavlundas</option>
                                    <option value="personalhuset" ${personalhuset} >personalhuset</option>
                                    <option value="people4you" ${people4you} >people4you</option>
                                    <option value="sologstrand" ${sologstrand} >sologstrand</option>
                                </form:select>
                                -->

                                 <form:select path="clientName" id="clientName" name="clientName"  onChange="selectClientName();">
                                                   <form:option value="">Please select</form:option>
                                                   <c:forEach items="${schedulerList}" var="schedulerList">
                                                      <form:option value="${schedulerList.clientName}">${schedulerList.clientName}</form:option>
                                                   </c:forEach>
                                 </form:select>


                            </div>
                            <div>
                                <label>URL : ${HttpFecthSchedulerModel.url}</label>
                            </div>
                            <div>
                                <label>Client Name/Folder Name : ${HttpFecthSchedulerModel.clientName}</label>
                            </div>
                                <div class="box">
                                    <label>Minute</label>
                                    </br>
                                    <label for="minute_chooser_every">Every Minute</label>
                                    <input type="radio" name="minute_chooser" id="minute_chooser_every" class="chooser" value="0" ${everyMin} onChange="disableSelect('rettbemanningRunSchedulerForm','minute');" /><br />

                                    <label for="minute_chooser_choose">Choose</label>
                                    <input type="radio" name="minute_chooser" id="minute_chooser_choose" class="chooser" ${choseMin} value="1" onChange="enableSelect('rettbemanningRunSchedulerForm','minute');" /><br />

                                    <select name="minute" id="minute" multiple="multiple" ${minEnable} style="height:200px;width:120px;">
                                    <option value="0" ${minChecked0} >0</option>
                                    <option value="1" ${minChecked1} >1</option>
                                    <option value="2" ${minChecked2} >2</option>
                                    <option value="3" ${minChecked3} >3</option>
                                    <option value="4" ${minChecked4} >4</option>
                                    <option value="5" ${minChecked5} >5</option>
                                    <option value="6" ${minChecked6}>6</option>
                                    <option value="7" ${minChecked7}>7</option>
                                    <option value="8" ${minChecked8}>8</option>
                                    <option value="9" ${minChecked9}>9</option>
                                    <option value="10" ${minChecked10}>10</option>
                                    <option value="11" ${minChecked11}>11</option>
                                    <option value="12" ${minChecked12}>12</option>
                                    <option value="13" ${minChecked13}>13</option>
                                    <option value="14" ${minChecked14}>14</option>
                                    <option value="15" ${minChecked15}>15</option>
                                    <option value="16" ${minChecked16}>16</option>
                                    <option value="17" ${minChecked17}>17</option>
                                    <option value="18" ${minChecked18}>18</option>
                                    <option value="19" ${minChecked19}>19</option>
                                    <option value="20" ${minChecked20}>20</option>
                                    <option value="21" ${minChecked21}>21</option>
                                    <option value="22" ${minChecked22}>22</option>
                                    <option value="23" ${minChecked23}>23</option>
                                    <option value="24" ${minChecked24}>24</option>
                                    <option value="25" ${minChecked25}>25</option>
                                    <option value="26" ${minChecked26}>26</option>
                                    <option value="27" ${minChecked27}>27</option>
                                    <option value="28" ${minChecked28}>28</option>
                                    <option value="29" ${minChecked29}>29</option>
                                    <option value="30" ${minChecked30}>30</option>
                                    <option value="31" ${minChecked31}>31</option>
                                    <option value="32" ${minChecked32}>32</option>
                                    <option value="33" ${minChecked33}>33</option>
                                    <option value="34" ${minChecked34}>34</option>
                                    <option value="35" ${minChecked35}>35</option>
                                    <option value="36" ${minChecked36}>36</option>
                                    <option value="37" ${minChecked37}>37</option>
                                    <option value="38" ${minChecked38}>38</option>
                                    <option value="39" ${minChecked39}>39</option>
                                    <option value="40" ${minChecked40}>40</option>
                                    <option value="41" ${minChecked41}>41</option>
                                    <option value="42" ${minChecked42}>42</option>
                                    <option value="43" ${minChecked43}>43</option>
                                    <option value="44" ${minChecked44}>44</option>
                                    <option value="45" ${minChecked45}>45</option>
                                    <option value="46" ${minChecked46}>46</option>
                                    <option value="47" ${minChecked47}>47</option>
                                    <option value="48" ${minChecked48}>48</option>
                                    <option value="49" ${minChecked49}>49</option>
                                    <option value="50" ${minChecked50}>50</option>
                                    <option value="51" ${minChecked51}>51</option>
                                    <option value="52" ${minChecked52}>52</option>
                                    <option value="53" ${minChecked53}>53</option>
                                    <option value="54" ${minChecked54}>54</option>
                                    <option value="55" ${minChecked55}>55</option>
                                    <option value="56" ${minChecked56}>56</option>
                                    <option value="57" ${minChecked57}>57</option>
                                    <option value="58" ${minChecked58}>58</option>
                                    <option value="59" ${minChecked59}>59</option>
                                    </select>
                                </div>

                                <div class="box">
                                    <label>Hour</label>
                                    </br>
                                    <label for="hour_chooser_every">Every Hour</label>
                                    <input type="radio" name="hour_chooser" id="hour_chooser_every" class="chooser" value="0" ${everyHr} onChange="disableSelect('rettbemanningRunSchedulerForm','hour');" /><br />

                                    <label for="hour_chooser_choose">Choose</label>
                                    <input type="radio" name="hour_chooser" id="hour_chooser_choose" class="chooser" value="1" ${choseHr} onChange="enableSelect('rettbemanningRunSchedulerForm','hour');" /><br />

                                    <select name="hour" id="hour" multiple="multiple" ${hrEnable} style="height:200px;width:120px;">
                                    <option value="0" ${hrChecked0} >12 Midnight</option>
                                    <option value="1" ${hrChecked1}> 1 AM</option>
                                    <option value="2" ${hrChecked2}>2 AM</option>
                                    <option value="3" ${hrChecked3}>3 AM</option>
                                    <option value="4" ${hrChecked4}>4 AM</option>
                                    <option value="5" ${hrChecked5}>5 AM</option>
                                    <option value="6" ${hrChecked6}>6 AM</option>
                                    <option value="7" ${hrChecked7}>7 AM</option>
                                    <option value="8" ${hrChecked8}>8 AM</option>
                                    <option value="9" ${hrChecked9}>9 AM</option>
                                    <option value="10" ${hrChecked10}>10 AM</option>
                                    <option value="11" ${hrChecked11}>11 AM</option>
                                    <option value="12" ${hrChecked12}>12 Noon</option>
                                    <option value="13" ${hrChecked13}>1 PM</option>
                                    <option value="14" ${hrChecked14}>2 PM</option>
                                    <option value="15" ${hrChecked15}>3 PM</option>
                                    <option value="16" ${hrChecked16}>4 PM</option>
                                    <option value="17" ${hrChecked17}>5 PM</option>
                                    <option value="18" ${hrChecked18}>6 PM</option>
                                    <option value="19" ${hrChecked19}>7 PM</option>
                                    <option value="20" ${hrChecked20}>8 PM</option>
                                    <option value="21" ${hrChecked21}>9 PM</option>
                                    <option value="22" ${hrChecked22}>10 PM</option>
                                    <option value="23"${hrChecked23}>11 PM</option>
                                    </select>
                                    </div>

                                <div class="box">
                                    <label>Day</label>
                                    </br>
                                    <label for="day_chooser_every">Every Day</label>
                                    <input type="radio" name="day_chooser" id="day_chooser_every" class="chooser" value="0" ${everyDay} onChange="disableSelect('rettbemanningRunSchedulerForm','day');" /><br />

                                    <label for="day_chooser_choose">Choose</label>
                                    <input type="radio" name="day_chooser" id="day_chooser_choose" class="chooser" value="1" ${choseDay}  onChange="enableSelect('rettbemanningRunSchedulerForm','day');"/><br />

                                    <select name="day" id="day" multiple="multiple" ${dayEnable} style="height:200px;width:120px;">
                                    <option value="1" ${dayChecked1} >1</option>
                                    <option value="2" ${dayChecked2} >2</option>
                                    <option value="3" ${dayChecked3} >3</option>
                                    <option value="4" ${dayChecked4} >4</option>
                                    <option value="5" ${dayChecked5} >5</option>
                                    <option value="6" ${dayChecked6} >6</option>
                                    <option value="7" ${dayChecked7} >7</option>
                                    <option value="8" ${dayChecked8} >8</option>
                                    <option value="9" ${dayChecked9} >9</option>
                                    <option value="10" ${dayChecked10} >10</option>
                                    <option value="11" ${dayChecked11} >11</option>
                                    <option value="12" ${dayChecked12} >12</option>
                                    <option value="13" ${dayChecked13} >13</option>
                                    <option value="14" ${dayChecked14} >14</option>
                                    <option value="15" ${dayChecked15} >15</option>
                                    <option value="16" ${dayChecked16} >16</option>
                                    <option value="17" ${dayChecked17} >17</option>
                                    <option value="18" ${dayChecked18} >18</option>
                                    <option value="19" ${dayChecked19} >19</option>
                                    <option value="20" ${dayChecked20} >20</option>
                                    <option value="21" ${dayChecked21} >21</option>
                                    <option value="22" ${dayChecked22} >22</option>
                                    <option value="23" ${dayChecked23} >23</option>
                                    <option value="24" ${dayChecked24} >24</option>
                                    <option value="25" ${dayChecked25} >25</option>
                                    <option value="26" ${dayChecked26} >26</option>
                                    <option value="27" ${dayChecked27} >27</option>
                                    <option value="28" ${dayChecked28} >28</option>
                                    <option value="29" ${dayChecked29} >29</option>
                                    <option value="30" ${dayChecked30} >30</option>
                                    </select>
                                 </div>

                                <div class="box">
                                    <label>Month</label>
                                    </br>
                                    <label for="month_chooser_every">Every Month</label>
                                    <input type="radio" name="month_chooser" id="month_chooser_every" class="chooser" value="0" ${everyMonth} onChange="disableSelect('rettbemanningRunSchedulerForm','month');"/><br />

                                    <label for="month_chooser_choose">Choose</label>
                                    <input type="radio" name="month_chooser" id="month_chooser_choose" class="chooser" value="1" ${choseMonth} onChange="enableSelect('rettbemanningRunSchedulerForm','month');" /><br />

                                    <select name="month" id="month" multiple="multiple" ${monthEnable} style="height:200px;width:120px;">
                                    <option value="1" ${monthChecked1}>January</option>
                                    <option value="2" ${monthChecked2}>February</option>
                                    <option value="3" ${monthChecked3}>March</option>
                                    <option value="4" ${monthChecked4}>April</option>
                                    <option value="5" ${monthChecked5}>May</option>
                                    <option value="6" ${monthChecked6}>June</option>
                                    <option value="7" ${monthChecked7}>July</option>
                                    <option value="8" ${monthChecked8}>Augest</option>
                                    <option value="9" ${monthChecked9}>September</option>
                                    <option value="10" ${monthChecked10}>October</option>
                                    <option value="11" ${monthChecked11}>November</option>
                                    <option value="12" ${monthChecked12} >December</option>
                                    </select>
                                </div>

                                <div class="box">
                                    <label>Weekday</label>
                                    </br>
                                    <label for="weekday_chooser_every">Every Weekday</label>
                                    <input type="radio" name="weekday_chooser" id="weekday_chooser_every" class="chooser" ${everyWkDay} value="0"  onChange="disableSelect('rettbemanningRunSchedulerForm','weekday');" /><br />

                                    <label for="weekday_chooser_choose">Choose</label>
                                    <input type="radio" name="weekday_chooser" id="weekday_chooser_choose" class="chooser" ${choseWkDay} value="1" onChange="enableSelect('rettbemanningRunSchedulerForm','weekday');" /><br />

                                    <select name="weekday" id="weekday" multiple="multiple" ${wkDayEnable} style="height:200px;width:120px;">
                                    <option value="1" ${wkDayChecked1} >Sunday</option>
                                    <option value="2" ${wkDayChecked2} >Monday</option>
                                    <option value="3" ${wkDayChecked3} >Tuesday</option>
                                    <option value="4" ${wkDayChecked4} >Wednesday</option>
                                    <option value="5" ${wkDayChecked5} >Thursday</option>
                                    <option value="6" ${wkDayChecked6} >Friday</option>
                                    <option value="7" ${wkDayChecked7} >Saturday</option>
                                    </select>
                                </div>
                            </br>
                            </br>
                            <div>
                                <input style="cursor: pointer"  type = "button" OnClick="runRSSFetch('${HttpFecthSchedulerModel.customerFormat}','${HttpFecthSchedulerModel.clientName}');" value="Fetch Now" onMouseover="showhint('Save configuration, '150px')"/>
                                <input style="cursor: pointer"  type = "button" OnClick="save('rettbemanningRunSchedulerForm');" value="Save"/>
                            </div>
                        </form:form>
        </fieldset>
    </div>

    <form:form name="runSchedulerForm" action="./runScheduler.html" commandName="schedulerForm" method="post">
        <form:input type="hidden" id="clientName" name="clientName" path="clientName" />
        <form:input type="hidden" id="customerFormat" name="customerFormat" path="customerFormat" />
    </form:form>


<%@ include file="template/admin_footer.jsp" %>
