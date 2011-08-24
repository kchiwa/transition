<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge;chrome=1" >
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Welcome to Transition Project</title>
    <link rel="stylesheet" href="css/blueprint/screen.css" type="text/css" media="screen, projection">
    <link rel="stylesheet" href="css/blueprint/print.css" type="text/css" media="print">
    <!--[if lt IE 8]><link rel="stylesheet" href="css/blueprint/ie.css" type="text/css" media="screen, projection"><![endif]-->
    <script type="text/javascript">
        function quickLink(link,choice,restore){
        eval(link+".location='"+choice.options[choice.selectedIndex].value+"'");
        if (restore) choice.selectedIndex=0;
        }
    </script>
</head>
<body>
    <div class="container">
    <div id="header" class="span-24 bgColor last">
            <h1 class="transition"><a class="nodecor" href="./admin_dashboard.html">TRANSITION</a></h1>
    </div>